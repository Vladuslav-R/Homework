package by.minsk.epam.radkevich.practice.electricalappliances.cooking;

public class MicroWaveOwen  extends CookingDevices {
    public MicroWaveOwen(String name, int powerOfEngine, boolean isPlugged) {
        super(name, powerOfEngine, isPlugged);
    }

    @Override
    public void cook() {
        System.out.println("I am owen.");
        super.cook();
    }
}
