package HomeWork_03;
//Создайте массив, содержащий 10 первых нечетных чисел.
//Выведете элементы массива на консоль в одну строку, разделяя запятой.

import java.util.Arrays;

public class ArrayWithOddNumbers {
    public static void main(String[] args) {
        int[]oddNumbers = new int[10];
        for (int i = 0; i < 10; i++)
            oddNumbers[i] = (i * 2) + 1;
        System.out.println(Arrays.toString(oddNumbers));
    }
}
