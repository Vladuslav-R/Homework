package by.minsk.epam.radkevich.homework.electricalappliances.comfort;

import by.minsk.epam.radkevich.homework.electricalappliances.ElectricalAppliances;

public class ComfortDevices extends ElectricalAppliances {
    public ComfortDevices(String name, int powerOfEngine, boolean isPlugged) {
        super(name, powerOfEngine, isPlugged);
    }

    public void MakeMeHappy() {
        plug();
        System.out.println("Enjoy!");
    }
}
