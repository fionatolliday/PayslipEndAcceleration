package calculator;

import tax.TaxBands;

public class IncomeTaxCalculator {

    private final TaxBands taxbands;

    public IncomeTaxCalculator(TaxBands taxBands){
        this.taxbands = taxBands;
    }

    public int getIncomeTax(double annualIncome) {
        double incomeTaxWithDecimal = (taxbands.taxBandLumpSum(annualIncome) + (annualIncome - taxbands.upperTaxBracket(annualIncome)) * taxbands.taxBandPercentage(annualIncome))/12;

        return (int)Math.round(incomeTaxWithDecimal);
    }


}

