package by.minsk.epam.radkevich.practice.vechicle;

import java.util.Comparator;
import java.util.concurrent.ThreadLocalRandom;

public class GarageManager {
    public static void main(String[] args) {
        String[] name = {"Lada", "Mers", "BMW", "Volkswagen"};
        Garage<Vehicle> garage = new Garage<Vehicle>();
        for (int i = 0; i < 3; ++i) {
            garage.addTransport(new Car(name[ThreadLocalRandom.current().nextInt(0, 3)], "Gas", ThreadLocalRandom.current().nextInt(1000, 3000), 1600, CarModel.HATCHBACK, 4));
            garage.addTransport(new Car(name[ThreadLocalRandom.current().nextInt(0, 3)], "Gas", ThreadLocalRandom.current().nextInt(1000, 3000), 1600, CarModel.SEDAN, 4));
            garage.addTransport(new Car(name[ThreadLocalRandom.current().nextInt(0, 3)], "Gas", ThreadLocalRandom.current().nextInt(1000, 3000), 1600, CarModel.WAGON, 4));
        }
        Comparator<Vehicle> widthComparator = new Comparator<Vehicle>() {
            @Override
            public int compare(Vehicle o1, Vehicle o2) {
                return o1.;
            }
//
//            }
//        };




            garage.print();

    }
}