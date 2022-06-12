package HomeWork_03;

import Utils.Utils;

public class ExchangeMinimumAndMaximum {
    public static void main(String[] args) {
        int[] numbers = new int [10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Utils.getRandomNumber(1,100);
            System.out.print(numbers[i]+ " ");
        }
        int max = numbers[0];
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        System.out.println();
        System.out.println(max + " is maximal number in array");

    }
    }

