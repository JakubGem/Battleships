import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Board {


    private ArrayList<List> ocean = new ArrayList<>();



    public Board() {
        for (int j = 0; j < 15; j++) {
            List<Square> row = new ArrayList<>();
            for (int i = 0; i < 15; i++) {
                row.add(new Square(j, i, "hit", "DUPA"));
            }
            ocean.add(row);
        }
        System.out.println(ocean);
    }



    private static boolean isPlacementOk(int[][] placement) {
        return false;
    }
}


