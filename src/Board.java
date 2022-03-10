import java.util.ArrayList;
import java.util.List;

public class Board {

    public List<List<Square>> ocean = new ArrayList<>();

    private static boolean isPlacementOk(int[][] placement) {

        return false;
    }

    public Board() {
        for (int j = 0; j < 15; j++) {
            List<Square> row = new ArrayList<>();
            for (int i = 0; i < 15; i++) {
                row.add(new Square(j, i, "O", "none"));
            }
            ocean.add(row);
        }
    }

    public static void carrierPlacement(Board board) {
        //5
        int[] result = BoardFactory.random();
        try {
            if (board.ocean.get(result[0]).get(result[1]).getStatusSquare().equals("O") && board.ocean.get(result[0]).get(result[1] + 1).getStatusSquare().equals("O")
                    && board.ocean.get(result[0]).get(result[1] + 2).getStatusSquare().equals("O") && board.ocean.get(result[0]).get(result[1] + 3).getStatusSquare().equals("O")
                    && board.ocean.get(result[0]).get(result[1] + 4).getStatusSquare().equals("O") && board.ocean.get(result[0]).get(result[1]-1).getStatusSquare().equals("O")
                    && board.ocean.get(result[0]).get(result[1]+5).getStatusSquare().equals("O")

                    && board.ocean.get(result[0] + 1).get(result[1]).getStatusSquare().equals("O") && board.ocean.get(result[0] + 1).get(result[1]+1).getStatusSquare().equals("O")
                    && board.ocean.get(result[0] + 1).get(result[1]+2).getStatusSquare().equals("O") && board.ocean.get(result[0] + 1).get(result[1]+3).getStatusSquare().equals("O")
                    && board.ocean.get(result[0] + 1).get(result[1]+4).getStatusSquare().equals("O")

                    && board.ocean.get(result[0] - 1).get(result[1]).getStatusSquare().equals("O") && board.ocean.get(result[0] - 1).get(result[1]+1).getStatusSquare().equals("O")
                    && board.ocean.get(result[0] - 1).get(result[1]+2).getStatusSquare().equals("O") && board.ocean.get(result[0] - 1).get(result[1]+3).getStatusSquare().equals("O")
                    && board.ocean.get(result[0] - 1).get(result[1]+4).getStatusSquare().equals("O")) {
                BoardFactory.randomPlacement(board, 5, 1, result);
            }  else if (board.ocean.get(result[0]).get(result[1]).getStatusSquare().equals("O") && board.ocean.get(result[0] + 1).get(result[1]).getStatusSquare().equals("O")
                    && board.ocean.get(result[0] + 2).get(result[1]).getStatusSquare().equals("O") && board.ocean.get(result[0] + 3).get(result[1]).getStatusSquare().equals("O")
                    && board.ocean.get(result[0] + 4).get(result[1]).getStatusSquare().equals("O") && board.ocean.get(result[0]+5).get(result[1]).getStatusSquare().equals("O")
                    && board.ocean.get(result[0]-1).get(result[1]).getStatusSquare().equals("O")

                    && board.ocean.get(result[0]).get(result[1]+1).getStatusSquare().equals("O") && board.ocean.get(result[0] + 1).get(result[1]+1).getStatusSquare().equals("O")
                    && board.ocean.get(result[0] + 2).get(result[1]+1).getStatusSquare().equals("O") && board.ocean.get(result[0] + 3).get(result[1]+1).getStatusSquare().equals("O")
                    && board.ocean.get(result[0] + 4).get(result[1]+1).getStatusSquare().equals("O")

                    && board.ocean.get(result[0]).get(result[1]-1).getStatusSquare().equals("O") && board.ocean.get(result[0] + 1).get(result[1]-1).getStatusSquare().equals("O")
                    && board.ocean.get(result[0] + 2).get(result[1]-1).getStatusSquare().equals("O") && board.ocean.get(result[0] + 3).get(result[1]-1).getStatusSquare().equals("O")
                    && board.ocean.get(result[0] + 4).get(result[1]-1).getStatusSquare().equals("O")) {
                BoardFactory.randomPlacement(board, 5, 2, result);
            } else {
                carrierPlacement(board);
            }
        } catch (IndexOutOfBoundsException e) {
            carrierPlacement(board);
        }
    }

