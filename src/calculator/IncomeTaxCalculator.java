package calculator;

import tax.TaxBands;

public class IncomeTaxCalculator {

    private final TaxBands taxbands;

    public IncomeTaxCalculator(TaxBands taxBands){
        this.taxbands = taxBands;
    }


    public double getIncomeTax(double annualIncome) {
        return (taxbands.taxBandLumpSum(annualIncome) + (annualIncome - taxbands.upperTaxBracket(annualIncome)) * taxbands.taxBandPercentage(annualIncome))/12;
    }


}

