//Lays the framework for other more specific converters to inherit and utilize

public abstract class UnitConverter {

    protected static String imperialUnit; // the imperial unit of measurement (F, lbs, mi, in, etc)
    protected double imperialValue; // the numerical value associated with the imperial unit

    protected static String metricUnit; // the metric unit of measurement (C, kg, km, cm, etc)
    protected double metricValue; // the numerical value associated with the metric unit

    protected boolean isImperialToMetric; // the direction of conversion (imperial to metric or metric to imperial)

    public UnitConverter() {
        imperialValue = 0;
        metricValue = 0;
        isImperialToMetric = false;
    }

    public void setImperialValue(double imperialValue) {
        this.imperialValue = imperialValue;
        isImperialToMetric = true;
        convertToMetric();
    }

    public void setMetricValue(double metricValue) {
        this.metricValue = metricValue;
        isImperialToMetric = false;
        convertToImperial();
    }

    protected abstract void convertToMetric(); // calculates the metric equivalent for the set imperial value

    protected abstract void convertToImperial(); // calculates the imperial equivalent for the set metric value

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
            equation = imperialValue + " " + imperialUnit + " is equal to " + metricValue + " " + metricUnit + ".";
        } else {
            equation = metricValue + " " + metricUnit + " is equal to " + imperialValue + " " + imperialUnit + ".";
        }

        return equation;
    }
}
