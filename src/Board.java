import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Board {

    public List<List<Square>> ocean = new ArrayList<>();

    private static boolean isPlacementOk(int[][] placement) {
        return false;
    }

    public Board(List<List<Square>> ocean) {
        for (int j = 0; j < 15; j++) {
            List<Square> row = new ArrayList<>();
            for (int i = 0; i < 15; i++) {
                row.add(new Square(j, i, SquareStatus.status.OCEAN, "O"));
            }
            ocean.add(row);
        }
    }


    public static void informationToValidate(Board board) {
        int[] ships = {5, 4, 3, 3, 2};
        for (int length : ships) {
            int direction = randomNumber();
            boolean check = false;
            while (!check) {
                try {
                    check = verifyRandomPlacement(length, direction, board);
                } catch (IndexOutOfBoundsException e) {
                    continue;
                }
            }
        }
    }

    public static boolean verifyRandomPlacement(int shipLength, int direction, Board board) {
        boolean check = true;
        int[] result = BoardFactory.random();
        for (int step = -1; step < shipLength + 1; step++) {
            for (int i = -1; i <= 1; i++) {
                if (direction == 1 && !board.ocean.get(result[0] + i).get(result[1] + step).getStatusSquare().equals("O")) {
                    check = false;
                    break;
                } else if (direction == 2 && !board.ocean.get(result[0] + step).get(result[1] + i).getStatusSquare().equals("O")) {
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
}

