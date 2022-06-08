package HomeWork_02;


import Utils.Utils;

import java.io.IOException;


public class AverageOfMany {
    public static void main(String[] args) throws IOException {
        System.out.println("press any button to start");
        String line = Utils.giveString();
        int consumption = 0;
        int average;
        int count = 0;
        while(!line.equals("stop")){
            System.out.println("type number to add");
            consumption += Utils.giveInt();
            System.out.println("press any button to continue or stop to calculate");
            line = Utils.giveString();
            count++;
        }
        average = consumption/count;
        System.out.println(average + " is average number");

    }

    }
