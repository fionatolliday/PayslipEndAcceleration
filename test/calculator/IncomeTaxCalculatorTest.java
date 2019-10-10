package calculator;
import org.junit.Assert;
import org.junit.Test;
import tax.TaxBands;

public class IncomeTaxCalculatorTest {

    IncomeTaxCalculator incomeTaxCalculator = new IncomeTaxCalculator(new TaxBands());


    @Test
    public void putInAnnualIncome_ReturnsMonthlyIncome(){
        int annualIncome = 60050;

        int expected = 922;
        int actual = incomeTaxCalculator.getIncomeTax(annualIncome);

        Assert.assertEquals(expected, actual);
    }


}

