package HomeWork_03;
//Даны переменные x и n вычислить x^n.
import Utils.Utils;

import java.io.IOException;

public class Degree {
    public static void main(String[] args) throws IOException {
        System.out.println("type number");
        double a = Utils.giveInt();
        System.out.println("Type degree to get number at ");
        double b = Utils.giveInt();
        System.out.println(Math.pow(a, b)+" is "+ a +" in "+ b +" degree");
    }
}
