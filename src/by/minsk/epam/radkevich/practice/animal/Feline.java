package by.minsk.epam.radkevich.practice.animal;

public class Feline extends Mammals {
    int meatQuantity = 0;


    public Feline(String name, int weight, int size) {
        super(name, weight, size);
    }

    public void eatMeat(int meat) {
        meatQuantity = meat / (weight * 2);

    }

    @Override
    public void move() {
        System.out.println("топ топ топ топ");
    }
}
