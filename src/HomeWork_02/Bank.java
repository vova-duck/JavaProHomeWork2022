package HomeWork_02;

import Utils.Utils;

import java.io.IOException;

public class Bank {
    public static void main(String[] args) throws IOException {
        System.out.println("type how many money you put into deposit");
        int deposit = Utils.giveInt();
        System.out.println("type how many years you'll keep that money on bank account");
        int year = Utils.giveInt();
        System.out.println("type your percentage");
        float percentage  = Utils.giveInt() * 0.01f;
        int finalDeposit;
        for (int i = 1; i < year +1; i++) {
            finalDeposit = (int) (deposit * Math.pow((1+ percentage/12),12));
            deposit = finalDeposit;
            System.out.println("After "+ i +" years your account is " + deposit);
        }
        System.out.println("---------------");
        System.out.println(deposit + " your final deposit");
    }

}
