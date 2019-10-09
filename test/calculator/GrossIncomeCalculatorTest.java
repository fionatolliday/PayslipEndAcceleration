package calculator;
import org.junit.Assert;
import org.junit.Test;

public class GrossIncomeCalculatorTest {

    GrossIncomeCalculator grossIncomeCalculator = new GrossIncomeCalculator();


    @Test
    public void putInAnnualIncome_ReturnsMonthlyIncome(){
        int annualIncome = 60000;

        double expected = 5000.0;
        double actual = grossIncomeCalculator.getGrossIncome(annualIncome);

        Assert.assertEquals(expected, actual, 0);
    }

}