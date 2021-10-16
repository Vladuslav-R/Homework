package by.minsk.epam.radkevich.homework.electricalappliances;

import by.minsk.epam.radkevich.homework.electricalappliances.comfort.Ionizer;
import by.minsk.epam.radkevich.homework.electricalappliances.cooking.CookingDevices;
import by.minsk.epam.radkevich.homework.electricalappliances.cooking.CookingProcessor;
import by.minsk.epam.radkevich.homework.electricalappliances.cooking.MicroWaveOwen;

import java.util.ArrayList;
import java.util.Scanner;

public class ElectricalAppliancesManager {
    public static void main (String[] args) {
        ArrayList<ElectricalAppliances> devices = new ArrayList<ElectricalAppliances>();
        devices.add(new CookingProcessor("Bosch cooking processor", 2000, false));
        devices.add(new MicroWaveOwen("LG micro wave owen", 800, false));
        devices.add(new Ionizer("Philips ionizer", 300, true));

        Scanner in = new Scanner(System.in);

        printMenu();
        int opt = in.nextInt();
        while (opt != 0) {
            if (opt == 1) {
                printCurrentPower(devices);
            }
            if (opt == 2) {
                printListOfDevices(devices);
            }
            if (opt == 3) {
                switchOnAllCookingDevices(devices);
                System.out.println("All cooking devices are switched on");
            }
            printMenu();
            opt = in.nextInt();
        }
    }

    private static void printMenu() {
        System.out.println("Select option: ");
        System.out.println("0 - Exit");
        System.out.println("1 - Get current power");
        System.out.println("2 - Print all devices");
        System.out.println("3 - Cook me all");
    }

    private static void printCurrentPower(ArrayList<ElectricalAppliances> devices) {
        int result = 0;
        if (devices == null || devices.size() == 0) {
            System.out.println("No devices found.");
        }

        for (ElectricalAppliances device : devices ) {
            result += device.getCurrentPower();
        }
        System.out.println("Current power consumption = " + result);
    }

    private  static  void printListOfDevices(ArrayList<ElectricalAppliances> devices) {
        if (devices == null || devices.size() == 0) {
            System.out.println("No devices found.");
            return;
        }

        for (ElectricalAppliances device : devices ) {
            System.out.println(device.getName());
        }
    }

    private static void switchOnAllCookingDevices(ArrayList<ElectricalAppliances> devices) {
        if (devices == null || devices.size() == 0) {
            System.out.println("No devices found.");
            return;
        }

        for (ElectricalAppliances device : devices ) {
            if (device instanceof CookingDevices) {
                CookingDevices cookingDevice = (CookingDevices)device;
                cookingDevice.cook();
            }
        }
    }
}
