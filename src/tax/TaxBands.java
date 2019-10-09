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
