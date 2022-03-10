import java.util.List;
import java.util.ArrayList;

public class Display {


    public void chooseMethodOfStagingShips() {
        System.out.println();
        System.out.println();
        System.out.println("                                                            " + AnsiColors.ANSI_YELLOW_BACKGROUND + AnsiColors.ANSI_BLACK + "========================================================" + AnsiColors.ANSI_RESET);
        System.out.println("                                                            " + AnsiColors.ANSI_YELLOW_BACKGROUND + AnsiColors.ANSI_BLACK + "||" + AnsiColors.ANSI_RESET + AnsiColors.ANSI_BLACK_BACKGROUND + "                     " + AnsiColors.ANSI_YELLOW + "*                              " + AnsiColors.ANSI_YELLOW_BACKGROUND + AnsiColors.ANSI_BLACK + "||" + AnsiColors.ANSI_RESET);
        System.out.println("                                                            " + AnsiColors.ANSI_YELLOW_BACKGROUND + AnsiColors.ANSI_BLACK + "||" + AnsiColors.ANSI_RESET + AnsiColors.ANSI_PURPLE + AnsiColors.ANSI_BLACK_BACKGROUND + "    " + AnsiColors.ANSI_YELLOW + "*" + AnsiColors.ANSI_CYAN + "  How do you want to position the ships?       " + AnsiColors.ANSI_YELLOW_BACKGROUND + AnsiColors.ANSI_BLACK + "||" + AnsiColors.ANSI_RESET);
        System.out.println("                                                            " + AnsiColors.ANSI_YELLOW_BACKGROUND + AnsiColors.ANSI_BLACK + "||" + AnsiColors.ANSI_RESET + AnsiColors.ANSI_PURPLE + AnsiColors.ANSI_BLACK_BACKGROUND + "                                            " + AnsiColors.ANSI_YELLOW + "*" + AnsiColors.ANSI_PURPLE + "       " + AnsiColors.ANSI_YELLOW_BACKGROUND + AnsiColors.ANSI_BLACK + "||" + AnsiColors.ANSI_RESET);
        System.out.println("                                                            " + AnsiColors.ANSI_YELLOW_BACKGROUND + AnsiColors.ANSI_BLACK + "||" + AnsiColors.ANSI_RESET + AnsiColors.ANSI_PURPLE + AnsiColors.ANSI_BLACK_BACKGROUND + "            1. Ship placement manual                " + AnsiColors.ANSI_YELLOW_BACKGROUND + AnsiColors.ANSI_BLACK + "||" + AnsiColors.ANSI_RESET);
        System.out.println("                                                            " + AnsiColors.ANSI_YELLOW_BACKGROUND + AnsiColors.ANSI_BLACK + "||" + AnsiColors.ANSI_RESET + AnsiColors.ANSI_PURPLE + AnsiColors.ANSI_BLACK_BACKGROUND + " " + AnsiColors.ANSI_YELLOW + "*" + AnsiColors.ANSI_PURPLE + "          2. Ship placement random                " + AnsiColors.ANSI_YELLOW_BACKGROUND + AnsiColors.ANSI_BLACK + "||" + AnsiColors.ANSI_RESET);
        System.out.println("                                                            " + AnsiColors.ANSI_YELLOW_BACKGROUND + AnsiColors.ANSI_BLACK + "||" + AnsiColors.ANSI_RESET + AnsiColors.ANSI_BLACK_BACKGROUND + "                                                    " + AnsiColors.ANSI_YELLOW_BACKGROUND + AnsiColors.ANSI_BLACK + "||" + AnsiColors.ANSI_RESET);
        System.out.println("                                                            " + AnsiColors.ANSI_YELLOW_BACKGROUND + AnsiColors.ANSI_BLACK + "========================================================" + AnsiColors.ANSI_RESET);
        System.out.println();
        System.out.println();
        System.out.print(AnsiColors.ANSI_PURPLE + AnsiColors.ANSI_BLACK_BACKGROUND + " Placement: " + AnsiColors.ANSI_RESET);
    }


