package by.minsk.epam.radkevich.homework;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;


public class Task52 implements Runnable {
    Thread t;
    String name;

    Task52(String threadname) {
        name= threadname;
        t = new Thread(this, name);
        System.out.println("New thread" + " "+ t);
        t.start();
    }

    public void run() {
        Integer sum= 0;
        List<Integer> values = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            values.add(ThreadLocalRandom.current().nextInt(1, 11));
        }
        for (int i = 0; i < 10; i++) {
            sum += values.get(i);
        }
        System.out.println(name + " " +  sum/values.size());
        System.out.println(name + " "+ "tread complite.");

    }
}

class MultiThread2 {
    public static void main(String args[]) throws InterruptedException {

        new Task52("Thread One");
        new Task52("Thread Two");
        new Task52("Thread Tree");
        new Task52("Thread Four");
        new Task52("Thread Five");
        new Task52("Thread Six");
        new Task52("Thread Seven");
        new Task52("Thread Eight");
        new Task52("Thread Nine");
        new Task52("Thread Ten");

        Thread.sleep(10000);
        System.out.println("All treads complited");
    }
}



