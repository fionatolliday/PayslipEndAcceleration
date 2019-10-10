package calculator;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NetIncomeCalculatorTest {

    NetIncomeCalculator netIncomeCalculator = new NetIncomeCalculator();

    @Test
    void feedInGrossIncomeAndIncomeTest_ReturnsNetIncome() {

        double grossIncome = 5004;
        double incomeTax = 922;

        int expected = 4082;
        int actual = netIncomeCalculator.getNetIncome(grossIncome, incomeTax);

        Assert.assertEquals(expected, actual);

    }
}