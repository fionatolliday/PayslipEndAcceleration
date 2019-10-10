package tax;

public enum TaxBandEnums {

    TAXBAND1(0, 18200, 0, 0),
    TAXBAND2(18201, 37000, 0, 0.19),
    TAXBAND3(37001, 87000, 3572, 0.325),
    TAXBAND4(87001, 180000, 19822, 0.37),
    TAXBAND5(180001, Double.POSITIVE_INFINITY, 54232, 0.45);

    public final int lowerRange;
    public final double upperRange;
    public final int lumpSum;
    public final double percentage;


    TaxBandEnums(int lowerRange, double upperRange, int lumpSum, double percentage) {
        this.lowerRange = lowerRange;
        this.upperRange = upperRange;
        this.lumpSum = lumpSum;
        this.percentage = percentage;
    }

}
