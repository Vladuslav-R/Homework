package by.minsk.epam.radkevich.homework.vechicle;

import java.util.ArrayList;
import java.util.List;

public class GarageManager {
    public static void main(String[] args) {
        Garage<Vehicle> garage = new Garage<Vehicle>();


            garage.addTransport(new Car("Toyota", "Gas", 2000, 1600, Color.RED, 4));
            garage.addTransport(new Motorcycle("Yamaha", "Gas", 750, 250, Color.WHITE, 2));

            garage.print();
        }
    }
