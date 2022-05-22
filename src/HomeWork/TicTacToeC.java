package HomeWork;


public class TicTacToeC {

public enum CellValue {X, O, EMPTY};
    private CellValue[][] board;

    public TicTacToeC( ) {
        board = new CellValue[3][3];
        for (int row = 0; row < board.length; row++){
            for (int column = 0; column < board[row].length; column++){
                board[row][column] = CellValue.EMPTY;
            }
        }

    }


    public String toString() {
        String result = "";
        for (CellValue[] row : board){
            for (CellValue column : row){
                if (column == CellValue.EMPTY)
                    result += " ";
                else
                result += column;
            }
            result += "\n";
        }
        return result;
    }

    public void setCellValue(int row, int column, CellValue element){
        board[row][column] = element;
    }
}





