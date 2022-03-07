public class Square {
    private int xPos;
    private int yPos;
    boolean isShip;
    boolean isEmptySquare;
    boolean isHitShip;
    boolean isEmptyHit;
    String objectName;

    public Square(int xPos, int yPos, boolean isShip, boolean isEmptySquare, boolean isHitShip, boolean isEmptyHit, String objectName) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.isShip = isShip;
        this.isEmptySquare = isEmptySquare;
        this.isHitShip = isHitShip;
        this.isEmptyHit = isEmptyHit;
        this.objectName = objectName;
    }


    public static int[][] getPos(){
        return null;
    }

    public static boolean getSquareStatus(){
        return false;
    }
}
