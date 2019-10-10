package calculator;

public class SuperannuationCalculator {

    public int getSuperannuation(double grossIncome, float superRate){
        float superAmount = superRate/100;
        double grossIncomeWithDecimal = grossIncome * superAmount;
        return (int)Math.round(grossIncomeWithDecimal);
    }

}

