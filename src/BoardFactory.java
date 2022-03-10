import java.util.Random;

public class BoardFactory {


    public static void randomPlacement(Board board, int shipLength, int way, int[] result) {
        String shipName = "none";
        if (shipLength==5){
            shipName = "CARRIER";
        } else if (shipLength==4){
            shipName = "BATTLESHIP";
        } else if (shipLength==3){
            shipName = "CRUISER";
        }else if (shipLength==2){
            shipName = "SUBMARINE";
        }
        for (int i = 0; i < shipLength; i++) {
            if (way == 1) {
                board.ocean.get(result[0]).get(result[1] + i).setStatusSquare(SquareStatus.status.SHIP);
                board.ocean.get(result[0]).get(result[1] + i).setObjectName(shipName);
            } else if (way == 2) {
                board.ocean.get(result[0] + i).get(result[1]).setStatusSquare(SquareStatus.status.SHIP);
                board.ocean.get(result[0] + i).get(result[1]).setObjectName(shipName);
            }
        }
    }

    public static int[] random() {
        Random rand = new Random();
        int randomX = rand.nextInt(1, 15);
        int randomY = rand.nextInt(1, 15);
        return new int[]{randomX - 1, randomY - 1};
    }

    public static void manualPlacement() {

    }

}
