// Handles conversions between gal and L

public class LargeLiquidConverter extends ConstantConverter {

    public LargeLiquidConverter() {
        super();
        imperialUnit = "gal";
        metricUnit = "L";
        conversionConstant = 3.78541;
    }
}
