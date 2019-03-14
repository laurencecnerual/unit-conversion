import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        UnitConverter myConverter;
        char conversionSelection;
        char directionSelection;
        double fromValue;
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Hello! What kind of conversion would you like to make?");
        System.out.println("Enter T for Temperature, W for Weight, D for Distance, or H for Height.");

        conversionSelection = (myScanner.next()).charAt(0);

        switch (conversionSelection) {
            case 'T': case 't':
                myConverter = new TemperatureConverter();
                break;
            case 'W': case 'w':
                myConverter = new WeightConverter();
                break;
            case 'D': case 'd':
                myConverter = new DistanceConverter();
                break;
            case 'H': case 'h':
                myConverter = new HeightConverter();
                break;
            default:
                System.out.println("Invalid input. Program termination initiated.");
                return;
        }

        System.out.println("Thank you.");
        System.out.println("Would you like to convert from Imperial to Metric, or from Metric to Imperial?");
        System.out.println("Enter I for Imperial-to-Metric, or M for Metric-to-Imperial.");

        directionSelection = (myScanner.next()).charAt(0);

        if (directionSelection == 'I' || directionSelection == 'i') {

            System.out.println("Please input the value you would like to convert (in " + UnitConverter.getImperialUnit() + ").");
            fromValue = myScanner.nextDouble();
            myConverter.setImperialValue(fromValue);

        } else if (directionSelection == 'M' || directionSelection == 'm') {

            System.out.println("Please input the value you would like to convert (in " + UnitConverter.getMetricUnit() + ").");
            fromValue = myScanner.nextDouble();
            myConverter.setMetricValue(fromValue);

        } else {

            System.out.println("Invalid input. Program termination initiated.");
            return;
        }

        System.out.println("Thank you.");
        System.out.println(myConverter);
    }
}