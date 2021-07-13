package by.minsk.epam.radkevich.homework.car;

import by.minsk.epam.radkevich.utils.Writer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

public class Garage {
    public static void main  (String [] args ){
        List<Car> cars = new ArrayList<Car>();
        String [] carName = {"Meren", "Jiga", "BMW", "Ford"};
        for (int i=0; i<10;i++) {
            cars.add(new Car(carName[ThreadLocalRandom.current().nextInt(0, 3)],CarModel.values()[ThreadLocalRandom.current().nextInt(0, 2)],ThreadLocalRandom.current().nextInt(1, 3)));

        }

        Map<Integer, List<Car>> map = cars.stream()
                .collect(Collectors.groupingBy(car -> car.engineCapacity));

        boolean first = true;
        for (Car car : map.get(2)) {
            System.out.println(car.name + ":" + car.carModel + ":" + car.engineCapacity);
            try {
                if (first) {
                    Writer.writeNew("G:\\Java\\Homework\\src\\by\\minsk\\epam\\radkevich\\homework\\data\\output_77.txt", car.name + ":" + car.carModel + ":" + car.engineCapacity + "\n");
                    first = false;
                } else {
                    Writer.writeAppend("G:\\Java\\Homework\\src\\by\\minsk\\epam\\radkevich\\homework\\data\\output_77.txt", car.name + ":" + car.carModel + ":" + car.engineCapacity + "\n");
                }
            } catch (IOException ex) {
                System.out.println("Something went wrong.");
            }
        }
    }


}
