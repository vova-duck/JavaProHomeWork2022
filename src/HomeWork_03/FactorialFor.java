package HomeWork_03;

import Utils.Utils;

import java.io.IOException;

//Дано число n при помощи цикла for посчитать факториал n!
public class FactorialFor {
    public static void main(String[] args) throws IOException {
        System.out.println("type number for calculating factorial");
        int n = Utils.typeInt();
        int result = 1;
        for (int i =1; i < n+1; i++) {
            result =result * i;

        }
        System.out.println(result +" is factorial from "+n );
    }

}
