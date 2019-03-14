public abstract class UnitConverter {

    protected static String imperialUnit;
    protected double imperialValue;

    protected static String metricUnit;
    protected double metricValue;

    protected boolean isImperialToMetric;

    public UnitConverter() {
        imperialValue = 0;
        metricValue = 0;
        isImperialToMetric = false;
    }

    public final void setImperialValue(double imperialValue) {
        this.imperialValue = imperialValue;
        isImperialToMetric = true;
        convertToMetric();
    }

    public final void setMetricValue(double metricValue) {
        this.metricValue = metricValue;
        isImperialToMetric = false;
        convertToImperial();
    }

    protected abstract void convertToMetric();

    protected abstract void convertToImperial();

    public static String getImperialUnit() {
        return imperialUnit;
    }

    public static String getMetricUnit() {
        return metricUnit;
    }

    public double getImperialValue() {
        return imperialValue;
    }

    public double getMetricValue() {
        return metricValue;
    }

    public String toString() {
        String equation;

        if (isImperialToMetric){
            equation = imperialValue + " " + imperialUnit + " is equal to " + metricValue + " " + metricUnit;
        } else {
            equation = metricValue + " " + metricUnit + " is equal to " + imperialValue + " " + imperialUnit;
        }

        return equation;
    }
}
