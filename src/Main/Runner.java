package Main;

/**
 * Created by 7 on 13.05.2016.
 */
public class Runner {
    public static void main(String[] args) {
        Input input = new Input();
        Calculation calculation = new Calculation();

        double result = calculation.calculateExpression(input.reciption());

        System.out.println(result);
    }
}
