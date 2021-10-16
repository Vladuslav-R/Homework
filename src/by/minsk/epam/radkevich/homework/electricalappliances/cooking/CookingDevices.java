package by.minsk.epam.radkevich.homework.electricalappliances.cooking;

import by.minsk.epam.radkevich.homework.electricalappliances.ElectricalAppliances;

public class CookingDevices extends ElectricalAppliances {

    public CookingDevices(String name, int powerOfEngine, boolean isPlugged) {
        super(name, powerOfEngine, isPlugged);
    }

    public void cook() {
        plug();
        System.out.println("I am cooking");
    }
}
