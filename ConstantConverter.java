//Introduces a conversionConstant and related computational functionality to be used by more specific converters that rely on this method of computation

public abstract class ConstantConverter extends UnitConverter {

    protected static double conversionConstant; // stores the fixed constant used to convert between imperial and metric units

    protected void convertToMetric() {
        metricValue = imperialValue * conversionConstant;
    }

    protected void convertToImperial() {
        imperialValue = metricValue / conversionConstant;
    }

    public static double getConversionConstant() {
        return conversionConstant;
    }
}
