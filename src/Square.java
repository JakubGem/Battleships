public class Square {
    private int xPos;
    private int yPos;
    public SquareStatus.status statusSquare;
    public String objectName;

    public Square(int xPos, int yPos, SquareStatus.status statusSquare, String objectName) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.statusSquare = statusSquare;
        this.objectName = objectName;
    }


    public static int[][] getPos(){
        return null;
    }

    public String getSquareStatus(){
        return(SquareStatus.getCharacter(statusSquare));
    }

    @Override
    public String toString() {
        return "Square{" +
                "xPos=" + xPos +
                ", yPos=" + yPos +
                ", statusSquare='" + statusSquare + '\'' +
                ", objectName='" + objectName + '\'' +
                '}';
    }
}
