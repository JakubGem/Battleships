import java.util.ArrayList;
import java.util.List;

public class Player {
    static Display display = new Display();
    public static boolean handleShots(int[] shootingCoordinates, List<List<Square>> board) {
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
                isAllHit(board);
                return true;

        }
        System.out.println(board.get(coordinateX).get(coordinateY).getStatusSquare());

        return false;
    }

    public static boolean canShoot(int[] shootingCoordinates, List<List<Square>> board) {
        int coordinateX = shootingCoordinates[0];
        int coordinateY = shootingCoordinates[1];
        if (board.get(coordinateX).get(coordinateY).getStatusSquare() == SquareStatus.status.MISS || board.get(coordinateX).get(coordinateY).getStatusSquare() == SquareStatus.status.HIT) {
            return false;
        }
        return true;
    }

    public static boolean isAlive(List<List<Square>> board) {
        for (List<Square> list : board) {
            for (Square object : list) {
                if (object.getStatusSquare() == SquareStatus.status.SHIP) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void isAllHit(List<List<Square>> board) {
        for (int row=0; row<board.toArray().length; row++) {
            for (int col=0; col<board.toArray().length; col++) {
                if (board.get(row).get(col).getStatusSquare() == SquareStatus.status.HIT) {
                    String shipName = board.get(row).get(col).getObjectName();
                    int way = board.get(row).get(col).getObjectWay();
                    int shipLength=0;
                    if (shipName.equals("CARRIER")){
                        shipLength=5;
                    } else if (shipName.equals("BATTLESHIP")){
                        shipLength=4;
                    } else if (shipName.equals("CRUISER")){
                        shipLength=3;
                    }else if (shipName.equals("SUBMARINE")){
                        shipLength=2;
                    }
                    int count=1;
                    List<Integer> listOfCoordinatesDestroyedShips = new ArrayList<>();
                    for (int i=1; i<=shipLength; i++){
                        if (way==1){
                            if (board.get(row).get(col+i).getStatusSquare() != SquareStatus.status.HIT){
                                break;
                            } else {
                                listOfCoordinatesDestroyedShips.add(row);
                                listOfCoordinatesDestroyedShips.add(col+i);
                                count++;
                            }
                            if (board.get(row).get(col-i).getStatusSquare() != SquareStatus.status.HIT){
                                break;
                            } else {
                                listOfCoordinatesDestroyedShips.add(row);
                                listOfCoordinatesDestroyedShips.add(col-i);
                                count++;
                            }
                        } else {
                            if (board.get(row+i).get(col).getStatusSquare() != SquareStatus.status.HIT){
                                break;
                            } else {
                                listOfCoordinatesDestroyedShips.add(row+i);
                                listOfCoordinatesDestroyedShips.add(col);
                                count++;
                            }
                            if (board.get(row-i).get(col).getStatusSquare() != SquareStatus.status.HIT){
                                break;
                            } else {
                                listOfCoordinatesDestroyedShips.add(row-i);
                                listOfCoordinatesDestroyedShips.add(col);
                                count++;
                            }
                        }
                        listOfCoordinatesDestroyedShips.add(row);
                        listOfCoordinatesDestroyedShips.add(col);
                    }
                    if (count==shipLength){
                        for (int r=0; r<listOfCoordinatesDestroyedShips.toArray().length; r++){
                            if (r%2==0){
                                int newRow = listOfCoordinatesDestroyedShips.get(r);
                                int newCol = listOfCoordinatesDestroyedShips.get(r+1);
                                board.get(newRow).get(newCol).setStatusSquare(SquareStatus.status.DESTROYED);
                            }
                        }
                        display.alertDestroyed();
                    }
                }
            }
        }
    }


}
