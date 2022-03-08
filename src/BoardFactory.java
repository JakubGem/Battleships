import java.util.List;
import java.util.Random;

//Carrier5, Cruiser3, Battleship4, Submarine2, and Destroyer1.
public class BoardFactory {

    public static void randomPlacement(Board board){
        draw(board);
        int result[] = random(board);
        if(board.ocean.get(result[0]).get(result[1]).getStatusSquare().equals("O")){
            board.ocean.get(result[0]).get(result[1]).setStatusSquare("S");

        }




    }

    public static void draw(Board board) {
        int[] result = ships();
        for(int i=0; i< result.length; i++) {
//            System.out.println(result[i]);
            if (result[i] == 5) {
                if(board.ocean.get(result[0]).get(result[1]).getStatusSquare().equals("O") && board.ocean.get(result[0+1]).get(result[1]).getStatusSquare().equals("O")
                        && board.ocean.get(result[0+2]).get(result[1]).getStatusSquare().equals("O") && board.ocean.get(result[0+3]).get(result[1]).getStatusSquare().equals("O")
                        && board.ocean.get(result[0+4]).get(result[1]).getStatusSquare().equals("O")) {
                        board.ocean.get(result[0]).get(result[1]).setStatusSquare("S") &&
                                board.ocean.get(result[0+1]).get(result[1]).setStatusSquare("S") && board.ocean.get(result[0+2]).get(result[1]).setStatusSquare("S") &&
                                board.ocean.get(result[0+3]).get(result[1]).setStatusSquare("S") && board.ocean.get(result[0+4]).get(result[1]).setStatusSquare("S");

                }
            }
        }
    }

    public static int[] random(Board board){
        Random rand = new Random();
        int max = board.ocean.size()-1;
        int randomx = rand.nextInt(max);
        int randomy = rand.nextInt(max);
        return new int[] {randomx, randomy};
    }

    public static int[] ships(){
        int statek1 = 5;
        int statek2 = 4;
        int statek3 = 3;
        return new int[] {statek1, statek2, statek3};
    }


    public static void manualPlacement(){

    }

}
