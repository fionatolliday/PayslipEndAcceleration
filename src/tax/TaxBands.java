package tax;

public class TaxBands {

    private String getTaxBand(double salary) {
        if (salary >= 0 && salary <= 19200) {
            return "Tax band 1";
        }
        if (salary >= 18201 && salary <= 37000) {
            return "Tax band 2";
        }
        if (salary >= 37001 && salary <= 87000) {
            return "Tax band 3";
        }
        if (salary >= 87001 && salary <= 180000) {
            return "Tax band 4";
        } else
            return "Tax band 5";
    }


    public int taxBandLumpSum(double salary) {
        if (getTaxBand(salary) == "Tax band 1"){
        return 0;
        }
        if (getTaxBand(salary) == "Tax band 2"){
            return 0;
        }
        if (getTaxBand(salary) == "Tax band 3"){
            return 3572;
        }
        if (getTaxBand(salary) == "Tax band 4"){
            return 19822;
        }
        else
            return 54232;
    }

    public double taxBandPercentage(double salary) {
        if (getTaxBand(salary) == "Tax band 1") {
            return 0;
        }
        if (getTaxBand(salary) == "Tax band 2") {
            return 0.19;
        }
        if (getTaxBand(salary) == "Tax band 3") {
            return 0.325;
        }
        if (getTaxBand(salary) == "Tax band 4") {
            return 0.37;
        } else
            return 0.45;
    }

    public double upperTaxBracket(double salary) {
        if (getTaxBand(salary) == "Tax band 1") {
            return 0;
        }
        if (getTaxBand(salary) == "Tax band 2") {
            return 18200;
        }
        if (getTaxBand(salary) == "Tax band 3") {
            return 37000;
        }
        if (getTaxBand(salary) == "Tax band 4") {
            return 87000;
        } else
            return 180000;
    }

}
//    income tax = (3,572 + (60,050 - 37,000) x 0.325) / 12 = 921.9375 (round up) = 922

//    Taxable Income	Tax on this Income
//        $0 - $18,200	Nil
//        $18,201 - $37,000	19c for each $1 over $18,200
//        $37,001 - $87,000	$3,572 plus 32.5c for each $1 over $37,000
//        $87,001 - $180,000	$19,822 plus 37c for each $1 over $87,000
//        $180,001 and over	$54,232 plus 45c for each $1 over $180,000