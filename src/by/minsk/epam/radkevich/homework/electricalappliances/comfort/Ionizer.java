package by.minsk.epam.radkevich.homework.electricalappliances.comfort;

public class Ionizer extends ComfortDevices {
    public Ionizer(String name, int powerOfEngine, boolean isPlugged) {
        super(name, powerOfEngine, isPlugged);
    }

    @Override
    public void MakeMeHappy() {
        System.out.println("I am Ionizer.");
        super.MakeMeHappy();
    }
}
