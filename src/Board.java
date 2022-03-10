import java.util.ArrayList;
import java.util.List;

public class Board {


    public List<List<Square>> ocean = new ArrayList<>();



    public Board(List<List<Square>> firstPlayerOcean) {
        for (int j = 0; j < 15; j++) {
            List<Square> row = new ArrayList<>();
            for (int i = 0; i < 15; i++) {
                row.add(new Square(j, i, SquareStatus.status.OCEAN, "DUPA"));
            }
            firstPlayerOcean.add(row);
        }
//        for (List<Square> a : ocean){
//            for (Square b : a){
//                System.out.print(b);
//            }
//            System.out.println();
//            System.out.println();
//            System.out.println();
//        }
    }




    private static boolean isPlacementOk(int[][] placement) {
        return false;
    }
}