    public void chooseDifficultyLevel() {
        System.out.println();
        System.out.println();
        System.out.println("                                                            " + AnsiColors.ANSI_YELLOW_BACKGROUND + AnsiColors.ANSI_BLACK + "========================================================" + AnsiColors.ANSI_RESET);
        System.out.println("                                                            " + AnsiColors.ANSI_YELLOW_BACKGROUND + AnsiColors.ANSI_BLACK + "||" + AnsiColors.ANSI_RESET + AnsiColors.ANSI_BLACK_BACKGROUND + "                               " + AnsiColors.ANSI_YELLOW + "*                    " + AnsiColors.ANSI_YELLOW_BACKGROUND + AnsiColors.ANSI_BLACK + "||" + AnsiColors.ANSI_RESET);
        System.out.println("                                                            " + AnsiColors.ANSI_YELLOW_BACKGROUND + AnsiColors.ANSI_BLACK + "||" + AnsiColors.ANSI_RESET + AnsiColors.ANSI_PURPLE + AnsiColors.ANSI_BLACK_BACKGROUND + "            " + AnsiColors.ANSI_YELLOW + "*" + AnsiColors.ANSI_CYAN + "          Choose                       " + AnsiColors.ANSI_YELLOW_BACKGROUND + AnsiColors.ANSI_BLACK + "||" + AnsiColors.ANSI_RESET);
        System.out.println("                                                            " + AnsiColors.ANSI_YELLOW_BACKGROUND + AnsiColors.ANSI_BLACK + "||" + AnsiColors.ANSI_RESET + AnsiColors.ANSI_PURPLE + AnsiColors.ANSI_BLACK_BACKGROUND + "                                            " + AnsiColors.ANSI_YELLOW + "*" + AnsiColors.ANSI_PURPLE + "       " + AnsiColors.ANSI_YELLOW_BACKGROUND + AnsiColors.ANSI_BLACK + "||" + AnsiColors.ANSI_RESET);
        System.out.println("                                                            " + AnsiColors.ANSI_YELLOW_BACKGROUND + AnsiColors.ANSI_BLACK + "||" + AnsiColors.ANSI_RESET + AnsiColors.ANSI_PURPLE + AnsiColors.ANSI_BLACK_BACKGROUND + "                  1. Normal mode                    " + AnsiColors.ANSI_YELLOW_BACKGROUND + AnsiColors.ANSI_BLACK + "||" + AnsiColors.ANSI_RESET);
        System.out.println("                                                            " + AnsiColors.ANSI_YELLOW_BACKGROUND + AnsiColors.ANSI_BLACK + "||" + AnsiColors.ANSI_RESET + AnsiColors.ANSI_PURPLE + AnsiColors.ANSI_BLACK_BACKGROUND + "           " + AnsiColors.ANSI_YELLOW + "*" + AnsiColors.ANSI_PURPLE + "      2. Unusual mode                   " + AnsiColors.ANSI_YELLOW_BACKGROUND + AnsiColors.ANSI_BLACK + "||" + AnsiColors.ANSI_RESET);
        System.out.println("                                                            " + AnsiColors.ANSI_YELLOW_BACKGROUND + AnsiColors.ANSI_BLACK + "||" + AnsiColors.ANSI_RESET + AnsiColors.ANSI_BLACK_BACKGROUND + "                                                    " + AnsiColors.ANSI_YELLOW_BACKGROUND + AnsiColors.ANSI_BLACK + "||" + AnsiColors.ANSI_RESET);
        System.out.println("                                                            " + AnsiColors.ANSI_YELLOW_BACKGROUND + AnsiColors.ANSI_BLACK + "========================================================" + AnsiColors.ANSI_RESET);
        System.out.println();
        System.out.println();
        System.out.print(AnsiColors.ANSI_PURPLE + AnsiColors.ANSI_BLACK_BACKGROUND + " Mode: " + AnsiColors.ANSI_RESET);
    }


