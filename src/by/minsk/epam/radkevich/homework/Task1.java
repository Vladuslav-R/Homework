package by.minsk.epam.radkevich.homework;

import java.util.concurrent.ThreadLocalRandom;

public class Task1 {
    public static void main (String [] args) {
        int x =ThreadLocalRandom.current().nextInt(-300, 300);
        int y =ThreadLocalRandom.current().nextInt(-300, 300);
        int z =ThreadLocalRandom.current().nextInt(-300, 300);
        double avr = (x+y+z)/3d;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
      if (x>z) {
          System.out.println("Sum = " +  x + y);
      }else {
          System.out.println("Arithmetic mean =  " + avr);
          }
      }
    }

