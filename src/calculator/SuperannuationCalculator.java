package calculator;

public class SuperannuationCalculator {

    public double getSuperannuation(double grossIncome, float superRate){
        float superAmount = superRate/100;
        return grossIncome * superAmount;
    }

}

