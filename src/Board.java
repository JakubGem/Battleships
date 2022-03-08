import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Board {


    Square square;
    private List<List<Square>> ocean = new ArrayList<>();



    public Board() {
        for (int j = 0; j < 15; j++) {
            List<Square> row = new ArrayList<>();
            for (int i = 0; i < 15; i++) {
                row.add(new Square(j, i, "hit", "DUPA"));
            }
            ocean.add(row);
        }
        for (List<Square> a : ocean){
            for (Square b : a){
                System.out.print(b);
            }
            System.out.println();
            System.out.println();
            System.out.println();
        }
    }




    private static boolean isPlacementOk(int[][] placement) {
        return false;
    }
}


