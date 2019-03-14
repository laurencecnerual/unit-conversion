public class HeightConverter extends UnitConverter {

    private static String bigImperialUnit;
    private int bigImperialValue;

    public HeightConverter() {
        super();
        bigImperialUnit = "ft";
        bigImperialValue = 0;
        imperialUnit = "in";
        metricUnit = "cm";
    }

    protected void convertToMetric() {
        metricValue = imperialValue * 2.54;
    }

    protected void convertToImperial() {
        imperialValue = metricValue / 2.54;
    }

    /* public String toString() {
        String equation;



        return equation;
    } */
}
