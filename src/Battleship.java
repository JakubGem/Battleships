import java.util.ArrayList;
import java.util.List;

public class Battleship {
    public static void main(String[] args) {
        List<List<Square>> firstPlayerOcean = new ArrayList<>();
        List<List<Square>> secondPlayerOcean = new ArrayList<>();

        Display display = new Display();
//        Display.chooseMethodOfStagingShips();
//        Display.chooseDifficultyLevel();
//        Display.manualPlacementOfAllFiveKindOfShips();
//        Display.chooseVerticalOrHorizontalPositionOfStagingShips();
//        Display.manualPlacement5HolesShips();
//        Display.manualPlacement4HolesShips();
//        Display.manualPlacement3HolesShips();
//        Display.manualPlacement2HolesShips();
//        Display.manualPlacement1HolesShips();
//        Display.alertYouCanntSetAShipHere();
//        Display.alertYouHaveAlreadyShotThere();
//        Display.alertHitting();
//        Display.alertDestroyed();
//        Display.alertPlaceIsAlreadyTaken();
//        Display.alertWinner("Marcin");
        new Board(firstPlayerOcean);
        new Board(secondPlayerOcean);
//        firstPlayerOcean.get(0).get(4).setStatusSquare("D");
//        firstPlayerOcean.get(0).get(3).setStatusSquare("D");
//        firstPlayerOcean.get(0).get(2).setStatusSquare("D");
//        firstPlayerOcean.get(5).get(2).setStatusSquare("M");
//        firstPlayerOcean.get(7).get(12).setStatusSquare("M");
//        firstPlayerOcean.get(13).get(8).setStatusSquare("H");
//        firstPlayerOcean.get(13).get(9).setStatusSquare("H");
//        firstPlayerOcean.get(13).get(10).setStatusSquare("S");
//        firstPlayerOcean.get(2).get(9).setStatusSquare("S");
//        firstPlayerOcean.get(3).get(9).setStatusSquare("S");
//        firstPlayerOcean.get(4).get(9).setStatusSquare("S");
//        firstPlayerOcean.get(5).get(9).setStatusSquare("S");
//        firstPlayerOcean.get(6).get(9).setStatusSquare("S");
//
//        secondPlayerOcean.get(2).get(13).setStatusSquare("D");
//        secondPlayerOcean.get(2).get(12).setStatusSquare("D");
//        secondPlayerOcean.get(2).get(11).setStatusSquare("D");
//        secondPlayerOcean.get(5).get(7).setStatusSquare("M");
//        secondPlayerOcean.get(11).get(12).setStatusSquare("M");
//        secondPlayerOcean.get(13).get(8).setStatusSquare("H");
//        secondPlayerOcean.get(13).get(9).setStatusSquare("H");
//        secondPlayerOcean.get(13).get(10).setStatusSquare("S");
//        secondPlayerOcean.get(2).get(9).setStatusSquare("S");
//        secondPlayerOcean.get(3).get(9).setStatusSquare("S");
//        secondPlayerOcean.get(4).get(9).setStatusSquare("S");
//        secondPlayerOcean.get(5).get(9).setStatusSquare("S");
//        secondPlayerOcean.get(6).get(9).setStatusSquare("S");
        display.displayBoard(firstPlayerOcean, secondPlayerOcean);
    }

    public void displayMenu(){

    }
}
