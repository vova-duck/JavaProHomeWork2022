package HomeWork_03;
//Дано число n при помощи цикла while посчитать факториал n!

import Utils.Utils;
//Дано число n при помощи цикла While посчитать факториал n!
import java.io.IOException;

public class FactorialWhile {
    public static void main(String[] args) throws IOException {
        System.out.println("type number to calculate factorial");
        int n = Utils.typeInt();
        int result = 1;
        int count = 1;
        while (count != n+1){
            result = result * count;
            count++;
        }
        System.out.println(result +" is factorial from "+n );
    }
}
