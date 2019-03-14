public class TemperatureConverter extends UnitConverter {

    public TemperatureConverter() {
        imperialUnit = "F";
        imperialValue = 32;
        metricUnit = "C";
        metricValue = 0;
        isImperialToMetric = false;
    }

    protected void convertToMetric() {
        metricValue = (imperialValue - 32) * (5/9.0);
    }

    protected void convertToImperial() {
        imperialValue = (metricValue * (9/5.0)) + 32;
    }
}
