import java.util.ArrayList;
import java.util.List;

public class Board {


    public Board(List<List<Square>> ocean) {
        for (int j = 0; j < 15; j++) {
            List<Square> row = new ArrayList<>();
            for (int i = 0; i < 15; i++) {
                row.add(new Square(j, i, "O", "DUPA"));
            }
            ocean.add(row);
        }
    }




    private static boolean isPlacementOk(int[][] placement) {
        return false;
    }
}


