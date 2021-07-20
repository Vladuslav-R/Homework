package by.minsk.epam.radkevich.homework;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class MergeSortedLists {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            list1.add(ThreadLocalRandom.current().nextInt(0, 30));
            list2.add(ThreadLocalRandom.current().nextInt(0, 25));
        }

        Collections.sort(list1);
        Collections.sort(list2);
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(merge(list1, list2));
    }

    public static List merge(List<Integer> a, List<Integer> b) {
        int aIndex = 0;
        int bIndex = 0;

        List<Integer> result = new ArrayList<>();

        while (aIndex < a.size() || bIndex < b.size()) {
            if (bIndex < b.size() && a.get(aIndex) > b.get(bIndex)) {
                result.add(b.get(bIndex++));
            } else if (aIndex < a.size()) {
                result.add(a.get(aIndex++));
            } else {
                result.add(b.get(bIndex++));
            }
        }
        return result;
    }
}