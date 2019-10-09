package tax;

public class TaxBands {

    private TaxBandEnums getTaxBand(double salary) {
        if (salary >= 0 && salary <= 19200) {
            return TaxBandEnums.TAXBAND1;
        }
        if (salary >= 18201 && salary <= 37000) {
            return TaxBandEnums.TAXBAND2;
        }
        if (salary >= 37001 && salary <= 87000) {
            return TaxBandEnums.TAXBAND3;
        }
        if (salary >= 87001 && salary <= 180000) {
            return TaxBandEnums.TAXBAND4;
        } else
            return TaxBandEnums.TAXBAND5;
    }


    public int taxBandLumpSum(double salary) {
        if (getTaxBand(salary) == TaxBandEnums.TAXBAND1) {
            return TaxBandEnums.TAXBAND1.lumpSum;
        }
        if (getTaxBand(salary) == TaxBandEnums.TAXBAND2) {
            return TaxBandEnums.TAXBAND2.lumpSum;
        }
        if (getTaxBand(salary) ==  TaxBandEnums.TAXBAND3) {
            return  TaxBandEnums.TAXBAND3.lumpSum;
        }
        if (getTaxBand(salary) ==  TaxBandEnums.TAXBAND4) {
            return  TaxBandEnums.TAXBAND4.lumpSum;
        } else
            return  TaxBandEnums.TAXBAND5.lumpSum;
    }

    public double taxBandPercentage(double salary) {
        if (getTaxBand(salary) == TaxBandEnums.TAXBAND1) {
            return TaxBandEnums.TAXBAND1.percentage;
        }
        if (getTaxBand(salary) == TaxBandEnums.TAXBAND2) {
            return TaxBandEnums.TAXBAND2.percentage;
        }
        if (getTaxBand(salary) == TaxBandEnums.TAXBAND3) {
            return TaxBandEnums.TAXBAND3.percentage;
        }
        if (getTaxBand(salary) == TaxBandEnums.TAXBAND4) {
            return TaxBandEnums.TAXBAND4.percentage;
        } else
            return TaxBandEnums.TAXBAND5.percentage;
    }

    public double upperTaxBracket(double salary) {
        if (getTaxBand(salary) == TaxBandEnums.TAXBAND1) {
            return TaxBandEnums.TAXBAND1.upperRange;
        }
        if (getTaxBand(salary) == TaxBandEnums.TAXBAND2) {
            return TaxBandEnums.TAXBAND2.upperRange;
        }
        if (getTaxBand(salary) == TaxBandEnums.TAXBAND3) {
            return TaxBandEnums.TAXBAND1.upperRange;
        }
        if (getTaxBand(salary) == TaxBandEnums.TAXBAND4) {
            return TaxBandEnums.TAXBAND4.upperRange;
        } else
            return TaxBandEnums.TAXBAND1.upperRange;
    }

}
