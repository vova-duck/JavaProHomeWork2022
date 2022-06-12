package HomeWork_03;
//Вывести на экран шахматную доску 8х8 в виде 2 мерного массива (W - белые клетки , B - черные клети)
public class ChessSheet {
    public static void main(String[] args) {
        char white = 'w';
        char black = 'b';
        for (int i = 0; i < 8; i++) {
            System.out.println();
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(black+ " ");
                }else {
                    System.out.print(white+ " ");
                }
            }
        }
    }
}
