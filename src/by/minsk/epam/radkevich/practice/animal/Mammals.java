package by.minsk.epam.radkevich.practice.animal;

public abstract class Mammals extends Animal {
    public Mammals(String name, int weight, int size) {
        super(name, weight, size);}

    int milkQuantity = 0;

    @Override
    public void move() {

    }

    public void drinkMilk (int milk) {
    milkQuantity = milk /(weight*1);
    }

}

