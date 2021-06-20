package by.minsk.epam.radkevich.homework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class TaskFortyOne {

    public static void main(String[] args) {
        List<Integer> students = new ArrayList<>(20);
        for (int i = 0; i < 20; i++) {
            students.add(ThreadLocalRandom.current().nextInt(1, 11));
        }
        System.out.println(students);

        Integer max = 0;
        for (int i = 0; i < 20; i++) {
            if (students.get(i).compareTo(max) == 1) {
                max = students.get(i);
            }


        }
        System.out.println(max);


    }

}