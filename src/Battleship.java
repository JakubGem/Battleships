import java.util.ArrayList;
import java.util.List;

public class Battleship {
    public static void main(String[] args) {
        List<List<Square>> firstPlayerOcean = new ArrayList<>();
        List<List<Square>> secondPlayerOcean = new ArrayList<>();
        Input.getCoordinatesFromInput();
        Display display = new Display();
        Board playerOne = new Board(firstPlayerOcean);
        Board playerTwo = new Board(secondPlayerOcean);

        Board.informationToValidate(playerOne);
        Board.informationToValidate(playerTwo);

        display.displayBoard(playerOne.ocean, playerTwo.ocean);
        display.displayBoard(playerTwo.ocean, playerOne.ocean);

    }

    public void displayMenu(){

    }
}
