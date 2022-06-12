package HomeWork_03;

import Utils.Utils;
//Поменять наибольший и наименьший элементы массива местами.
//Пример: дан массив {4, -5, 0, 6, 8}. После замены будет выглядеть {4, 8, 0, 6, -5}.
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

