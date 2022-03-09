
import java.util.List;

public class Display {
    AnsiColors ansiColors = new AnsiColors();


    public static void mainMenu(){

    }

    public static void manualPlacement(){

    }

    public void displayBoard(Board board){
        String boardString = "   " + ansiColors.ANSI_PURPLE_BACKGROUND+ ansiColors.ANSI_BLACK + "_";
        String[] columnHeader = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O"};
        int[] rowHeader = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        for (String abc : columnHeader){
            boardString += abc + "__";
        }
        boardString = boardString.substring(0, boardString.length() - 1);
        boardString += ansiColors.ANSI_RESET + "\n";
        for (int col = 0; col < board.ocean.toArray().length; col++) {
            if (col<9) {
                boardString += ansiColors.ANSI_CYAN_BACKGROUND + ansiColors.ANSI_BLACK + rowHeader[col] + " |" + ansiColors.ANSI_RESET;
            }else {
                boardString += ansiColors.ANSI_CYAN_BACKGROUND + ansiColors.ANSI_BLACK + rowHeader[col] + "|" + ansiColors.ANSI_RESET;
            }
            for (int row = 0; row < board.ocean.toArray().length; row++) {
                if (board.ocean.get(col).get(row).getStatusSquare().equals("S")){                      //jeśli jest statek
                    boardString += ansiColors.ANSI_BLACK_BACKGROUND + "   "  + ansiColors.ANSI_RESET;
                }else if (board.ocean.get(col).get(row).getStatusSquare().equals("H")){                //jeśli statek częściowo jest podbity
                    boardString += ansiColors.ANSI_BLACK_BACKGROUND + ansiColors.ANSI_RED + " ● "  + ansiColors.ANSI_RESET;
                }else if (board.ocean.get(col).get(row).getStatusSquare().equals("D")){                //jeśli statek jest cały zniszczony
                    boardString += ansiColors.ANSI_BLACK_BACKGROUND + ansiColors.ANSI_RED + " X "  + ansiColors.ANSI_RESET;
                }else if (board.ocean.get(col).get(row).getStatusSquare().equals("M")){                //jeśli był strzał w puste miejsce
                    boardString += ansiColors.ANSI_WHITE_BACKGROUND + ansiColors.ANSI_RED + " ● "  + ansiColors.ANSI_RESET;
                }else {                     //jeśli jest puste nieruszone miejsce
                    boardString += ansiColors.ANSI_WHITE_BACKGROUND + " ? " + ansiColors.ANSI_RESET;
                }
            }
            boardString += "\n";
        }
        System.out.println(boardString);
    }

    public static void displayWinner(int winner){

    }

}