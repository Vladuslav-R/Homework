package by.minsk.epam.radkevich.practice.animal;

public class AnimalHoume extends Feline {
    public AnimalHoume(String name, int weight, int size) {
        super(name, weight, size);
    }

    public static void main(String[] args) {
        Feline Cat = new Feline("Ostap", 10, 100);

        Cat.breathe();
        Cat.move();
        Cat.drinkMilk(100);
        Cat.eatMeat(300);
        System.out.println("Коту хватит молока на" + " "+ Cat.milkQuantity + " дней");
        System.out.println("Коту хватит мяса на" + " "+ Cat.meatQuantity + " дней");
    }
}