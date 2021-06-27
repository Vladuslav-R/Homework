package by.minsk.epam.radkevich.homework;

import java.io.File;
import java.io.IOException;

public class TaskFortySix {

    public static void main(String[] args) throws IOException {
        String path = "G:\\Java\\Homework\\src\\by\\minsk\\epam\\radkevich\\homework\\data";
        File file = new File(path);

        System.out.println(file.getName());
        listDirectory(file, 1);
    }

    private static void listDirectory(File directory, int level) {
        for (File file : directory.listFiles()) {
            for (int i = 0; i < level; i++)
                System.out.print("  ");
            System.out.println(file.getName());
            if (file.isDirectory())
                listDirectory(file, level + 1);
        }
    }
}




