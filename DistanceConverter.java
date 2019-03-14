public class DistanceConverter extends UnitConverter{

    public DistanceConverter() {
        super();
        imperialUnit = "mi";
        metricUnit = "km";
    }

    protected void convertToMetric() {
        metricValue = imperialValue * 1.609344;
    }

    protected void convertToImperial() {
        imperialValue = metricValue / 1.609344;
    }
}