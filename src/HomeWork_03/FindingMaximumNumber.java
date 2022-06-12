package HomeWork_03;

import Utils.Utils;

import java.util.Arrays;

public class FindingMaximumNumber {
    public static void main(String[] args) {

        int[] numbers = new int [10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Utils.getRandomNumber(1,100);

        }
        int max = numbers[0];
        int countMax= 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]>max){
                max = numbers[i];
                countMax= i;
            }
        }
        int min = numbers[0];
        int countMin = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]<min){
                min = numbers[i];
                countMin = i;
            }
        }
        System.out.println(Arrays.toString(numbers)+ " original array");
        numbers[countMin]= max;
        numbers[countMax]= min;
        System.out.println(Arrays.toString(numbers)+ " array after exchange");

    }
}
