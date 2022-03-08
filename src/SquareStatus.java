public class SquareStatus {

    public enum status {
        OCEAN, HIT, MISS, SHIP, DESTROYED;
    }

    public static String getCharacter(status statusSquare) {
        return switch (statusSquare) {
            case OCEAN -> "O";
            case HIT -> "H";
            case MISS -> "M";
            case SHIP -> "S";
            case DESTROYED -> "D";
        };
    }
}
