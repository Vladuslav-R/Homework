package by.minsk.epam.radkevich.homework;

import java.io.File;
import java.io.IOException;

public class TaskFortySeven {
    public static void main (String [] args ) throws IOException {
        String path = "G:\\Java\\Homework\\src\\by\\minsk\\epam\\radkevich\\homework\\data";
        File directli = new File(path);
        if (!directli.exists()) {
            directli.mkdir();
            System.out.println("Folder creation completed successfully ");
        }else {
            System.out.println("A folder with the same name already exists ");
        }

File file = new File("G:\\Java\\Homework\\src\\by\\minsk\\epam\\radkevich\\homework\\data\\imput_task47.txt");

        if(!file.exists()) {
            file.createNewFile();
            System.out.println(file + " creation completed successfully ");
        }else {
            System.out.println("A file with the same name already exists ");
        }

    }
}
