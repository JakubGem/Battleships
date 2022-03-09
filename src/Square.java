public class Square {
    int xPos;
    int yPos;

    public void setStatusSquare(SquareStatus.status statusSquare) {
        this.statusSquare = statusSquare;
    }


    public SquareStatus.status statusSquare;
    public String objectName;

    public SquareStatus.status getStatusSquare() {
        return statusSquare;
    }

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

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
