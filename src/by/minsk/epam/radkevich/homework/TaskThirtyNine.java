package by.minsk.epam.radkevich.homework;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class TaskThirtyNine {


    public static void main(String[] args) {
        List<Integer> studient = new ArrayList();

        for (int i = 0; i < 10; i++) {
            studient.add(ThreadLocalRandom.current().nextInt(1, 10));


        }
        System.out.println("Grades before sorting" + " " + studient);
        studient.removeIf(i -> (i < 4));
        System.out.println("Grades after sorting" + " " + studient);

    }


}


