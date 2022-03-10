import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Input {
    Display display = new Display();

    public static String getUserInput() {
        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine();
        return userInput;

    }

    public static Boolean validateInput(String input) {
        int letterIndex = input.length() - 1;
        int letterCoordinate = input.charAt(letterIndex) - 'a';
        if (letterCoordinate < 0) {
            return false;
        }

        try {
            Integer.parseInt(input.substring(0, letterIndex));
        } catch (NumberFormatException exception) {
            return false;
        }

        return true;
    }

    public int[] getCoordinatesFromInput() {
        int[] coordinatesList = new int[2];
        String userInput = getUserInput();
        int letterIndex = userInput.length() - 1;
        int xCoordinate = Integer.parseInt(userInput.substring(0, letterIndex)) - 1;
        int yCoordinate = userInput.charAt(letterIndex) - 'a';
        if (xCoordinate < 15 && xCoordinate >= 0 && yCoordinate < 15 && yCoordinate >= 0) {
            coordinatesList[0] = xCoordinate;
            coordinatesList[1] = yCoordinate;


        } else {
            display.alertPleaseGiveCorrectCoordinates();
            coordinatesList = getCoordinatesFromInput();
        }
        return coordinatesList;
    }
}