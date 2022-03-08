public class Square {
    int xPos;
    int yPos;

    public void setStatusSquare(String statusSquare) {
        this.statusSquare = statusSquare;
    }


    public String statusSquare;
    public  String objectName;

    public String getStatusSquare() {
        return statusSquare;
    }

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public Square(int xPos, int yPos, String statusSquare, String objectName) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.statusSquare = statusSquare;
        this.objectName = objectName;
    }


    public static int[][] getPos(){
        return null;
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
