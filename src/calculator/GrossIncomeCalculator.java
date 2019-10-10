package calculator;

public class GrossIncomeCalculator {


    public int getGrossIncome(double annualIncome){
        double grossIncomeWithDecimal = annualIncome/12;
        return (int)Math.round(grossIncomeWithDecimal);
    }



}