    public void manualPlacementOfAllFiveKindOfShips() {
        System.out.println();
        System.out.println();
        System.out.println("                                                       " + AnsiColors.ANSI_YELLOW_BACKGROUND + AnsiColors.ANSI_BLACK + "===================================================================" + AnsiColors.ANSI_RESET);
        System.out.println("                                                       " + AnsiColors.ANSI_YELLOW_BACKGROUND + AnsiColors.ANSI_BLACK + "||" + AnsiColors.ANSI_RESET + AnsiColors.ANSI_BLACK_BACKGROUND + "                          " + AnsiColors.ANSI_YELLOW + "*                                    " + AnsiColors.ANSI_YELLOW_BACKGROUND + AnsiColors.ANSI_BLACK + "||" + AnsiColors.ANSI_RESET);
        System.out.println("                                                       " + AnsiColors.ANSI_YELLOW_BACKGROUND + AnsiColors.ANSI_BLACK + "||" + AnsiColors.ANSI_RESET + AnsiColors.ANSI_PURPLE + AnsiColors.ANSI_BLACK_BACKGROUND + AnsiColors.ANSI_CYAN + "    Now you need to set up several ships of different types    " + AnsiColors.ANSI_YELLOW_BACKGROUND + AnsiColors.ANSI_BLACK + "||" + AnsiColors.ANSI_RESET);
        System.out.println("                                                       " + AnsiColors.ANSI_YELLOW_BACKGROUND + AnsiColors.ANSI_BLACK + "||" + AnsiColors.ANSI_RESET + AnsiColors.ANSI_PURPLE + AnsiColors.ANSI_BLACK_BACKGROUND + "                                                  " + AnsiColors.ANSI_YELLOW + "*" + AnsiColors.ANSI_PURPLE + "            " + AnsiColors.ANSI_YELLOW_BACKGROUND + AnsiColors.ANSI_BLACK + "||" + AnsiColors.ANSI_RESET);
        System.out.println("                                                       " + AnsiColors.ANSI_YELLOW_BACKGROUND + AnsiColors.ANSI_BLACK + "||" + AnsiColors.ANSI_RESET + AnsiColors.ANSI_PURPLE + AnsiColors.ANSI_BLACK_BACKGROUND + "    " + AnsiColors.ANSI_YELLOW + "*" + AnsiColors.ANSI_PURPLE + "               1 \"CARRIER\" ship (5 holes)                 " + AnsiColors.ANSI_YELLOW_BACKGROUND + AnsiColors.ANSI_BLACK + "||" + AnsiColors.ANSI_RESET);
        System.out.println("                                                       " + AnsiColors.ANSI_YELLOW_BACKGROUND + AnsiColors.ANSI_BLACK + "||" + AnsiColors.ANSI_RESET + AnsiColors.ANSI_PURPLE + AnsiColors.ANSI_BLACK_BACKGROUND + "                    2 \"CRUISER\" ships (4 holes)                " + AnsiColors.ANSI_YELLOW_BACKGROUND + AnsiColors.ANSI_BLACK + "||" + AnsiColors.ANSI_RESET);
        System.out.println("                                                       " + AnsiColors.ANSI_YELLOW_BACKGROUND + AnsiColors.ANSI_BLACK + "||" + AnsiColors.ANSI_RESET + AnsiColors.ANSI_PURPLE + AnsiColors.ANSI_BLACK_BACKGROUND + "                    3 \"BATTLESHIP\" ships (3 holes)             " + AnsiColors.ANSI_YELLOW_BACKGROUND + AnsiColors.ANSI_BLACK + "||" + AnsiColors.ANSI_RESET);
        System.out.println("                                                       " + AnsiColors.ANSI_YELLOW_BACKGROUND + AnsiColors.ANSI_BLACK + "||" + AnsiColors.ANSI_RESET + AnsiColors.ANSI_PURPLE + AnsiColors.ANSI_BLACK_BACKGROUND + "           " + AnsiColors.ANSI_YELLOW + "*" + AnsiColors.ANSI_PURPLE + "        3 \"SUBMARINE\" ships (2 holes)              " + AnsiColors.ANSI_YELLOW_BACKGROUND + AnsiColors.ANSI_BLACK + "||" + AnsiColors.ANSI_RESET);
        System.out.println("                                                       " + AnsiColors.ANSI_YELLOW_BACKGROUND + AnsiColors.ANSI_BLACK + "||" + AnsiColors.ANSI_RESET + AnsiColors.ANSI_BLACK_BACKGROUND + "                                                               " + AnsiColors.ANSI_YELLOW_BACKGROUND + AnsiColors.ANSI_BLACK + "||" + AnsiColors.ANSI_RESET);
        System.out.println("                                                       " + AnsiColors.ANSI_YELLOW_BACKGROUND + AnsiColors.ANSI_BLACK + "===================================================================" + AnsiColors.ANSI_RESET);
        System.out.println();
        System.out.println();
    }


