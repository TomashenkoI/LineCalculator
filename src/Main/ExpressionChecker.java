package Main;

import java.util.ArrayList;

/**
 * Created by 7 on 13.05.2016.
 */
public class ExpressionChecker {
    public static boolean checkExpression (String inputedString, boolean correct) {
        correct = false;
        boolean isNotEmpty = false;
        boolean isItValidSymbol = false;
        ArrayList<Character> validSymbols = new ArrayList<>();
        for (char c = '0'; c < '9'; c++) {
            validSymbols.add(c);
        }
        validSymbols.add('+');
        validSymbols.add('-');
        validSymbols.add('*');
        validSymbols.add('/');
        validSymbols.add('(');
        validSymbols.add(')');
        validSymbols.add(' ');
        validSymbols.add('.');

        if (inputedString.length() == 0) {
            System.out.println("You haven't entered the expression! Try again.");
            System.out.println();
        } else isNotEmpty = true;

        if (isNotEmpty) {
            isItValidSymbol = true;
            for (int i = 0; i < inputedString.length(); i++) {
                if (isItValidSymbol) {
                    for (int j = 0; j < validSymbols.size(); j++) {
                        if (inputedString.charAt(i) == validSymbols.get(j)) {
                            isItValidSymbol = true;
                            break;
                        } else isItValidSymbol = false;
                    }
                } else {
                    System.out.println("Incorrect expression! Try again.");
                    System.out.println();
                    break;
                }
            }
        }
        if (isItValidSymbol) {
            correct = true;
        }
        return correct;
    }
}
