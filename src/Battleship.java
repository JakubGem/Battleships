public class Battleship {
    public static void main(String[] args) {
        Display display = new Display();
        Board board = new Board();
        BoardFactory.randomPlacement(board);
        display.displayBoard(board);

    }

    public void displayMenu(){

    }
}