    public void chooseVerticalOrHorizontalPositionOfStagingShips() {
        System.out.println();
        System.out.println();
        System.out.println("                                                            " + AnsiColors.ANSI_YELLOW_BACKGROUND + AnsiColors.ANSI_BLACK + "========================================================" + AnsiColors.ANSI_RESET);
        System.out.println("                                                            " + AnsiColors.ANSI_YELLOW_BACKGROUND + AnsiColors.ANSI_BLACK + "||" + AnsiColors.ANSI_RESET + AnsiColors.ANSI_BLACK_BACKGROUND + "                     " + AnsiColors.ANSI_YELLOW + "*                              " + AnsiColors.ANSI_YELLOW_BACKGROUND + AnsiColors.ANSI_BLACK + "||" + AnsiColors.ANSI_RESET);
        System.out.println("                                                            " + AnsiColors.ANSI_YELLOW_BACKGROUND + AnsiColors.ANSI_BLACK + "||" + AnsiColors.ANSI_RESET + AnsiColors.ANSI_PURPLE + AnsiColors.ANSI_BLACK_BACKGROUND + "       " + AnsiColors.ANSI_YELLOW + "*" + AnsiColors.ANSI_CYAN + "           Choose position                  " + AnsiColors.ANSI_YELLOW_BACKGROUND + AnsiColors.ANSI_BLACK + "||" + AnsiColors.ANSI_RESET);
        System.out.println("                                                            " + AnsiColors.ANSI_YELLOW_BACKGROUND + AnsiColors.ANSI_BLACK + "||" + AnsiColors.ANSI_RESET + AnsiColors.ANSI_PURPLE + AnsiColors.ANSI_BLACK_BACKGROUND + "                                            " + AnsiColors.ANSI_YELLOW + "*" + AnsiColors.ANSI_PURPLE + "       " + AnsiColors.ANSI_YELLOW_BACKGROUND + AnsiColors.ANSI_BLACK + "||" + AnsiColors.ANSI_RESET);
        System.out.println("                                                            " + AnsiColors.ANSI_YELLOW_BACKGROUND + AnsiColors.ANSI_BLACK + "||" + AnsiColors.ANSI_RESET + AnsiColors.ANSI_PURPLE + AnsiColors.ANSI_BLACK_BACKGROUND + "            1. Horizontal to the right              " + AnsiColors.ANSI_YELLOW_BACKGROUND + AnsiColors.ANSI_BLACK + "||" + AnsiColors.ANSI_RESET);
        System.out.println("                                                            " + AnsiColors.ANSI_YELLOW_BACKGROUND + AnsiColors.ANSI_BLACK + "||" + AnsiColors.ANSI_RESET + AnsiColors.ANSI_PURPLE + AnsiColors.ANSI_BLACK_BACKGROUND + " " + AnsiColors.ANSI_YELLOW + "*" + AnsiColors.ANSI_PURPLE + "          2. Vertical to the down                 " + AnsiColors.ANSI_YELLOW_BACKGROUND + AnsiColors.ANSI_BLACK + "||" + AnsiColors.ANSI_RESET);
        System.out.println("                                                            " + AnsiColors.ANSI_YELLOW_BACKGROUND + AnsiColors.ANSI_BLACK + "||" + AnsiColors.ANSI_RESET + AnsiColors.ANSI_BLACK_BACKGROUND + "                                                    " + AnsiColors.ANSI_YELLOW_BACKGROUND + AnsiColors.ANSI_BLACK + "||" + AnsiColors.ANSI_RESET);
        System.out.println("                                                            " + AnsiColors.ANSI_YELLOW_BACKGROUND + AnsiColors.ANSI_BLACK + "========================================================" + AnsiColors.ANSI_RESET);
        System.out.println();
        System.out.println();
        System.out.print(AnsiColors.ANSI_PURPLE + AnsiColors.ANSI_BLACK_BACKGROUND + " Position: " + AnsiColors.ANSI_RESET);

    }

