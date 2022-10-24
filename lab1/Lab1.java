import java.util.Scanner;

public class Lab1 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the temperature in Celsius: ");
        double temperature = input.nextDouble();

        System.out.print("Enter the wind speed kilometers per hour: ");
        double windSpeed = input.nextDouble();

        double windChillIndex = 13.112 + 0.6215 * temperature - 11.37 * Math.pow(windSpeed, 0.16) + 0.3965 * temperature * Math.pow(windSpeed, 0.16);
        System.out.print("The wind-chill index is " + windChillIndex);

        input.close();
    }
}
