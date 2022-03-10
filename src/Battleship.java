public class Battleship {
    public static void main(String[] args) {
        Display display = new Display();
        Board board = new Board();
        Board.carrierPlacement(board);
        for (int i = 0; i < 2; i++) {
            Board.battleshipPlacement(board);
        }
        for (int i = 0; i < 4; i++) {
            Board.CruiserPlacement(board);
        }
        for (int i = 0; i < 4; i++) {
            Board.SubmarinePlacement(board);
        }
        display.displayBoard(board);

    }

    public void displayMenu(){

    }
}