    Square square;

    public void alertPleaseGiveCorrectNumber() {
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("                                                                    " + AnsiColors.ANSI_BLACK + AnsiColors.ANSI_RED_BACKGROUND + " Please give correct number (1/2)! " + AnsiColors.ANSI_RESET);
        System.out.print(AnsiColors.ANSI_PURPLE + AnsiColors.ANSI_BLACK_BACKGROUND + " New coordinates: " + AnsiColors.ANSI_RESET);
    }

    public  void manualPlacement5HolesShips() {
        System.out.println();
        System.out.println();
        System.out.print(AnsiColors.ANSI_PURPLE + AnsiColors.ANSI_BLACK_BACKGROUND + " Give the coordinates for inserting the ship \"CARRIER\" (5 holes): " + AnsiColors.ANSI_RESET);
    }
    public  void howDoYouWantToPositionTheShips() {
        System.out.println();
        System.out.println();
        System.out.print(AnsiColors.ANSI_PURPLE + AnsiColors.ANSI_BLACK_BACKGROUND + " How do you want to position the ships? (1->manual / 2->random) : " + AnsiColors.ANSI_RESET);
    }

    public void manualPlacement4HolesShips() {
        System.out.println();
        System.out.println();
        System.out.print(AnsiColors.ANSI_PURPLE + AnsiColors.ANSI_BLACK_BACKGROUND + " Give the coordinates for inserting the ship \"CRUISER\" (4 holes): " + AnsiColors.ANSI_RESET);
    }

    public void manualPlacement3HolesShips() {
        System.out.println();
        System.out.println();
        System.out.print(AnsiColors.ANSI_PURPLE + AnsiColors.ANSI_BLACK_BACKGROUND + " Give the coordinates for inserting the ship \"BATTLESHIP\" (3 holes): " + AnsiColors.ANSI_RESET);
    }

    public void manualPlacement2HolesShips() {
        System.out.println();
        System.out.println();
        System.out.print(AnsiColors.ANSI_PURPLE + AnsiColors.ANSI_BLACK_BACKGROUND + " Give the coordinates for inserting the ship \"SUBMARINE\" (2 holes): " + AnsiColors.ANSI_RESET);
    }

    public void manualPlacement1HolesShips() {
        System.out.println();
        System.out.println();
        System.out.print(AnsiColors.ANSI_PURPLE + AnsiColors.ANSI_BLACK_BACKGROUND + " Give the coordinates for inserting the ship \"DESTROYER\" (1 holes): " + AnsiColors.ANSI_RESET);
    }

    public void manualGiveCoordinateForShot() {
        System.out.println();
        System.out.println();
        System.out.print(AnsiColors.ANSI_PURPLE + AnsiColors.ANSI_BLACK_BACKGROUND + " Give the coordinates for shot: " + AnsiColors.ANSI_RESET);
    }


    // ALERTY
    public void alertYouCanntSetAShipHere() {
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.print("                                                                    " + AnsiColors.ANSI_BLACK + AnsiColors.ANSI_RED_BACKGROUND + " You can't set a ship here! " + AnsiColors.ANSI_RESET);
        System.out.println();
        System.out.println();
    }

    public void alertPleaseGiveCorrectCoordinates() {
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("                                                                    " + AnsiColors.ANSI_BLACK + AnsiColors.ANSI_RED_BACKGROUND + " Please Give correct coordinates! " + AnsiColors.ANSI_RESET);
        System.out.print(AnsiColors.ANSI_PURPLE + AnsiColors.ANSI_BLACK_BACKGROUND + " New coordinates: " + AnsiColors.ANSI_RESET);
    }

