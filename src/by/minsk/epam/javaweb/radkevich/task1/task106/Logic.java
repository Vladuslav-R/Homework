package by.minsk.epam.javaweb.radkevich.task1.task106;

public class Logic {

    public static int howMuchHoursHasPassed(int numberOfSecondsElapsed) {
        int hour = (numberOfSecondsElapsed / 60 / 60);

        return hour;
    }

    public static int howMuchMinutesHasPassed(int numberOfSecondsElapsed) {
        int hour = howMuchHoursHasPassed(numberOfSecondsElapsed);
        int minutes = ((numberOfSecondsElapsed - (hour * 60 * 60)) / 60);

        return minutes;


    }

    public static int howMuchSecondsHasPassed(int numberOfSecondsElapsed) {
        int hour = howMuchHoursHasPassed(numberOfSecondsElapsed);
        int minutes = howMuchMinutesHasPassed(numberOfSecondsElapsed);

        int seconds = numberOfSecondsElapsed - (hour * 60 * 60 + (minutes * 60));


        return seconds;

    }


}
