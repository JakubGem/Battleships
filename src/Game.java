import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {
    public boolean gameOver;
    public String[] gameModes;
    private static Board playerOne;
    private static Board playerTwo;
    private static final List<List<Square>> firstPlayerOcean = new ArrayList<>();
    private static final List<List<Square>> secondPlayerOcean = new ArrayList<>();
    Input input = new Input();
    Board board;
    Scanner scanner = new Scanner(System.in);
    //Player: isAlive, canShoot, handleShots


    public void playGame() {
        Display display = new Display();
        System.out.println("chcesz sam ustawić czy automatycznie?");
        boolean manual = false;
        if(scanner.hasNextInt()) {
            int userInput = scanner.nextInt();
            switch (userInput){
                case 1 -> manual = true;
                case 2 -> manual = false;
            }
        } else {
            display.alertPleaseGiveCorrectNumber();
        }
        setBoards(manual); //todo replace when manual placement ready, line 73
        int currentPlayer = 1;

        Board.informationToValidate(playerOne);
        Board.informationToValidate(playerTwo);

        while (!isGameOver()) {
            if (currentPlayer == 1) {
                while(makeMove(playerOne, playerTwo, "One")){
                    continue;
                }
                currentPlayer = 2;
            } else {
                while(makeMove(playerTwo, playerOne, "Two")){
                    continue;
                }
                currentPlayer = 1;
            }
        }
    }



    private boolean makeMove(Board playerOne, Board playerTwo, String player){
        while (true) {
            Display display = new Display();
            display.alertCurrentPlayer(player);
            display.displayBoard(playerOne.ocean, playerTwo.ocean); // display board

            display.manualGiveCoordinateForShot();
            int[] inputCoordinates = input.getCoordinatesFromInput();

            if (Player.canShoot(inputCoordinates, playerTwo.ocean)) {
                boolean lastHit = Player.handleShots(inputCoordinates, playerTwo.ocean);
                return lastHit;
            } else {
                display.alertYouHaveAlreadyShotThere();
            }
        }
    }

    private boolean isGameOver(){
        Display display = new Display();
        if (!Player.isAlive(playerOne.ocean)) {
            display.alertWinner("Two");
            return true;
        } else if (!Player.isAlive(playerTwo.ocean)) {
            display.alertWinner("One");
            return true;
        }
        return false;
    }

    private void setBoards(boolean manual) {
        if (!manual) {
            playerOne = new Board(firstPlayerOcean);
            playerTwo = new Board(secondPlayerOcean);
        } else {
            board.informationToValidateManual((Board) board.ocean);
        }
    }
}
