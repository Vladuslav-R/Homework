package by.minsk.epam.radkevich.homework.car;
import static java.util.stream.Collectors.toList;

public class Car {
   String name;
   CarModel carModel;
   int engineCapacity;

    public Car(String name, CarModel carModel, int engineCapacity) {
        this.name = name;
        this.carModel = carModel;
        this.engineCapacity = engineCapacity;
    }
}

