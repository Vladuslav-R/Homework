package by.minsk.epam.radkevich.practice.vechicle;

public class Vehicle {


    String name;
    String engineType;
    int engineVolume;
    int weight;
    CarModel carModel;
    int numberOfWheels;

    public Vehicle(String name, String engineType, int engineVolume, int weight, CarModel carModel, int numberOfWheels) {
        this.name = name;
        this.engineType = engineType;
        this.engineVolume = engineVolume;
        this.weight = weight;
        this.carModel = carModel;
        this.numberOfWheels = numberOfWheels;
    }

    @Override
    public String toString() {
        return "Vehicle name='" + name + "'";
    }
}