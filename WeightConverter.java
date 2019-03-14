public class WeightConverter extends UnitConverter {

    public WeightConverter() {
        super();
        imperialUnit = "lbs";
        metricUnit = "kg";
    }

    protected void convertToMetric() {
        metricValue = imperialValue * 0.45359237;
    }

    protected void convertToImperial() {
        imperialValue = metricValue / 0.45359237;
    }
}