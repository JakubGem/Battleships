import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Input {

    public static String getUserInput() {
        System.out.print("Please enter an coordinates: ");
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

    public static List getCoordinatesFromInput() {
        ArrayList coordinatesList = new ArrayList();
        String userInput = getUserInput();
            while (true) {
            if (validateInput(userInput)) {
                break;
            }
            System.out.println("Please enter correct coordinates.");
            userInput = getUserInput();
        }
        int letterIndex = userInput.length() - 1;
        int xCoordinate = Integer.parseInt(userInput.substring(0, letterIndex)) - 1;
        int yCoordinate = userInput.charAt(letterIndex) - 'a';
        coordinatesList.add(xCoordinate);
        coordinatesList.add(yCoordinate);
        System.out.println(yCoordinate);

        return coordinatesList;
    }
}