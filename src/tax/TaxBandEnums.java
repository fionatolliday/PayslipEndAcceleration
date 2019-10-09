package tax;

import java.util.HashMap;
import java.util.Map;

public enum TaxBandEnums {

    TAXBAND1(0, 18000, 0, 0),
    TAXBAND2(18201, 37000, 0, 0.19),
    TAXBAND3(37001, 87000, 3572, 0.325),
    TAXBAND4(87001, 180000, 19822, 0.37),
    TAXBAND5(180001, Double.POSITIVE_INFINITY, 54232, 0.45);


    private static final Map<Integer, TaxBandEnums> BY_LOWER_RANGE = new HashMap<>();
    private static final Map<Double, TaxBandEnums> BY_UPPER_RANGE = new HashMap<>();
    private static final Map<Integer, TaxBandEnums> BY_LUMP_SUM = new HashMap<>();
    private static final Map<Double, TaxBandEnums> BY_PERCENTAGE = new HashMap<>();

    static {
        for (TaxBandEnums band : values()) {
            BY_LOWER_RANGE.put(band.lowerRange, band);
            BY_UPPER_RANGE.put(band.upperRange, band);
            BY_LUMP_SUM .put(band.lumpSum, band);
            BY_PERCENTAGE.put(band.percentage,band);
        }
    }

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

    public static TaxBandEnums valueOfLowerRange(int number) {
        return BY_LOWER_RANGE.get(number);
    }

    public static TaxBandEnums ValueOfUpperRange(double number) {
        return BY_UPPER_RANGE.get(number);
    }

    public static TaxBandEnums valueOfLumpSum(int number) {
        return BY_LUMP_SUM.get(number);
    }

    public static TaxBandEnums percentageValue(double number) {
        return BY_PERCENTAGE.get(number);
    }

}
