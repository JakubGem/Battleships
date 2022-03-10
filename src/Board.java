import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Board {

    public List<List<Square>> ocean = new ArrayList<>();

    private static boolean isPlacementOk(int[] placement) {
        return ((0 <= placement[0]) && (placement[0] <= 14) && (0 <= placement[1]) && (placement[1] <= 14));
    }

    public Board(List<List<Square>> ocean) {
        for (int j = 0; j < 15; j++) {
            List<Square> row = new ArrayList<>();
            for (int i = 0; i < 15; i++) {
                row.add(new Square(j, i, SquareStatus.status.OCEAN, "O"));
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
}