    public static void battleshipPlacement(Board board) {
        //4
        int[] result = BoardFactory.random();
        try {
            if (board.ocean.get(result[0]).get(result[1]).getStatusSquare().equals("O") && board.ocean.get(result[0]).get(result[1] + 1).getStatusSquare().equals("O")
                    && board.ocean.get(result[0]).get(result[1] + 2).getStatusSquare().equals("O") && board.ocean.get(result[0]).get(result[1] + 3).getStatusSquare().equals("O")
                    && board.ocean.get(result[0]).get(result[1] + 4).getStatusSquare().equals("O") && board.ocean.get(result[0]).get(result[1]-1).getStatusSquare().equals("O")

                    && board.ocean.get(result[0] + 1).get(result[1]).getStatusSquare().equals("O") && board.ocean.get(result[0] + 1).get(result[1]+1).getStatusSquare().equals("O")
                    && board.ocean.get(result[0] + 1).get(result[1]+2).getStatusSquare().equals("O") && board.ocean.get(result[0] + 1).get(result[1]+3).getStatusSquare().equals("O")

                    && board.ocean.get(result[0] - 1).get(result[1]).getStatusSquare().equals("O") && board.ocean.get(result[0] - 1).get(result[1]+1).getStatusSquare().equals("O")
                    && board.ocean.get(result[0] - 1).get(result[1]+2).getStatusSquare().equals("O") && board.ocean.get(result[0] - 1).get(result[1]+3).getStatusSquare().equals("O")) {
                BoardFactory.randomPlacement(board, 4, 1, result);
            } else if (board.ocean.get(result[0]).get(result[1]).getStatusSquare().equals("O") && board.ocean.get(result[0] + 1).get(result[1]).getStatusSquare().equals("O")
                    && board.ocean.get(result[0] + 2).get(result[1]).getStatusSquare().equals("O") && board.ocean.get(result[0] + 3).get(result[1]).getStatusSquare().equals("O")
                    && board.ocean.get(result[0] + 4).get(result[1]).getStatusSquare().equals("O") && board.ocean.get(result[0]-1).get(result[1]).getStatusSquare().equals("O")

                    && board.ocean.get(result[0]).get(result[1]+1).getStatusSquare().equals("O") && board.ocean.get(result[0] + 1).get(result[1]+1).getStatusSquare().equals("O")
                    && board.ocean.get(result[0] + 2).get(result[1]+1).getStatusSquare().equals("O") && board.ocean.get(result[0] + 3).get(result[1]+1).getStatusSquare().equals("O")

                    && board.ocean.get(result[0]).get(result[1]-1).getStatusSquare().equals("O") && board.ocean.get(result[0] + 1).get(result[1]-1).getStatusSquare().equals("O")
                    && board.ocean.get(result[0] + 2).get(result[1]-1).getStatusSquare().equals("O") && board.ocean.get(result[0] + 3).get(result[1]-1).getStatusSquare().equals("O")) {
                BoardFactory.randomPlacement(board, 4, 2, result);
            } else {
                battleshipPlacement(board);
            }
        } catch (IndexOutOfBoundsException e) {
            battleshipPlacement(board);
        }
    }

    public static void CruiserPlacement(Board board) {
        //3
        int[] result = BoardFactory.random();
        try {
            if (board.ocean.get(result[0]).get(result[1]).getStatusSquare().equals("O") && board.ocean.get(result[0]).get(result[1] + 1).getStatusSquare().equals("O")
                    && board.ocean.get(result[0]).get(result[1] + 2).getStatusSquare().equals("O") && board.ocean.get(result[0]).get(result[1] + 3).getStatusSquare().equals("O")
                     && board.ocean.get(result[0]).get(result[1]-1).getStatusSquare().equals("O")

                    && board.ocean.get(result[0] + 1).get(result[1]).getStatusSquare().equals("O") && board.ocean.get(result[0] + 1).get(result[1]+1).getStatusSquare().equals("O")
                    && board.ocean.get(result[0] + 1).get(result[1]+2).getStatusSquare().equals("O")

                    && board.ocean.get(result[0] - 1).get(result[1]).getStatusSquare().equals("O") && board.ocean.get(result[0] - 1).get(result[1]+1).getStatusSquare().equals("O")
                    && board.ocean.get(result[0] - 1).get(result[1]+2).getStatusSquare().equals("O")) {
                BoardFactory.randomPlacement(board, 3, 1, result);
            } else if (board.ocean.get(result[0]).get(result[1]).getStatusSquare().equals("O") && board.ocean.get(result[0] + 1).get(result[1]).getStatusSquare().equals("O")
                    && board.ocean.get(result[0] + 2).get(result[1]).getStatusSquare().equals("O") && board.ocean.get(result[0] + 3).get(result[1]).getStatusSquare().equals("O")
                    && board.ocean.get(result[0]-1).get(result[1]).getStatusSquare().equals("O")

                    && board.ocean.get(result[0]).get(result[1]+1).getStatusSquare().equals("O") && board.ocean.get(result[0] + 1).get(result[1]+1).getStatusSquare().equals("O")
                    && board.ocean.get(result[0] + 2).get(result[1]+1).getStatusSquare().equals("O")

                    && board.ocean.get(result[0]).get(result[1]-1).getStatusSquare().equals("O") && board.ocean.get(result[0] + 1).get(result[1]-1).getStatusSquare().equals("O")
                    && board.ocean.get(result[0] + 2).get(result[1]-1).getStatusSquare().equals("O")) {
                BoardFactory.randomPlacement(board, 3, 2, result);
            } else {
                CruiserPlacement(board);
            }
        } catch (IndexOutOfBoundsException e) {
            CruiserPlacement(board);
        }
    }

    public static void SubmarinePlacement(Board board) {
        //2
        int[] result = BoardFactory.random();
        try {
            for (int step=-1; step<3; step++){
            if (board.ocean.get(result[0]).get(result[1] + step).getStatusSquare().equals("O")

                    && board.ocean.get(result[0] + 1).get(result[1] + step).getStatusSquare().equals("O")

                    && board.ocean.get(result[0] - 1).get(result[1] + step).getStatusSquare().equals("O")) {
                BoardFactory.randomPlacement(board, 2, 1, result);
            } }
            if (board.ocean.get(result[0]).get(result[1]).getStatusSquare().equals("O") && board.ocean.get(result[0] + 1).get(result[1]).getStatusSquare().equals("O")
                    && board.ocean.get(result[0] + 2).get(result[1]).getStatusSquare().equals("O") && board.ocean.get(result[0]-1).get(result[1]).getStatusSquare().equals("O")

                    && board.ocean.get(result[0]).get(result[1]+1).getStatusSquare().equals("O") && board.ocean.get(result[0] + 1).get(result[1]+1).getStatusSquare().equals("O")

                    && board.ocean.get(result[0]).get(result[1]-1).getStatusSquare().equals("O") && board.ocean.get(result[0] + 1).get(result[1]-1).getStatusSquare().equals("O")) {
                BoardFactory.randomPlacement(board, 2, 2, result);
            } else {
                SubmarinePlacement(board);
            }
        } catch (IndexOutOfBoundsException e) {
            SubmarinePlacement(board);
        }
    }
}


