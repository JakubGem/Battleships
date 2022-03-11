import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Board {
    static Input input = new Input();
    static Game game = new Game();
    static Display display = new Display();
    public List<List<Square>> ocean = new ArrayList<>();


    public Board(List<List<Square>> ocean) {
        for (int j = 0; j < 15; j++) {
            List<Square> row = new ArrayList<>();
            for (int i = 0; i < 15; i++) {
                row.add(new Square(j, i, SquareStatus.status.OCEAN, "O", 0));
            }
            this.ocean.add(row);
        }
    }


    public static void informationToValidate(Board board) {
        int[] ships = {5, 4, 4, 3, 3, 3, 2, 2, 2};
        for (int length : ships) {
            boolean check = false;
            while (!check) {
                int direction = randomNumber();
                int[] result = BoardFactory.random();
                try {
                    check = verifyRandomPlacement(length, direction, board, result);
                } catch (IndexOutOfBoundsException e) {
                    continue;
                }
            }
        }
    }

    public static boolean verifyRandomPlacement(int shipLength, int direction, Board board, int[] result) {
        boolean check = true;

        for (int step = -1; step < shipLength + 1; step++) {
            for (int i = -1; i <= 1; i++) {
                if (direction == 1 && !board.ocean.get(result[0] + i).get(result[1] + step).getStatusSquare().equals(SquareStatus.status.OCEAN)) {
                    check = false;
                    break;
                } else if (direction == 2 && !board.ocean.get(result[0] + step).get(result[1] + i).getStatusSquare().equals(SquareStatus.status.OCEAN)) {
                    check = false;
                    break;
                }
            }
            if (!check) {
                break;
            }
        }
        if (check) {
            BoardFactory.randomPlacement(board, shipLength, direction, result);
            return true;
        } else {
            return false;
        }
    }

    public static int randomNumber() {
        Random rand = new Random();
        int randomNumber = rand.nextInt(1, 3);
        return randomNumber;
    }



    public static void informationToValidateManual(Board board, Board opponentBoard) {
        display.manualPlacementOfAllFiveKindOfShips();
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int[] ships = {5, 4, 4, 3, 3, 3, 2, 2, 2};
        for (int length : ships) {
            boolean check = false;
            while (!check) {
                int direction = randomNumber();
                String playerName;
                if (game.currentPlayer==1){
                    playerName = "Player One";
                } else {
                    playerName = "Player Two";
                }
                display.alertNowPlayerNameIsPositionShips(playerName);
                display.displayBoard(board.ocean, opponentBoard.ocean);

                if(length == 5){
                    display.manualPlacement5HolesShips();
                }else if(length == 4){
                    display.manualPlacement4HolesShips();
                }else if(length == 3){
                    display.manualPlacement3HolesShips();
                }else{
                    display.manualPlacement2HolesShips();
                }
                int[] result = input.getCoordinatesFromInput();
                try {
                    check = isPlacementOk(length, direction, board, result);
                } catch (IndexOutOfBoundsException e) {
                    display.alertPleaseGiveCorrectCoordinates1();
                    continue;
                }
            }
        }
    }

    // random or manual placement?
    //normal or unusual game mode?
    // input coordinates (one per ship)
    // what kind of placement (vertical/horizontal)
    public static boolean isPlacementOk(int shipLength, int direction, Board board, int[] result) {
        int coordinateX = result[0];
        int coordinateY = result[1];
        boolean check = true;
        for (int step = -1; step < shipLength + 1; step++) {
            for (int i = -1; i <= 1; i++) {
                if (direction == 1 && !board.ocean.get(coordinateX + i).get(coordinateY + step).getStatusSquare().equals(SquareStatus.status.OCEAN)) {
                    check = false;
                    break;
                } else if (direction == 2 && !board.ocean.get(coordinateX + step).get(coordinateY + i).getStatusSquare().equals(SquareStatus.status.OCEAN)) {
                    check = false;
                    break;
                }
            }
            if (!check) {
                break;
            }
        }
        if (check) {
            BoardFactory.randomPlacement(board, shipLength, direction, result);
            return true;
        } else {
            return false;
        }
    }
}


