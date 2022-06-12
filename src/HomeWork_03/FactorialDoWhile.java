package HomeWork_03;

import Utils.Utils;
//Дано число n при помощи цикла DoWhile посчитать факториал n!
import java.io.IOException;

public class FactorialDoWhile {
    public static void main(String[] args) throws IOException {
        System.out.println("type number to calculate factorial");
        int n = Utils.typeInt();
        int result = 1;
        int count = 1;

        do{
            result = result * count;
            count++;
        }while (count != n+1);
        System.out.println(result +" is factorial from " + n);
    }
}
