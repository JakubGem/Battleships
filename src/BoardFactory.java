import java.util.List;
import java.util.Random;

//Carrier5, Cruiser3, Battleship4, Submarine2, and Destroyer1.
public class BoardFactory {

//    {
//        draw(board);
//        int result[] = random(board);
//        if(board.ocean.get(result[0]).get(result[1]).getStatusSquare().equals("O")){
//            board.ocean.get(result[0]).get(result[1]).setStatusSquare("S");
//        }
//    }
    public static void randomPlacement(Board board) {
        int[] resultShip = ships();
        int[] result = random(board);
        for(int i=0; i< result.length; i++) {
            if (resultShip[i] == 5) {
                for(int d=0; d<5; d++){
                    if(board.ocean.get(result[0]).get(result[1]).getStatusSquare().equals("O") && board.ocean.get(result[0+1]).get(result[1]).getStatusSquare().equals("O")
                            && board.ocean.get(result[0+2]).get(result[1]).getStatusSquare().equals("O") && board.ocean.get(result[0+3]).get(result[1]).getStatusSquare().equals("O")
                            && board.ocean.get(result[0+4]).get(result[1]).getStatusSquare().equals("O")) {
                        board.ocean.get(result[0+d]).get(result[1]).setStatusSquare("S");
                    }else if (board.ocean.get(result[0]).get(result[1]).getStatusSquare().equals("O") && board.ocean.get(result[0]).get(result[1+1]).getStatusSquare().equals("O")
                            && board.ocean.get(result[0]).get(result[1+2]).getStatusSquare().equals("O") && board.ocean.get(result[0]).get(result[1+3]).getStatusSquare().equals("O")
                            && board.ocean.get(result[0]).get(result[1+4]).getStatusSquare().equals("O")){
                        board.ocean.get(result[0]).get(result[1+d]).setStatusSquare("S");
                    }
                }
            }
            else if(resultShip[i] == 4){
                for(int d=0; d<4; d++) {
                    if (board.ocean.get(result[0]).get(result[1]).getStatusSquare().equals("O") && board.ocean.get(result[0+1]).get(result[1]).getStatusSquare().equals("O")
                            && board.ocean.get(result[0+2]).get(result[1]).getStatusSquare().equals("O") && board.ocean.get(result[0+3]).get(result[1]).getStatusSquare().equals("O")) {
                        board.ocean.get(result[0+d]).get(result[1]).setStatusSquare("S");
                    }else if (board.ocean.get(result[0]).get(result[1]).getStatusSquare().equals("O") && board.ocean.get(result[0]).get(result[1+1]).getStatusSquare().equals("O")
                            && board.ocean.get(result[0]).get(result[1+2]).getStatusSquare().equals("O") && board.ocean.get(result[0]).get(result[1+3]).getStatusSquare().equals("O")) {
                        board.ocean.get(result[0]).get(result[1+d]).setStatusSquare("S");
                    }
                }
            }
            else if(resultShip[i] == 3){
                for(int d=0; d<3; d++) {
                    if (board.ocean.get(result[0]).get(result[1]).getStatusSquare().equals("O") && board.ocean.get(result[0+1]).get(result[1]).getStatusSquare().equals("O")
                            && board.ocean.get(result[0+2]).get(result[1]).getStatusSquare().equals("O")) {
                        board.ocean.get(result[0+d]).get(result[1]).setStatusSquare("S");
                    }else if (board.ocean.get(result[0]).get(result[1]).getStatusSquare().equals("O") && board.ocean.get(result[0]).get(result[1+1]).getStatusSquare().equals("O")
                            && board.ocean.get(result[0]).get(result[1+2]).getStatusSquare().equals("O")) {
                        board.ocean.get(result[0]).get(result[1+d]).setStatusSquare("S");
                    }
                }
            }
            else if(resultShip[i] == 2){
                for(int d=0; d<2; d++) {
                    if (board.ocean.get(result[0]).get(result[1]).getStatusSquare().equals("O") && board.ocean.get(result[0+1]).get(result[1]).getStatusSquare().equals("O")) {
                        board.ocean.get(result[0+d]).get(result[1]).setStatusSquare("S");
                    }else if (board.ocean.get(result[0]).get(result[1]).getStatusSquare().equals("O") && board.ocean.get(result[0]).get(result[1+1]).getStatusSquare().equals("O")) {
                        board.ocean.get(result[0]).get(result[1+d]).setStatusSquare("S");
                    }
                }
            }else if(resultShip[i] == 1){
                if (board.ocean.get(result[0]).get(result[1]).getStatusSquare().equals("O")) {
                    board.ocean.get(result[0]).get(result[1]).setStatusSquare("S");
                }else if (board.ocean.get(result[0+1]).get(result[1+1]).getStatusSquare().equals("O")) {
                    board.ocean.get(result[0+1]).get(result[1+1]).setStatusSquare("S");
                }
            }
        }
    }

    public static int[] random(Board board){
        Random rand = new Random();
        int max = board.ocean.size()-1;
        int randomx = rand.nextInt(max);
        int randomy = rand.nextInt(max);
        System.out.println(randomx);
        System.out.println(randomy);
        return new int[] {randomx, randomy};
    }

    public static int[] ships(){
        int Carrier = 5;
        int Battleship = 4;
        int Cruiser = 3;
        int Submarine = 2;
        int Destroyer = 1;
        return new int[] {Carrier, Cruiser, Battleship, Submarine, Destroyer};
    }


    public static void manualPlacement(){

    }

}
