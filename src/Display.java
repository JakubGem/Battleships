import java.util.ArrayList;
import java.util.List;

public class Display {
    Square square;

    public static void mainMenu(){

    }

    public static void manualPlacement(){

    }

    public static void displayBoard(Board board){
        String boardString = "   ";
        String[] columnHeader = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O"};
        int[] rowHeader = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        for (String abc : columnHeader){
            boardString += abc + "  ";
        }
        boardString += "\n";
        boardString += "  _____________________________________________\n";
        for (int j = 0; j < board.ocean.toArray().length; j++) {
            if (j<9) {
                boardString += rowHeader[j] + " |";
            }else {
                boardString += rowHeader[j] + "|";
            }
            for (int i = 0; i < board.ocean.toArray().length; i++) {
                boardString += " * ";
            }
            boardString += "\n";
        }
        System.out.println(boardString);
        BoardFactory.randomPlacement(board);

    }

    public static void displayWinner(int winner){

    }

}
