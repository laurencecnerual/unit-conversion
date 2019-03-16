//Handles conversions between in and cm

public class HeightConverter extends ConstantConverter {

    private static String bigImperialUnit; // added to handle the unit feet
    private int bigImperialValue; // the feet portion of the input height

    public HeightConverter() {
        super();
        bigImperialUnit = "ft";
        bigImperialValue = 0;
        imperialUnit = "in";
        metricUnit = "cm";
        conversionConstant = 2.54;
    }

    public void setImperialValue(double imperialValue) {
        super.setImperialValue(imperialValue);
        calculateFeet();
    }

    public void setMetricValue(double metricValue) {
        super.setMetricValue(metricValue);
        calculateFeet();
    }

    private void calculateFeet() // determines the feet portion of the height using the set inches value
    {
        bigImperialValue = (int) imperialValue / 12;
    }

    public String toString() { // displays the imperial height in feet and inches instead of just inches
        String equation;

        if (isImperialToMetric){
            equation = bigImperialValue + " " + bigImperialUnit + " " + (imperialValue % 12) + " " + imperialUnit + " is equal to " + metricValue + " " + metricUnit + ".";
        } else {
            equation = metricValue + " " + metricUnit + " is equal to " + bigImperialValue + " " + bigImperialUnit + " " + (imperialValue % 12) + " " + imperialUnit + ".";
        }

        return equation;
    }
}
