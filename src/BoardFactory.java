import java.util.List;
import java.util.Random;

public class BoardFactory {


    public static void randomPlacement(Board board, int shipLength, int way, int[] result) {
        for (int i = 0; i < shipLength; i++) {
            if (way == 1) {
                board.ocean.get(result[0]).get(result[1] + i).setStatusSquare("S");
            } else if (way == 2) {
                board.ocean.get(result[0] + i).get(result[1]).setStatusSquare("S");
            }
        }
    }

    public static int[] random() {
        Random rand = new Random();
        int randomx = rand.nextInt(1, 15);
        int randomy = rand.nextInt(1, 15);
        System.out.println(randomx);
        System.out.println(randomy);
        return new int[]{randomx - 1, randomy - 1};
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

//    public static int[] ships(){
//        int Carrier = 5;
//        int Battleship = 4;
//        int Cruiser = 3;
//        int Submarine = 2;
//        int Destroyer = 1;
//        return new int[] {Carrier, Battleship};
//    }


    public static void manualPlacement() {

    }

}
