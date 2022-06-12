package Utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Utils {
    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


    public Utils(){

    }
    public static String giveString() throws IOException {
        return reader.readLine();
    }
    public static int giveInt() throws  IOException {
        return Integer.parseInt(reader.readLine());
    }
    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
}
