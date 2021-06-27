package by.minsk.epam.radkevich.homework;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskFortyEight {
    public static void main(String[] args) throws IOException {

        File file = new File("G:\\Java\\Homework\\src\\by\\minsk\\epam\\radkevich\\homework\\data\\output_task48.txt");

        if (!file.exists()) {
            file.createNewFile();
            System.out.println(file + " creation completed successfully ");
        } else {

            System.out.println("A file with the same name already exists ");
        }
        FileWriter fileWriter = new FileWriter(file);
        FileReader fileReader = new FileReader(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(" я родился в 1981 году 10 августа. 10 августа был понедельник.");
        bufferedWriter.flush();

        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String str = bufferedReader.readLine();
        System.out.println(str);




        Pattern pattern =Pattern.compile(("(\\d+)"));
        Matcher matcher = pattern.matcher(str);
        int sum = 0;
        HashSet<Integer> set = new HashSet<Integer>();
        System.out.print("Non-unique values: [");
        String s = "";
        while (matcher.find()) {
            System.out.print(s + matcher.group(1));

            int val = Integer.parseInt(matcher.group(1));
            if (!set.contains(val)) {
                set.add(val);
            }
            sum = sum + Integer.parseInt(matcher.group(1));
            s =  ", ";
        }

        System.out.println("]");
        System.out.println("Sum all (non-unique) = " + sum);
        System.out.println("Unique values: " + set);
        System.out.println("Sum all (unique) = " + set.stream().mapToInt(Integer::intValue).sum());
          bufferedWriter.newLine();
        bufferedWriter.write(String.valueOf(sum));
        bufferedWriter.flush();
        bufferedWriter.close();

    }
}