package Main;

import java.util.*;

/**
 * Created by 7 on 13.05.2016.
 */
public class Input {
    Scanner scanner = new Scanner(System.in);
    private String inputedString = null;
    private boolean isItCorrect = false;

    public String reciption () {
        while (isItCorrect == false) {
            System.out.println("Enter your expression: ");
            inputedString = scanner.nextLine();
            isItCorrect = ExpressionChecker.checkExpression(inputedString, isItCorrect);
        }
        return inputedString;
    }
}
