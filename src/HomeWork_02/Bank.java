package HomeWork_02;
//3. Программу, которая предлагает пользователю ввести сумму денежного вклада в гривнах, процент годовых,
// которые выплачивает банк, длительность вклада (лет).
// Вывести накопленную сумму денег за каждый год и начисленные проценты.
// (проценты сложные с капитализацией каждый месяц)

import Utils.Utils;

import java.io.IOException;

public class Bank {
    public static void main(String[] args) throws IOException {
        System.out.println("type how many money you put into deposit");
        double deposit = Utils.giveInt();
        System.out.println("type how many years you'll keep that money on bank account");
        int depositYears = Utils.giveInt();
        int monthsInTheYear = 12;
        System.out.println("type your percentage");
        float percentage  = Utils.giveInt() * 0.01f;
        double finalDeposit;
        for (int i = 1; i < depositYears +1; i++) {
            finalDeposit =  (deposit * Math.pow((1+ percentage/monthsInTheYear),monthsInTheYear));
            deposit =  finalDeposit;
            System.out.println("After "+ i +" years your account is " + deposit);
        }
        System.out.println("---------------");
        System.out.println(deposit + " your final deposit");
    }

}
