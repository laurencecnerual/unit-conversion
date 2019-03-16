//This program allows you to convert from imperial to metric and vice versa, for a variety of units of measurement,
//including temperature, weight, distance, height, and liquid volume

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        UnitConverter myConverter;
        char conversionSelection; // stores which type of conversion the user would like to perform (temperature, weight, distance, height, etc)
        char directionSelection; // stores which direction the user would like to convert from (imperial or metric)
        double fromValue; // the numerical value to be converted (selected by user)
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Hello! What kind of conversion would you like to make?");
        System.out.println("Enter T for Temperature, W for Weight, D for Distance, H for Height, S for Small Liquids, or L for Large Liquids.");

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
            case 'S': case 's':
                myConverter = new SmallLiquidConverter();
                break;
            case 'L': case 'l':
                myConverter = new LargeLiquidConverter();
                break;
            default:
                System.out.println("Invalid input. Program termination initiated.");
                return;
        }

        System.out.println("Thank you.");
        System.out.println();
        System.out.println("Would you like to convert from Imperial to Metric, or from Metric to Imperial?");
        System.out.println("Enter I for Imperial-to-Metric, or M for Metric-to-Imperial.");

        directionSelection = (myScanner.next()).charAt(0);

        if (directionSelection == 'I' || directionSelection == 'i') {

            System.out.println("Please input the value you would like to convert (in " + UnitConverter.getImperialUnit() + ").");

            if (!myScanner.hasNextDouble()) {
                System.out.println("Invalid input. Program termination initiated.");
                return;
            }

            fromValue = myScanner.nextDouble();
            myConverter.setImperialValue(fromValue);

        } else if (directionSelection == 'M' || directionSelection == 'm') {

            System.out.println("Please input the value you would like to convert (in " + UnitConverter.getMetricUnit() + ").");

            if (!myScanner.hasNextDouble()) {
                System.out.println("Invalid input. Program termination initiated.");
                return;
            }

            fromValue = myScanner.nextDouble();
            myConverter.setMetricValue(fromValue);

        } else {

            System.out.println("Invalid input. Program termination initiated.");
            return;
        }

        System.out.println("Thank you.");
        System.out.println();
        System.out.println(myConverter);
        System.out.println("Have a nice day. :)");
    }
}
