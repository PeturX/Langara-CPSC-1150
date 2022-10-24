import java.util.Scanner;

public class Change {
    public static void main(String[] args) {
        final int loonieValue=100, quarterValue=25, dimeValue=10, nickelValue=5;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter pennies: ");
        int totalPennies = input.nextInt(); // Get user pennies

        int loonie=0, quarter=0, dime=0, nickel=0;
        
        // If the pennies value greater than or equal a loonie
        if (totalPennies >= loonieValue) {
            loonie = totalPennies / loonieValue; // Calculate the loonies from pennies
            totalPennies %= loonieValue; // Get the remain pennies without loonies
        }
        // If the remain pennies value greater than or equal a quarter
        if (totalPennies >= quarterValue) {
            quarter = totalPennies / quarterValue; // Calculate the quarter from pennies
            totalPennies %= quarterValue; // Get the remain pennies without quarter
        }
        // If the remain pennies value greater than or equal a dime
        if (totalPennies >= dimeValue) {
            dime = totalPennies / dimeValue; // Calculate the dime from pennies
            totalPennies %= dimeValue; // Get the remain pennies without dime
        }
        // If the remain pennies value greater than or equal a nickle
        if (totalPennies >= nickelValue) {
            nickel = totalPennies / nickelValue; // Calculate the nickle from pennies
            totalPennies %= nickelValue; // Get the remain pennies without nickle
        }

        System.out.printf("Loonie: %d\n", loonie);
        System.out.printf("Quarter: %d\n", quarter);
        System.out.printf("Dime: %d\n", dime);
        System.out.printf("Nickle: %d\n", nickel);
        System.out.printf("Penny: %d\n", totalPennies);

        input.close();
    }
}
