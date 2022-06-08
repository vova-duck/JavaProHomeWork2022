package HomeWork_02;


import Utils.Utils;

import java.io.IOException;
import java.util.ArrayList;


public class AverageOfMany {
    public static void main(String[] args) throws IOException {
        System.out.println("type how many numbers you need to get average number from");
        int numberCount = Utils.giveInt();
        int[]numbers = new int[numberCount];
        int consumption = 0;
        for (int i = 0; i < numberCount; i++) {
            System.out.println("type  number" );
           try {
               numbers[i]=Utils.giveInt();
           }catch (NumberFormatException ttr){
               System.out.println("you did mistake put number");
               numbers[i]=Utils.giveInt();
           }
        }
        for (int i = 0; i < numberCount; i++) {
            consumption+=numbers[i];
        }
        System.out.println("average is " + consumption/numberCount);

    }}

