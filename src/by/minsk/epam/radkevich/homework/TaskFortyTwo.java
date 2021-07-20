package by.minsk.epam.radkevich.homework;

import java.util.*;

public class TaskFortyTwo {
    public static void main(String[] args) {
        String message = enterString("enter a sentence");
        String search = enterString("enter key");

        String[] words = message.toLowerCase().replaceAll("[-.?!)(,:]", "").split("\\s");

        Map<String, Integer> counterMap = new HashMap<>();
        for (String word : words) {
            if (!word.isEmpty()) {
                Integer count = counterMap.get(word);
                if (count == null) {
                    count = 0;
                }
                counterMap.put(word, ++count);
            }
        }

        System.out.println(search + ": " + (counterMap.containsKey(search) ? counterMap.get(search) : 0));


    }
    public static String enterString(String message) {
        System.out.println(message);
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }


}