package by.minsk.epam.javaweb.radkevich.task1.task106;

import by.minsk.epam.radkevich.utils.EnterValue;



public class Runner {
    // 6.	Идет n-я секунда суток, определить, сколько полных часов,
    // полных минут и секунд прошло к этому моменту.
    public static void main(String[] args) {
        int time = EnterValue.enterBoundedInt("Enter how many seconds have passed ", 0, 86400);


      System.out.println(Logic.howMuchHoursHasPassed(time) + " hour " + Logic.howMuchMinutesHasPassed(time) + " minutes "
              + Logic.howMuchSecondsHasPassed(time)+ " seconds passed");
    }
}