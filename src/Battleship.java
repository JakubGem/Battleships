public class Battleship {
    public static void main(String[] args) {
        Display display = new Display();
        Board board = new Board();
        Board.informationToValidate(board);

        display.displayBoard(board);

    }

    public void displayMenu(){

    }
}
