package by.minsk.epam.radkevich.homework.vechicle;

public class Vehicle {


    String name;
    String engineType;
    int engineVolume;
    int weight;
    Color color;
    int numberOfWheels;

    public Vehicle(String name, String engineType, int engineVolume, int weight, Color color, int numberOfWheels) {
        this.name = name;
        this.engineType = engineType;
        this.engineVolume = engineVolume;
        this.weight = weight;
        this.color = color;
        this.numberOfWheels = numberOfWheels;
    }

    @Override
    public String toString() {
        return "Vehicle name='" + name + "'";
    }
}