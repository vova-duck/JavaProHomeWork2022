package HomeWork_02;


import Utils.Utils;

import java.io.IOException;

//2. Программа, которая находит среднее арифметическое значение произвольного количества чисел.

public class AverageOfMany {
    public static void main(String[] args) throws IOException {
        int sum = 0;
        int count = 0;
        String input = "line";
        while (!input.equals("")){
            System.out.println("type numbers to add or push ENTER to calculate");
            try{sum+=Integer.parseInt(input = Utils.typeString());
                count++;
            }
            catch (NumberFormatException wft){
                System.out.println("type number instead String:)");}
        }
        System.out.println( sum/count + " is your average");
    }
}

