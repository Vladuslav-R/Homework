package by.minsk.epam.radkevich.homework.vechicle;

import java.util.ArrayList;

public class Garage <T extends Vehicle> {
    private ArrayList<T> transports = new ArrayList<>();

    public void addTransport(T transport) {
        transports.add(transport);
    }

    public void print() {
        for (T transport: transports) {
            System.out.println(transport.name);
        }
    }
}
