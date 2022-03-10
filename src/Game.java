import java.util.ArrayList;
import java.util.List;

public class Game {
    public boolean gameOver;
    public String[] gameModes;
    private static Board playerOne;
    private static Board playerTwo;
    private static final List<List<Square>> firstPlayerOcean = new ArrayList<>();
    private static final List<List<Square>> secondPlayerOcean = new ArrayList<>();
    //Player: isAlive, canShoot, handleShots


    public void playGame() {
        Display display = new Display();
        setBoards(false); //todo replace when manual placement ready, line 73
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

            ArrayList<Integer> inputCoordinates = Input.getCoordinatesFromInput();

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
            //todo manual placement
        }
    }
}
