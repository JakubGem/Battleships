import java.util.List;

public class Player {
    public static boolean handleShots(int[] shootingCoordinates, List<List<Square>> board){
        Display display = new Display();
        int coordinateX = shootingCoordinates[0];
        int coordinateY = shootingCoordinates[1];
        switch (board.get(coordinateX).get(coordinateY).getStatusSquare()) {
            case OCEAN:
                board.get(coordinateX).get(coordinateY).setStatusSquare(SquareStatus.status.MISS);
                display.alertMiss();
                return false;
            case SHIP:
                board.get(coordinateX).get(coordinateY).setStatusSquare(SquareStatus.status.HIT);
                display.alertHitting();
                return true;

        }
        System.out.println(board.get(coordinateX).get(coordinateY).getStatusSquare());

        return false;
    }

    public static boolean canShoot(int[] shootingCoordinates, List<List<Square>> board){
        int coordinateX = shootingCoordinates[0];
        int coordinateY = shootingCoordinates[1];
        if (board.get(coordinateX).get(coordinateY).getStatusSquare() == SquareStatus.status.MISS || board.get(coordinateX).get(coordinateY).getStatusSquare() == SquareStatus.status.HIT){
            return false;
        }
        return true;
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
