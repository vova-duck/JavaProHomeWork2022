package HomeWork_03;
//При помощи цикла while вывести на экран нечетные числа от 1 до 99.

public class WhileFrom1to99 {
    public static void main(String[] args) {
        int count = 0;
        while(count !=100){
            if(count%10 ==0){
                System.out.println();
            }
            if(count%2!= 0){
                System.out.print(count + " ");}
            count++;
        }
    }
}
