import java.util.ArrayList;
import java.util.List;

public class Board {


    public List<List<Square>> ocean = new ArrayList<>();



    public Board() {
        for (int j = 0; j < 15; j++) {
            List<Square> row = new ArrayList<>();
            for (int i = 0; i < 15; i++) {
                row.add(new Square(j, i, "O", "DUPA"));
            }
            ocean.add(row);
        }
//        ocean.get(0).get(4).setStatusSquare("D");
//        ocean.get(0).get(3).setStatusSquare("D");
//        ocean.get(0).get(2).setStatusSquare("D");
//        ocean.get(5).get(2).setStatusSquare("M");
//        ocean.get(7).get(12).setStatusSquare("M");
//        ocean.get(13).get(8).setStatusSquare("H");
//        ocean.get(13).get(9).setStatusSquare("H");
//        ocean.get(13).get(10).setStatusSquare("S");
//        ocean.get(2).get(9).setStatusSquare("S");
//        ocean.get(3).get(9).setStatusSquare("S");
//        ocean.get(4).get(9).setStatusSquare("S");
//        ocean.get(5).get(9).setStatusSquare("S");
//        ocean.get(6).get(9).setStatusSquare("S");

    }




    private static boolean isPlacementOk(int[][] placement) {
        return false;
    }
}


