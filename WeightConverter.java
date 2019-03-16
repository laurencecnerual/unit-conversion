//Handles conversions between lbs and kg

public class WeightConverter extends ConstantConverter {

    public WeightConverter() {
        super();
        imperialUnit = "lbs";
        metricUnit = "kg";
        conversionConstant = 0.45359237;
    }
}
