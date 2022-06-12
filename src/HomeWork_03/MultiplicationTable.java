package HomeWork_03;
//Необходимо вывести на экран таблицу умножения на Х (х любое число в диапазоне 0 .. 10)
import Utils.Utils;

import java.io.IOException;

public class MultiplicationTable {
    public static void main(String[] args) throws IOException {
        System.out.println("type number to get multiplication table");
        int number = Utils.giveInt();
        for (int i = 0; i <= 10; i++) {
            System.out.println(number+" * "+ i +" = "+ (number*i));

        }
    }
}
