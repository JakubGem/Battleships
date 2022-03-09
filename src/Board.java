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
        //5
        int right = 0;
        int down = 0;

        int[] result = BoardFactory.random(board);

        try {
            if (board.ocean.get(result[0]).get(result[1]).getStatusSquare().equals("O") && board.ocean.get(result[0]).get(result[1] + 1).getStatusSquare().equals("O")
                    && board.ocean.get(result[0]).get(result[1] + 2).getStatusSquare().equals("O") && board.ocean.get(result[0]).get(result[1] + 3).getStatusSquare().equals("O")
                    && board.ocean.get(result[0]).get(result[1] + 4).getStatusSquare().equals("O") && board.ocean.get(result[0]).get(result[1] + 5).getStatusSquare().equals("O")
                    && board.ocean.get(result[0] + 1).get(result[1]).getStatusSquare().equals("O")) {
                right += 1;
//                System.out.println("1try");
//            board.ocean.get(result[0]).get(result[1] + d).setStatusSquare("S");
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
            try {
                if
                (board.ocean.get(result[0]).get(result[1]).getStatusSquare().equals("O") && board.ocean.get(result[0] + 1).get(result[1]).getStatusSquare().equals("O")
                        && board.ocean.get(result[0] + 2).get(result[1]).getStatusSquare().equals("O") && board.ocean.get(result[0] + 3).get(result[1]).getStatusSquare().equals("O")
                        && board.ocean.get(result[0] + 4).get(result[1]).getStatusSquare().equals("O") && board.ocean.get(result[0] + 5).get(result[1]).getStatusSquare().equals("O")
                        && board.ocean.get(result[0]).get(result[1] + 1).getStatusSquare().equals("O")) {
                    down = 1;
//                    System.out.println("2try");
                }
            } catch (IndexOutOfBoundsException event) {
                System.out.println(event);
//                for (int d = 0; d < board.ocean.size() - 1; d++) {
//                    board.ocean.get(result[0]).get(result[1] + d).setStatusSquare("O");
//                    board.ocean.get(result[0] + d).get(result[1]).setStatusSquare("O");
//
////                    System.out.println("carrier placement nie działa");
//
//                }
                System.out.println("carrierPlacement");
                carrierPlacement(board);
//                System.out.println("dupa1");
            }
        }
        int[] resultVar = {right, down, result[0], result[1]};
        return resultVar;
    }

    public static int[] battleshipPlacement(Board board) {
        //4
        int right = 0;
        int down = 0;
        int[] result = BoardFactory.random(board);
        try {
            if (board.ocean.get(result[0]).get(result[1]).getStatusSquare().equals("O") && board.ocean.get(result[0]).get(result[1] + 1).getStatusSquare().equals("O")
                    && board.ocean.get(result[0]).get(result[1] + 2).getStatusSquare().equals("O") && board.ocean.get(result[0]).get(result[1] + 3).getStatusSquare().equals("O")
                    && board.ocean.get(result[0]).get(result[1] + 4).getStatusSquare().equals("O") && board.ocean.get(result[0] + 1).get(result[1]).getStatusSquare().equals("O")) {
                right = 1;
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
            try {
                if (board.ocean.get(result[0]).get(result[1]).getStatusSquare().equals("O") && board.ocean.get(result[0] + 1).get(result[1]).getStatusSquare().equals("O")
                        && board.ocean.get(result[0] + 2).get(result[1]).getStatusSquare().equals("O") && board.ocean.get(result[0] + 3).get(result[1]).getStatusSquare().equals("O")
                        && board.ocean.get(result[0] + 4).get(result[1]).getStatusSquare().equals("O") && board.ocean.get(result[0]).get(result[1] + 1).getStatusSquare().equals("O")) {
                    down = 1;
                }
            } catch (IndexOutOfBoundsException event) {
                System.out.println(event);
//                for (int d = 0; d < board.ocean.size() - 1; d++) {
////                    System.out.println("działa?");
//                    board.ocean.get(result[0] + d).get(result[1]).setStatusSquare("O");
//                    for (int a = 0; a < board.ocean.size() - 1; a++) {
//                        board.ocean.get(result[0]).get(result[1 + a]).setStatusSquare("O");
//                    }
//                    System.out.println("battleshipPlacement");
//                    battleshipPlacement(board);
//                }
            }

        }
        int[] resultVar = {right, down, result[0], result[1]};
        return resultVar;
    }

    public static int[] CruiserPlacement(Board board) {
        //3
        int right = 0;
        int down = 0;
        int[] result = BoardFactory.random(board);
        try {
            if (board.ocean.get(result[0]).get(result[1]).getStatusSquare().equals("O") && board.ocean.get(result[0]).get(result[1] + 1).getStatusSquare().equals("O")
                    && board.ocean.get(result[0]).get(result[1] + 2).getStatusSquare().equals("O") && board.ocean.get(result[0]).get(result[1] + 3).getStatusSquare().equals("O")
                    && board.ocean.get(result[0] + 1).get(result[1]).getStatusSquare().equals("O")) {
                right = 1;
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
            try {
                if (board.ocean.get(result[0]).get(result[1]).getStatusSquare().equals("O") && board.ocean.get(result[0] + 1).get(result[1]).getStatusSquare().equals("O")
                        && board.ocean.get(result[0] + 2).get(result[1]).getStatusSquare().equals("O") && board.ocean.get(result[0] + 3).get(result[1]).getStatusSquare().equals("O")
                        && board.ocean.get(result[0]).get(result[1] + 1).getStatusSquare().equals("O")) {
                    down = 1;
                }
            } catch (IndexOutOfBoundsException event) {
                System.out.println(event);
//                for (int d = 0; d < board.ocean.size() - 1; d++) {
////                    System.out.println("działa?");
//                    board.ocean.get(result[0] + d).get(result[1]).setStatusSquare("O");
//                    board.ocean.get(result[0]).get(result[1 + d]).setStatusSquare("O");
//
//                }
                System.out.println("CruiserPlacement");
                CruiserPlacement(board);
            }

        }
        int[] resultVar = {right, down, result[0], result[1]};
        return resultVar;
    }

    public static int[] SubmarinePlacement(Board board) {
        //2
        int right = 0;
        int down = 0;
        int[] result = BoardFactory.random(board);
        try {
            if (board.ocean.get(result[0]).get(result[1]).getStatusSquare().equals("O") && board.ocean.get(result[0]).get(result[1] + 1).getStatusSquare().equals("O")
                    && board.ocean.get(result[0]).get(result[1] + 2).getStatusSquare().equals("O") && board.ocean.get(result[0] + 1).get(result[1]).getStatusSquare().equals("O")
            ) {
                right = 1;
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
            try {
                if (board.ocean.get(result[0]).get(result[1]).getStatusSquare().equals("O") && board.ocean.get(result[0] + 1).get(result[1]).getStatusSquare().equals("O")
                        && board.ocean.get(result[0] + 2).get(result[1]).getStatusSquare().equals("O") && board.ocean.get(result[0]).get(result[1] + 1).getStatusSquare().equals("O")
                ) {
                    down = 1;
                }
            } catch (IndexOutOfBoundsException event) {
                System.out.println(event);
//                for (int d = 0; d < board.ocean.size() - 1; d++) {
////                    System.out.println("działa?");
//                    board.ocean.get(result[0] + d).get(result[1]).setStatusSquare("O");
//                    board.ocean.get(result[0]).get(result[1 + d]).setStatusSquare("O");
//
//                }
                System.out.println("SubmarinePlacement");
                SubmarinePlacement(board);
            }

        }
        int[] resultVar = {right, down, result[0], result[1]};
        return resultVar;
    }

    public static int[] DestroyerPlacement(Board board) {
        //1
        int right = 0;
        int down = 0;
        int[] result = BoardFactory.random(board);
        try {
            if (board.ocean.get(result[1]).get(result[0]).getStatusSquare().equals("O") && board.ocean.get(result[0] + 1).get(result[1]).getStatusSquare().equals("O")
                    && board.ocean.get(result[0]).get(result[1] + 1).getStatusSquare().equals("O")&& board.ocean.get(result[0]).get(result[1] - 1).getStatusSquare().equals("O")) {
                right = 1;
            }
        } catch (IndexOutOfBoundsException event) {
            System.out.println(event);

//            board.ocean.get(result[1]).get(result[0]).setStatusSquare("O");
            System.out.println("DestroyerPlacement");
            DestroyerPlacement(board);

        }
        int[] resultVar = {right, down, result[0], result[1]};
        return resultVar;

    }


}


