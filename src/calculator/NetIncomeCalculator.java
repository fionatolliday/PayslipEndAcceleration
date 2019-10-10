package calculator;

public class NetIncomeCalculator {

    public int getNetIncome(double grossIncome, double incomeTax){
        double netIncomeWithDecimal = grossIncome - incomeTax;
        return (int)Math.round(netIncomeWithDecimal);
    }

}

