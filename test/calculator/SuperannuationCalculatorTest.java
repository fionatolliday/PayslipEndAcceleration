package calculator;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SuperannuationCalculatorTest {

    SuperannuationCalculator superCalc = new SuperannuationCalculator();

    @Test
    void feedIn9PercentSuper_Returns450() {

        double grossIncome = 5004;
        float superRate = 9;

        int expected = 450;
        int actual = superCalc.getSuperannuation(grossIncome, superRate);

        Assert.assertEquals(expected, actual);
    }
}