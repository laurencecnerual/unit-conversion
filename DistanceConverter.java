//Handles conversions between mi and km

public class DistanceConverter extends ConstantConverter{

    public DistanceConverter() {
        super();
        imperialUnit = "mi";
        metricUnit = "km";
        conversionConstant = 1.609344;
    }
}
