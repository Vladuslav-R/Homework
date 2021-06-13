package by.minsk.epam.radkevich.practice.animal;

public abstract class Animal {
    protected String name;
    protected int weight;
    protected int size;

    public abstract void move();

    public void breathe() {
        System.out.println("Oh my God!!! I'm breathing");
    }


    public Animal(String name, int weight, int size) {
        this.name = name;
        this.weight = weight;
        this.size = size;


    }
}
