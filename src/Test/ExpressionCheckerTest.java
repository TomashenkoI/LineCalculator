package Test;

import Main.ExpressionChecker;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by 7 on 14.05.2016.
 */
public class ExpressionCheckerTest {
    ExpressionChecker expCh = new ExpressionChecker();

    @Test
    public void testExpressionChecker() throws Exception {
        String inputedString = "2 x 4 + 5 * (3 + 2)";
        boolean correct = true;
        boolean exceptedResult = false;

        Assert.assertEquals(exceptedResult, expCh.checkExpression(inputedString,correct));
    }
    @Test
    public void testExpressionChecker1() throws Exception {
        String inputedString = "2 * 4 = 5 * (3 + 2)";
        boolean correct = true;
        boolean exceptedResult = false;

        Assert.assertEquals(exceptedResult, expCh.checkExpression(inputedString,correct));
    }
    @Test
    public void testExpressionChecker2() throws Exception {
        String inputedString = "2 * 4 + 5 * (3 + 2)";
        boolean correct = true;
        boolean exceptedResult = true;

        Assert.assertEquals(exceptedResult, expCh.checkExpression(inputedString,correct));
    }
}
