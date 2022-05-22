package chapterEight;

import java.util.*;
public class TicTacToe {

    static ArrayList<Integer> humanPosition = new ArrayList<Integer>();
    static ArrayList<Integer> computerPosition = new ArrayList<Integer>();
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        char[][] gameBoard = {{' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '}};

        printOutBoard(gameBoard);

        while (true){
            System.out.println("Enter your position(1-9): ");
            int human = input.nextInt();
            while (humanPosition.contains(human) || computerPosition.contains(human)){
                System.out.println("Occupied! Enter another number:");
                human = input.nextInt();
            }

            location(gameBoard, human, "Human Player");
            String result = confirmWinner();
            if (result.length() > 0) {
                System.out.println(result);
                break;
            }

            Random random = new Random();
            int computer = 1 + random.nextInt(9);
            while (computerPosition.contains(computer) || humanPosition.contains(computer)){
                computer = 1 + random.nextInt(9);
            }

            location(gameBoard, computer, "Computer Player");

            printOutBoard(gameBoard);

            result = confirmWinner();
            if (result.length() > 0) {
                System.out.println(result);
                break;
            }

        }


    }


    private static void printOutBoard(char[][] gameBoard){
        for(char[] row : gameBoard) {
            for (char column : row) {
                System.out.print(column);
            }
            System.out.println();
        }
    }

    public static void location(char[][] gameBoard, int position, String user){
        char moves = ' ';
        if (user.equals("Human Player")){
            moves = 'X';
            humanPosition.add(position);
        } else if (user.equals("Computer Player")) {
            moves = 'O';
            computerPosition.add(position);
        }

        switch (position) {
                case 1 -> gameBoard[0][0] = moves;
                case 2 -> gameBoard[0][2] = moves;
                case 3 -> gameBoard[0][4] = moves;
                case 4 -> gameBoard[2][0] = moves;
                case 5 -> gameBoard[2][2] = moves;
                case 6 -> gameBoard[2][4] = moves;
                case 7 -> gameBoard[4][0] = moves;
                case 8 -> gameBoard[4][2] = moves;
                case 9 -> gameBoard[4][4] = moves;
                default -> {
                }
            }


    }

    public static String confirmWinner(){

        List topRow = Arrays.asList(1, 2, 3);
        List middleRow = Arrays.asList(4, 5, 6);
        List bottomRow = Arrays.asList(7, 8, 9);
        List leftColumn = Arrays.asList(1, 4, 7);
        List middleColumn = Arrays.asList(2, 5, 8);
        List rightColumn = Arrays.asList(3, 6, 9);
        List leftDiagonal = Arrays.asList(1, 5, 9);
        List rightDiagonal = Arrays.asList(3, 5, 7);

        List<List> winning = new ArrayList<List>();
        winning.add (topRow);
        winning.add (middleRow);
        winning.add (bottomRow);
        winning.add (leftColumn);
        winning.add (middleColumn);
        winning.add (rightColumn);
        winning.add (leftDiagonal);
        winning.add (rightDiagonal);

        for (List list : winning){
            if (humanPosition.containsAll(list)){
                return "Congratulations! You won.";
            } else if (computerPosition.containsAll(list)) {
                return "Oops! Computer won.";
            } else if (humanPosition.size() + computerPosition.size() == 9) {
                return "It is a draw!";
            }
        }


        return "";
    }
}
