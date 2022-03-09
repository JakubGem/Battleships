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

    public static int[] carrierPlacement(Board board) {
        int right = 0;
        int down = 0;

        int[] result = BoardFactory.random(board);

        try {
            if (board.ocean.get(result[0]).get(result[1]).getStatusSquare().equals("O") && board.ocean.get(result[0]).get(result[1] + 1).getStatusSquare().equals("O")
                    && board.ocean.get(result[0]).get(result[1] + 2).getStatusSquare().equals("O") && board.ocean.get(result[0]).get(result[1] + 3).getStatusSquare().equals("O")
                    && board.ocean.get(result[0]).get(result[1] + 4).getStatusSquare().equals("O")) {
                    right += 1;
                System.out.println("1try");
//            board.ocean.get(result[0]).get(result[1] + d).setStatusSquare("S");
            }
        } catch (IndexOutOfBoundsException e) {
            try {
                if
                (board.ocean.get(result[0]).get(result[1]).getStatusSquare().equals("O") && board.ocean.get(result[0] + 1).get(result[1]).getStatusSquare().equals("O")
                        && board.ocean.get(result[0] + 2).get(result[1]).getStatusSquare().equals("O") && board.ocean.get(result[0] + 3).get(result[1]).getStatusSquare().equals("O")
                        && board.ocean.get(result[0] + 4).get(result[1]).getStatusSquare().equals("O")) {
                    down = 1;
                    System.out.println("2try");
                }
            } catch (IndexOutOfBoundsException event) {
                for (int d = 0; d < board.ocean.size()-1; d++) {
                    board.ocean.get(result[0] + d).get(result[1]).setStatusSquare("O");
                    board.ocean.get(result[0]).get(result[1] + d).setStatusSquare("O");
                    System.out.println("carrier placement nie działa");
                    carrierPlacement(board);
                }
                System.out.println("dupa1");
            }
        }int[] resultVar = {right, down, result[0], result[1]};
        return resultVar;
    }

    public static boolean battleshipPlacement(boolean isBattleshipPlacementOk, Board board) {
        int[] result = BoardFactory.random(board);
        if (board.ocean.get(result[0]).get(result[1]).getStatusSquare().equals("O") && board.ocean.get(result[0] + 1).get(result[1]).getStatusSquare().equals("O")
                && board.ocean.get(result[0] + 2).get(result[1]).getStatusSquare().equals("O") && board.ocean.get(result[0] + 3).get(result[1]).getStatusSquare().equals("O")) {
            for (int d = 0; d < 4; d++) {
                board.ocean.get(result[0]).get(result[1] + d).setStatusSquare("S");
            }
        } else if (board.ocean.get(result[0]).get(result[1]).getStatusSquare().equals("O") && board.ocean.get(result[0]).get(result[1] + 1).getStatusSquare().equals("O")
                && board.ocean.get(result[0]).get(result[1] + 2).getStatusSquare().equals("O") && board.ocean.get(result[0]).get(result[1] + 3).getStatusSquare().equals("O")) {
            for (int d = 0; d < 4; d++) {
                board.ocean.get(result[0] + d).get(result[1]).setStatusSquare("S");
            }
        } else {
            for (int d = 0; d < 4; d++) {
                board.ocean.get(result[0] + d).get(result[1]).setStatusSquare("O");
                board.ocean.get(result[0]).get(result[1 + d]).setStatusSquare("O");
                battleshipPlacement(isBattleshipPlacementOk, board);
            }
        }

        return isBattleshipPlacementOk;
    }

    public static boolean CruiserPlacement(boolean isCruiserPlacementOk, Board board) {

        int[] result = BoardFactory.random(board);
        if (board.ocean.get(result[0]).get(result[1]).getStatusSquare().equals("O") && board.ocean.get(result[0] + 1).get(result[1]).getStatusSquare().equals("O")
                && board.ocean.get(result[0] + 2).get(result[1]).getStatusSquare().equals("O")) {
            for (int d = 0; d < 3; d++) {
                board.ocean.get(result[0] + d).get(result[1]).setStatusSquare("S");
            }
        } else if (board.ocean.get(result[0]).get(result[1]).getStatusSquare().equals("O") && board.ocean.get(result[0]).get(result[1] + 1).getStatusSquare().equals("O")
                && board.ocean.get(result[0]).get(result[1] + 2).getStatusSquare().equals("O")) {
            for (int d = 0; d < 3; d++) {
                board.ocean.get(result[0]).get(result[1] + d).setStatusSquare("S");
            }
        } else {
            for (int d = 0; d < 3; d++) {
                board.ocean.get(result[0] + d).get(result[1]).setStatusSquare("O");
                board.ocean.get(result[0]).get(result[1] + d).setStatusSquare("O");
                CruiserPlacement(isCruiserPlacementOk, board);
            }

        }
        return isCruiserPlacementOk;
    }

    public static boolean SubmarinePlacement(boolean isSubmarinePlacementOk, Board board) {
        int[] result = BoardFactory.random(board);
        if (board.ocean.get(result[0]).get(result[1]).getStatusSquare().equals("O") && board.ocean.get(result[0] + 1).get(result[1]).getStatusSquare().equals("O")) {
            for (int d = 0; d < 2; d++) {
                board.ocean.get(result[0] + d).get(result[1]).setStatusSquare("S");
            }
        } else if (board.ocean.get(result[0]).get(result[1]).getStatusSquare().equals("O") && board.ocean.get(result[0]).get(result[1] + 1).getStatusSquare().equals("O")) {
            for (int d = 0; d < 2; d++) {
                board.ocean.get(result[0]).get(result[1] + d).setStatusSquare("S");
            }
        } else {
            for (int d = 0; d < 2; d++) {
                board.ocean.get(result[0] + d).get(result[1]).setStatusSquare("O");
                board.ocean.get(result[0]).get(result[1] + d).setStatusSquare("O");
                SubmarinePlacement(isSubmarinePlacementOk, board);
            }
        }

        return isSubmarinePlacementOk;
    }

    public static boolean DestroyerPlacement(boolean isDestroyerPlacementOk, Board board) {
        int[] result = BoardFactory.random(board);
        if (board.ocean.get(result[0]).get(result[1]).getStatusSquare().equals("O")) {
            board.ocean.get(result[0]).get(result[1]).setStatusSquare("S");
        } else if (board.ocean.get(result[0] + 1).get(result[1] + 1).getStatusSquare().equals("O")) {
            board.ocean.get(result[0] + 1).get(result[1] + 1).setStatusSquare("S");
        } else {
            board.ocean.get(result[0] + 1).get(result[1] + 1).setStatusSquare("O");
            board.ocean.get(result[0]).get(result[1]).setStatusSquare("O");
            DestroyerPlacement(isDestroyerPlacementOk, board);
        }
        return isDestroyerPlacementOk;
    }


}


