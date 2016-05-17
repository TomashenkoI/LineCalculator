package Test;

import Main.ExpressionTransformation;
import org.junit.Assert;
import org.junit.Test;


/**
 * Created by 7 on 14.05.2016.
 */
public class ExpressionTransformationTest {
    ExpressionTransformation expTr = new ExpressionTransformation();

    @Test
    public void testExpressionTransformation() throws Exception {
        String inputedString = "2 + 5 * (3 + 2)";
        String exceptedResult = "2 5 3 2 + * +";

        Assert.assertEquals(exceptedResult, expTr.expressionTransformation(inputedString));
    }
    @Test
    public void testExpressionTransformation1() throws Exception {
        String inputedString = "(1 + 2) * 4 + 3";
        String exceptedResult = "1 2 + 4 * 3 +";

        Assert.assertEquals(exceptedResult, expTr.expressionTransformation(inputedString));
    }
    @Test
    public void testExpressionTransformation2() throws Exception {
        String inputedString = "15.458 + 2 * 9 - 4 / (2 * (3 + 2))";
        String exceptedResult = "15.458 2 9 * + 4 2 3 2 + * / -";

        Assert.assertEquals(exceptedResult, expTr.expressionTransformation(inputedString));
    }
    @Test
    public void testExpressionTransformation3() throws Exception {
        String inputedString = "3 + 4 * 2 / (1 - 5) + 2";
        String exceptedResult = "3 4 2 * 1 5 - / + 2 +";

        Assert.assertEquals(exceptedResult, expTr.expressionTransformation(inputedString));
    }
}
