package by.minsk.epam.radkevich.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Task53 implements Runnable{
    Thread t;
    String name;

    Task53(String threadname) {
        name= threadname;
        t = new Thread(this, name);
        System.out.println("New thread" + " "+ t);
        t.start();
    }

    public void run() {
        Integer max= 0;
        List<Integer> values = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            values.add(ThreadLocalRandom.current().nextInt(1, 11));

        }

        System.out.println(name + " " +  "max vallue" + "  " +  Collections.max(values));
        System.out.println(name + " "+ "tread complite.");

    }
}

class MultiThread2 {
    public static void main(String args[]) throws InterruptedException {

        new Task53("Thread One ");
        new Task53("Thread Two");
        new Task53("Thread Tree");
        new Task53("Thread Four");
        new Task53("Thread Five");
        new Task53("Thread Six");
        new Task53("Thread Seven");
        new Task53("Thread Eight");
        new Task53("Thread Nine");
        new Task53("Thread Ten");

        Thread.sleep(10000);
        System.out.println("All treads complited");
    }
}






