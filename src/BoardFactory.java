import java.util.List;
import java.util.Random;

//Carrier5, Cruiser3, Battleship4, Submarine2, and Destroyer1.
public class BoardFactory {
    public static void randomPlacement(Board board) {
//        randomCarrierPlacement(board);
        randomBattleshipPlacement(board);

    }

//    public static void randomCarrierPlacement(Board board) {
//        int[] varResult = Board.carrierPlacement(board);
//        int right = varResult[0];
//        int down = varResult[1];
//        int result1 = varResult[2];
//        int result2 = varResult[3];
//        for(int i=0; i<5; i++) {
//            if (right == 1) {
//                board.ocean.get(result1 ).get(result2+ i).setStatusSquare("S");
//                System.out.println("działa");
//            } else if (down ==1) {
//                board.ocean.get(result1+ i ).get(result2).setStatusSquare("S");
//                System.out.println("działa w elsie");
//            }
//        }randomBattleshipPlacement(board);CruiserPlacement
//    }

    public static void randomBattleshipPlacement(Board board) {
        int[] numberOfFunction = {1, 2, 3, 4, 5};
        int shipLength=0;
        int[] varResult;
        for (int n = 0; n < numberOfFunction.length; n++) {
            if (numberOfFunction[n] == 1) {
                varResult = Board.carrierPlacement(board);
                shipLength = 5;
            } else if (numberOfFunction[n] == 2) {
                varResult = Board.battleshipPlacement(board);
                shipLength = 4;
            } else if (numberOfFunction[n] == 3) {
                varResult = Board.CruiserPlacement(board);
                shipLength = 3;
            } else if (numberOfFunction[n] == 4) {
                varResult = Board.SubmarinePlacement(board);
                shipLength = 2;
            }else{
                varResult = Board.DestroyerPlacement(board);
                shipLength=1;
            }
//        int[] varResult = Board.battleshipPlacement(board);
            int right = varResult[0];
            int down = varResult[1];
            int result1 = varResult[2];
            int result2 = varResult[3];
            for (int i = 0; i < shipLength; i++) {
                if (right == 1) {
                    board.ocean.get(result1).get(result2 + i).setStatusSquare("S");
                    System.out.println("działa");
                } else if (down == 1) {
                    board.ocean.get(result1 + i).get(result2).setStatusSquare("S");
                    System.out.println("działa w elsie");
                }
            }
        }
    }



//    {
//        draw(board);
//        int result[] = random(board);
//        if(board.ocean.get(result[0]).get(result[1]).getStatusSquare().equals("O")){
//            board.ocean.get(result[0]).get(result[1]).setStatusSquare("S");
//        }
//    }
//    public static void randomPlacement(Board board) {
//        int[] resultShip = ships();
//        for (int i = 0; i < resultShip.length; i++) {
//            try {
//                if (resultShip[i] == 5) {
//                    int[] result = random(board);
//                    if (board.ocean.get(result[0]).get(result[1]).getStatusSquare().equals("O") && board.ocean.get(result[0] + 1).get(result[1]).getStatusSquare().equals("O")
//                            && board.ocean.get(result[0] + 2).get(result[1]).getStatusSquare().equals("O") && board.ocean.get(result[0] + 3).get(result[1]).getStatusSquare().equals("O")
//                            && board.ocean.get(result[0] + 4).get(result[1]).getStatusSquare().equals("O")) {
//                        for (int d = 0; d < 5; d++) {
//                            board.ocean.get(result[0]).get(result[1] + d).setStatusSquare("S");
//                            System.out.println("if");
//                        }
//                    } else if (board.ocean.get(result[0]).get(result[1]).getStatusSquare().equals("O") && board.ocean.get(result[0]).get(result[1] + 1).getStatusSquare().equals("O")
//                            && board.ocean.get(result[0]).get(result[1] + 2).getStatusSquare().equals("O") && board.ocean.get(result[0]).get(result[1] + 3).getStatusSquare().equals("O")
//                            && board.ocean.get(result[0]).get(result[1] + 4).getStatusSquare().equals("O")) {
//                        for (int d = 0; d < 5; d++) {
//                            board.ocean.get(result[0] + d).get(result[1]).setStatusSquare("S");
//                            System.out.println("elseif");
//                        }
//                    } else {
//                        System.out.println("dupa1");
//                        resultValidation(board);
//                    }
//
//
//                } else if (resultShip[i] == 4) {
//
//                        int[] result = random(board);
//                        if (board.ocean.get(result[0]).get(result[1]).getStatusSquare().equals("O") && board.ocean.get(result[0] + 1).get(result[1]).getStatusSquare().equals("O")
//                                && board.ocean.get(result[0] + 2).get(result[1]).getStatusSquare().equals("O") && board.ocean.get(result[0] + 3).get(result[1]).getStatusSquare().equals("O")) {
//                            for (int d = 0; d < 4; d++) {
//                                board.ocean.get(result[0]).get(result[1] + d).setStatusSquare("S");
//                            }
//                        } else if (board.ocean.get(result[0]).get(result[1]).getStatusSquare().equals("O") && board.ocean.get(result[0]).get(result[1] + 1).getStatusSquare().equals("O")
//                                && board.ocean.get(result[0]).get(result[1] + 2).getStatusSquare().equals("O") && board.ocean.get(result[0]).get(result[1] + 3).getStatusSquare().equals("O")) {
//                            for (int d = 0; d < 4; d++) {
//                                board.ocean.get(result[0] + d).get(result[1]).setStatusSquare("S");
//                            }
//                        } else {
//                            resultValidation(board);
//                        }
//                    }

//                else if (resultShip[i] == 3) {
//                    for (int d = 0; d < 3; d++) {
//                        int[] result = random(board);
//                        if (board.ocean.get(result[0]).get(result[1]).getStatusSquare().equals("O") && board.ocean.get(result[0] + 1).get(result[1]).getStatusSquare().equals("O")
//                                && board.ocean.get(result[0] + 2).get(result[1]).getStatusSquare().equals("O")) {
//                            board.ocean.get(result[0] + d).get(result[1]).setStatusSquare("S");
//                        } else if (board.ocean.get(result[0]).get(result[1]).getStatusSquare().equals("O") && board.ocean.get(result[0]).get(result[1] + 1).getStatusSquare().equals("O")
//                                && board.ocean.get(result[0]).get(result[1] + 2).getStatusSquare().equals("O")) {
//                            board.ocean.get(result[0]).get(result[1] + d).setStatusSquare("S");
//                        }else{
//                            resultValidation(board);
//                        }
//                    }
//                } else if (resultShip[i] == 2) {
//                    for (int d = 0; d < 2; d++) {
//                        int[] result = random(board);
//                        if (board.ocean.get(result[0]).get(result[1]).getStatusSquare().equals("O") && board.ocean.get(result[0] + 1).get(result[1]).getStatusSquare().equals("O")) {
//                            board.ocean.get(result[0] + d).get(result[1]).setStatusSquare("S");
//                        } else if (board.ocean.get(result[0]).get(result[1]).getStatusSquare().equals("O") && board.ocean.get(result[0]).get(result[1] + 1).getStatusSquare().equals("O")) {
//                            board.ocean.get(result[0]).get(result[1] + d).setStatusSquare("S");
//                        }else{
//                            resultValidation(board);
//                        }
//                    }
//                } else if (resultShip[i] == 1) {
//                    int[] result = random(board);
//                    if (board.ocean.get(result[0]).get(result[1]).getStatusSquare().equals("O")) {
//                        board.ocean.get(result[0]).get(result[1]).setStatusSquare("S");
//                    } else if (board.ocean.get(result[0] + 1).get(result[1] + 1).getStatusSquare().equals("O")) {
//                        board.ocean.get(result[0] + 1).get(result[1] + 1).setStatusSquare("S");
//                    }else{
//                        resultValidation(board);
//                    }
//                }
//                }catch(IndexOutOfBoundsException e){
//                System.out.println("EXCEPT");
//                    resultValidation(board);
//
//                }
//            }
//
//        }



    public static int[] random(Board board){
        Random rand = new Random();
        int max = 14;
        int randomx = rand.nextInt(1, 15);
        int randomy = rand.nextInt(1,15);
        System.out.println(randomx);
        System.out.println(randomy);
        return new int[] {randomx-1, randomy-1};
    }

//    public static int[] ships(){
//        int Carrier = 5;
//        int Battleship = 4;
//        int Cruiser = 3;
//        int Submarine = 2;
//        int Destroyer = 1;
//        return new int[] {Carrier, Battleship};
//    }



    public static void manualPlacement(){

    }

}
