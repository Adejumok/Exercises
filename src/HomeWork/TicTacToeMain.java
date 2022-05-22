package HomeWork;

public class TicTacToeMain {
    public static void main(String[] args) {
        TicTacToeC ticTacToeC = new TicTacToeC();
        System.out.println(ticTacToeC);

        ticTacToeC.setCellValue(1, 1, TicTacToeC.CellValue.X);
        System.out.println(ticTacToeC);


    }
}
