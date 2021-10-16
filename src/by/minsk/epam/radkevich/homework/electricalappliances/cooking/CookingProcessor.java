package by.minsk.epam.radkevich.homework.electricalappliances.cooking;

public class CookingProcessor extends CookingDevices {


    public CookingProcessor(String name, int powerOfEngine, boolean isPlugged) {
        super(name, powerOfEngine, isPlugged);
    }

    @Override
    public void cook() {
        System.out.println("I am Processor");
        super.cook();
    }
}
