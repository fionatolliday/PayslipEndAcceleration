package calculator;

public class SuperannuationCalculator {

    public double getSuperannuation(double grossIncome, float superRate){
        float superAmount = superRate/100;
        return grossIncome * superAmount;
    }

}


//super = 5,004 x 9% = 450.36 (round down) = 450