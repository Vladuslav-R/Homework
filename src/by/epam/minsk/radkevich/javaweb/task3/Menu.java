package by.epam.minsk.radkevich.javaweb.task3;

import by.epam.minsk.radkevich.javaweb.task3.Array;
import by.epam.minsk.radkevich.javaweb.task3.Logic;
import by.utils.EnterValue;

public class Menu {


    public static Array arrayInputMethod (int x){
        Array array1 = new Array();

        x= EnterValue.enterIntWithoutString();
        switch (x) {
            case  (1):
                array1.setArray(Logic.inputArray(EnterValue.enterIntWithoutString()));
                break;
            case (2):
                array1.setArray(Logic.generateArray());
                break;

            default:
                System.out.println("К такому жизнь меня не готовила");
                break;
        } return array1;
    }
}
