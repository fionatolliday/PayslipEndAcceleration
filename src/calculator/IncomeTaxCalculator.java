package calculator;

import tax.TaxBands;

public class IncomeTaxCalculator {

    TaxBands taxbands = new TaxBands();

    public double getIncomeTax(double annualIncome) {
        return (taxbands.taxBandLumpSum(annualIncome) + (annualIncome - taxbands.upperTaxBracket(annualIncome)) * taxbands.taxBandPercentage(annualIncome))/12;
    }


}

//    income tax = (3,572 + (60,050 - 37,000) x 0.325) / 12 = 921.9375 (round up) = 922

//    Taxable Income	Tax on this Income
//        $0 - $18,200	Nil
//        $18,201 - $37,000	19c for each $1 over $18,200
//        $37,001 - $87,000	$3,572 plus 32.5c for each $1 over $37,000
//        $87,001 - $180,000	$19,822 plus 37c for each $1 over $87,000
//        $180,001 and over	$54,232 plus 45c for each $1 over $180,000