    public void alertPleaseGiveCorrectCoordinates1() {
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("                                                                  " + AnsiColors.ANSI_BLACK + AnsiColors.ANSI_RED_BACKGROUND + " Please Give correct coordinates! " + AnsiColors.ANSI_RESET);
    }


    public void alertYouHaveAlreadyShotThere() {
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.print("                                                                    " + AnsiColors.ANSI_BLACK + AnsiColors.ANSI_RED_BACKGROUND + " You've already shot there! " + AnsiColors.ANSI_RESET);
        System.out.println();
        System.out.println();
    }

    public void alertHitting() {
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.print("                                                                              " + AnsiColors.ANSI_BLACK + AnsiColors.ANSI_GREEN_BACKGROUND + " Hitting! " + AnsiColors.ANSI_RESET);
        System.out.println();
        System.out.println();
    }

    public void alertCurrentPlayer(String player) {
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.print("                                                                              " + AnsiColors.ANSI_BLACK + AnsiColors.ANSI_BLUE_BACKGROUND + "Turn of Player " + player + "! " + AnsiColors.ANSI_RESET);
        System.out.println();
        System.out.println();
    }

    public void alertMiss(){
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.print("                                                                                " + AnsiColors.ANSI_BLACK + AnsiColors.ANSI_RED_BACKGROUND +" Miss! " + AnsiColors.ANSI_RESET);
        System.out.println();
        System.out.println();
    }

    public void alertDestroyed() {
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.print("                                                                            " + AnsiColors.ANSI_BLACK + AnsiColors.ANSI_GREEN_BACKGROUND + " Destroyed!!! " + AnsiColors.ANSI_RESET);
        System.out.println();
        System.out.println();
    }

    public void alertPlaceIsAlreadyTaken() {
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.print("                                                            " + AnsiColors.ANSI_BLACK + AnsiColors.ANSI_RED_BACKGROUND + " This place is already taken by another ship! " + AnsiColors.ANSI_RESET);
        System.out.println();
        System.out.println();
    }


    public void alertWinner(String playerName) {
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.print("                                                               " + AnsiColors.ANSI_BLACK + AnsiColors.ANSI_BLUE_BACKGROUND + " Congratulations! Player " + AnsiColors.ANSI_RED_BACKGROUND + " " + playerName + " " + AnsiColors.ANSI_BLUE_BACKGROUND + " won! " + AnsiColors.ANSI_RESET);
        System.out.println();
        System.out.println();
    }

    public void alertNowPlayerNameIsPositionShips(String playerName) {
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.print("                                                               " + AnsiColors.ANSI_BLACK + AnsiColors.ANSI_BLUE_BACKGROUND + " Now " + AnsiColors.ANSI_RED_BACKGROUND + " " + playerName + " " + AnsiColors.ANSI_BLUE_BACKGROUND + " is position ships! " + AnsiColors.ANSI_RESET);
        System.out.println();
        System.out.println();
    }


