import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Player {
    //public List<Ship> ship = new ArrayList<Ship>();

    public static void handleShots(List<Integer> shootingCoordinates, List<List<Square>> board){
        int coordinateX = shootingCoordinates.get(0);
        int coordinateY = shootingCoordinates.get(1);
        switch (board.get(coordinateX).get(coordinateY).getStatusSquare()) {
            case OCEAN:
                board.get(coordinateX).get(coordinateY).setStatusSquare(SquareStatus.status.MISS);
                break;
            case SHIP:
                board.get(coordinateX).get(coordinateY).setStatusSquare(SquareStatus.status.HIT);
                break;

        }
        System.out.println(board.get(coordinateX).get(coordinateY).getStatusSquare());

    }

    public static boolean isAlive(List<List<Square>> board){
    for(List<Square> list : board) {
        for(Square object : list){
            if(object.getStatusSquare() == SquareStatus.status.SHIP){
                return true;
            }
        }
    }
    return false;
    }
}
