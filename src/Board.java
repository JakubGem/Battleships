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
                row.add(new Square(j, i, "O", "DUPA"));
            }
            ocean.add(row);
        }
    }

    public static void carrierPlacement(Board board) {
        //5
        int[] result = BoardFactory.random(board);
        System.out.println(board);
        try {
            if (board.ocean.get(result[0]).get(result[1]).getStatusSquare().equals("O") && board.ocean.get(result[0]).get(result[1] + 1).getStatusSquare().equals("O")
                    && board.ocean.get(result[0]).get(result[1] + 2).getStatusSquare().equals("O") && board.ocean.get(result[0]).get(result[1] + 3).getStatusSquare().equals("O")
                    && board.ocean.get(result[0]).get(result[1] + 4).getStatusSquare().equals("O") && board.ocean.get(result[0]).get(result[1] + 5).getStatusSquare().equals("O")
                    && board.ocean.get(result[0] + 1).get(result[1]).getStatusSquare().equals("O")) {
                BoardFactory.randomPlacement(board, 5, 1, result);
            }
        } catch (IndexOutOfBoundsException e) {
            try {
                if
                (board.ocean.get(result[0]).get(result[1]).getStatusSquare().equals("O") && board.ocean.get(result[0] + 1).get(result[1]).getStatusSquare().equals("O")
                        && board.ocean.get(result[0] + 2).get(result[1]).getStatusSquare().equals("O") && board.ocean.get(result[0] + 3).get(result[1]).getStatusSquare().equals("O")
                        && board.ocean.get(result[0] + 4).get(result[1]).getStatusSquare().equals("O") && board.ocean.get(result[0] + 5).get(result[1]).getStatusSquare().equals("O")
                        && board.ocean.get(result[0]).get(result[1] + 1).getStatusSquare().equals("O")) {
                    BoardFactory.randomPlacement(board, 5, 2, result);
                }
            } catch (IndexOutOfBoundsException event) {
                carrierPlacement(board);
            }
        }
    }

    public static void battleshipPlacement(Board board) {
        //4
        System.out.println(board);
        for (int i = 0; i < 2; i++) {
            int[] result = BoardFactory.random(board);
            try {
                if (board.ocean.get(result[0]).get(result[1]).getStatusSquare().equals("O") && board.ocean.get(result[0]).get(result[1] + 1).getStatusSquare().equals("O")
                        && board.ocean.get(result[0]).get(result[1] + 2).getStatusSquare().equals("O") && board.ocean.get(result[0]).get(result[1] + 3).getStatusSquare().equals("O")
                        && board.ocean.get(result[0]).get(result[1] + 4).getStatusSquare().equals("O") && board.ocean.get(result[0] + 1).get(result[1]).getStatusSquare().equals("O")) {
                    BoardFactory.randomPlacement(board, 4, 1, result);
                }
            } catch (IndexOutOfBoundsException e) {
                System.out.println(e);
                try {
                    if (board.ocean.get(result[0]).get(result[1]).getStatusSquare().equals("O") && board.ocean.get(result[0] + 1).get(result[1]).getStatusSquare().equals("O")
                            && board.ocean.get(result[0] + 2).get(result[1]).getStatusSquare().equals("O") && board.ocean.get(result[0] + 3).get(result[1]).getStatusSquare().equals("O")
                            && board.ocean.get(result[0] + 4).get(result[1]).getStatusSquare().equals("O") && board.ocean.get(result[0]).get(result[1] + 1).getStatusSquare().equals("O")) {
                        BoardFactory.randomPlacement(board, 4, 2, result);
                    }
                } catch (IndexOutOfBoundsException event) {
                    System.out.println(event);
                    battleshipPlacement(board);
                }

            }
        }
    }

    public static void CruiserPlacement(Board board) {
        //3
        System.out.println(board);
        for (int i = 0; i < 4; i++) {
            int[] result = BoardFactory.random(board);
            try {
                if (board.ocean.get(result[0]).get(result[1]).getStatusSquare().equals("O") && board.ocean.get(result[0]).get(result[1] + 1).getStatusSquare().equals("O")
                        && board.ocean.get(result[0]).get(result[1] + 2).getStatusSquare().equals("O") && board.ocean.get(result[0]).get(result[1] + 3).getStatusSquare().equals("O")
                        && board.ocean.get(result[0] + 1).get(result[1]).getStatusSquare().equals("O")) {
                    BoardFactory.randomPlacement(board, 3, 1, result);
                }
            } catch (IndexOutOfBoundsException e) {
                System.out.println(e);
                try {
                    if (board.ocean.get(result[0]).get(result[1]).getStatusSquare().equals("O") && board.ocean.get(result[0] + 1).get(result[1]).getStatusSquare().equals("O")
                            && board.ocean.get(result[0] + 2).get(result[1]).getStatusSquare().equals("O") && board.ocean.get(result[0] + 3).get(result[1]).getStatusSquare().equals("O")
                            && board.ocean.get(result[0]).get(result[1] + 1).getStatusSquare().equals("O")) {
                        BoardFactory.randomPlacement(board, 3, 2, result);
                    }
                } catch (IndexOutOfBoundsException event) {
                    CruiserPlacement(board);
                }
            }
        }
    }

    public static void SubmarinePlacement(Board board) {
        //2
        System.out.println(board);
        for (int i = 0; i < 2; i++) {
            int[] result = BoardFactory.random(board);
            try {
                if (board.ocean.get(result[0]).get(result[1]).getStatusSquare().equals("O") && board.ocean.get(result[0]).get(result[1] + 1).getStatusSquare().equals("O")
                        && board.ocean.get(result[0]).get(result[1] + 2).getStatusSquare().equals("O") && board.ocean.get(result[0] + 1).get(result[1]).getStatusSquare().equals("O")
                ) {
                    BoardFactory.randomPlacement(board, 2, 1, result);
                }
            } catch (IndexOutOfBoundsException e) {
                System.out.println(e);
                try {
                    if (board.ocean.get(result[0]).get(result[1]).getStatusSquare().equals("O") && board.ocean.get(result[0] + 1).get(result[1]).getStatusSquare().equals("O")
                            && board.ocean.get(result[0] + 2).get(result[1]).getStatusSquare().equals("O") && board.ocean.get(result[0]).get(result[1] + 1).getStatusSquare().equals("O")
                    ) {
                        BoardFactory.randomPlacement(board, 2, 2, result);
                    }
                } catch (IndexOutOfBoundsException event) {
                    SubmarinePlacement(board);
                }

            }
        }
    }
}


