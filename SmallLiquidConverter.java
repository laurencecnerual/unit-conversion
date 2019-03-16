//Handles conversions between fl oz and ml

public class SmallLiquidConverter extends ConstantConverter {

    public SmallLiquidConverter() {
        super();
        imperialUnit = "fl oz";
        metricUnit = "ml";
        conversionConstant = 29.5735;
    }
}