    public void displayBoard(List<List<Square>> myBoard, List<List<Square>> opponentBoard) {
        System.out.println();
        System.out.println("                                 " + AnsiColors.ANSI_BLUE_BACKGROUND + AnsiColors.ANSI_BLACK + " YOUR OCEAN " + AnsiColors.ANSI_RESET
                + "                                                                           "
                + AnsiColors.ANSI_RED_BACKGROUND + AnsiColors.ANSI_BLACK + " OPPONENT OCEAN " + AnsiColors.ANSI_RESET + "\n");
        String boardString = "                  " + AnsiColors.ANSI_PURPLE_BACKGROUND + AnsiColors.ANSI_BLACK + "_";
        String[] columnHeader = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O"};
        int[] rowHeader = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        for (String abc : columnHeader) {
            boardString += abc + "__";
        }
        boardString = boardString.substring(0, boardString.length() - 1) + AnsiColors.ANSI_RESET;
        boardString += "                                        ";

        boardString += "   " + AnsiColors.ANSI_PURPLE_BACKGROUND + AnsiColors.ANSI_BLACK + "_";
        for (String abc : columnHeader) {
            boardString += abc + "__";
        }
        boardString = boardString.substring(0, boardString.length() - 1) + AnsiColors.ANSI_RESET;

        boardString += "\n";
        for (int col = 0; col < myBoard.toArray().length; col++) {
            if (col < 9) {
                boardString += "               " + AnsiColors.ANSI_CYAN_BACKGROUND + AnsiColors.ANSI_BLACK + rowHeader[col] + " |" + AnsiColors.ANSI_RESET;
            } else {
                boardString += "               " + AnsiColors.ANSI_CYAN_BACKGROUND + AnsiColors.ANSI_BLACK + rowHeader[col] + "|" + AnsiColors.ANSI_RESET;
            }
            for (int row = 0; row < myBoard.toArray().length; row++) {
                if (myBoard.get(col).get(row).getSquareStatus().equals("S")) {                      //jeśli jest statek
                    boardString += AnsiColors.ANSI_BLACK_BACKGROUND + "   " + AnsiColors.ANSI_RESET;
                } else if (myBoard.get(col).get(row).getSquareStatus().equals("H")) {                //jeśli statek częściowo jest podbity
                    boardString += AnsiColors.ANSI_BLACK_BACKGROUND + AnsiColors.ANSI_RED + " ● " + AnsiColors.ANSI_RESET;
                } else if (myBoard.get(col).get(row).getSquareStatus().equals("D")) {                //jeśli statek jest cały zniszczony
                    boardString += AnsiColors.ANSI_BLACK_BACKGROUND + AnsiColors.ANSI_RED + " X " + AnsiColors.ANSI_RESET;
                } else if (myBoard.get(col).get(row).getSquareStatus().equals("M")) {                //jeśli był strzał w puste miejsce
                    boardString += AnsiColors.ANSI_WHITE_BACKGROUND + AnsiColors.ANSI_RED + " ● " + AnsiColors.ANSI_RESET;
                } else {                     //jeśli jest puste nieruszone miejsce
                    boardString += AnsiColors.ANSI_WHITE_BACKGROUND + " ? " + AnsiColors.ANSI_RESET;
                }
            }
            boardString += "                                        ";
            if (col < 9) {
                boardString += AnsiColors.ANSI_CYAN_BACKGROUND + AnsiColors.ANSI_BLACK + rowHeader[col] + " |" + AnsiColors.ANSI_RESET;
            } else {
                boardString += AnsiColors.ANSI_CYAN_BACKGROUND + AnsiColors.ANSI_BLACK + rowHeader[col] + "|" + AnsiColors.ANSI_RESET;
            }
            for (int row = 0; row < opponentBoard.toArray().length; row++) {
                if (opponentBoard.get(col).get(row).getSquareStatus().equals("H")) {                //jeśli statek częściowo jest podbity
                    boardString += AnsiColors.ANSI_BLACK_BACKGROUND + AnsiColors.ANSI_RED + " ● " + AnsiColors.ANSI_RESET;
                } else if (opponentBoard.get(col).get(row).getSquareStatus().equals("D")) {                //jeśli statek jest cały zniszczony
                    boardString += AnsiColors.ANSI_BLACK_BACKGROUND + AnsiColors.ANSI_RED + " X " + AnsiColors.ANSI_RESET;
                } else if (opponentBoard.get(col).get(row).getSquareStatus().equals("M")) {                //jeśli był strzał w puste miejsce
                    boardString += AnsiColors.ANSI_WHITE_BACKGROUND + AnsiColors.ANSI_RED + " ● " + AnsiColors.ANSI_RESET;
                } else {                     //jeśli jest puste nieruszone miejsce
                    boardString += AnsiColors.ANSI_WHITE_BACKGROUND + " ? " + AnsiColors.ANSI_RESET;
                }
            }
            boardString += "\n";
        }
        System.out.println(boardString);

    }
}
