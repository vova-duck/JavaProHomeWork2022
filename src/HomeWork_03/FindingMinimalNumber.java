package HomeWork_03;

import Utils.Utils;
//Дан массив размерности N, найти наименьший элемент массива и вывести на консоль
// (массив заполнить случайными числами из диапазона 0 .. 100)
public class FindingMinimalNumber {
    public static void main(String[] args) {

        int[] numbers = new int [10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Utils.getRandomNumber(1,100);
            System.out.print(numbers[i]+ " ");
        }
        int min = numbers[0];
        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        System.out.println();
        System.out.println(min + " is minimal number in array");

    }
}
