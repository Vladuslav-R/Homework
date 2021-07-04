package by.minsk.epam.radkevich.homework;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;

public class Task54 implements Runnable {

    Thread t;
    String name;
    String path = "G:\\Java\\Homework\\src\\by\\minsk\\epam\\radkevich\\homework\\data\\output_task54.txt";

    Task54(String threadname) {
        name = threadname;
        t = new Thread(this, name);
        System.out.println("New thread" + " " + t);
        t.start();
    }



    synchronized  public void run() {


        int value = ThreadLocalRandom.current().nextInt(1, 11);

        File file = new File(path);
        try (FileWriter fileWriter = new FileWriter(file, true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write(String.valueOf(value));
            bufferedWriter.newLine();
        } catch (IOException e) {
            throw new RuntimeException("Ups, failed to write into file: " + path, e);

        }
    }
}

     class Multivol {
    public static void main(String args[]) throws InterruptedException {

        new Task54("Thread One ");
        new Task54("Thread Two");
        new Task54("Thread Tree");
        new Task54("Thread Four");
        new Task54("Thread Five");
        new Task54("Thread Six");
        new Task54("Thread Seven");
        new Task54("Thread Eight");
        new Task54("Thread Nine");
        new Task54("Thread Ten");

        Thread.sleep(10000);
        System.out.println("All treads complited");
    }

}




