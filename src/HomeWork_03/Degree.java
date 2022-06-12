package HomeWork_03;
//Даны переменные x и n вычислить x^n.
import Utils.Utils;

import java.io.IOException;
//Даны переменные x и n вычислить x^n.
public class Degree {
    public static void main(String[] args) throws IOException {
        System.out.println("type number");
        double a = Utils.typeInt();
        System.out.println("Type degree to get number at ");
        double b = Utils.typeInt();
        System.out.println(Math.pow(a, b)+" is "+ a +" in "+ b +" degree");
        // added custom way to bring to degree
        double answer = 1;
        for (int i = 0; i < b; i++) {
            answer *=a;
        }
        System.out.println(answer + " is "+ a +" in "+ b +" degree. Custom way.");
    }
}
