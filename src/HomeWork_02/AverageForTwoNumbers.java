package HomeWork_02;

/*
Программа, которая находит среднее арифметическое значение двух чисел.
*/

import Utils.Utils;

import java.io.IOException;

public class AverageForTwoNumbers {
    public static void main(String[] args) throws IOException {
        System.out.println("type any int number");
        int a = Utils.giveInt();
        System.out.println("type second any int number");
        int b = Utils.giveInt();
        float c = (a + b)/ 2f;
        System.out.println(c + " is average number of "+ a +" and "+ b);

    }

}
