public class Lab3 {
    public static void main(String[] args) {
        final double INTEREST_RATE = 0.6/12;
        final double EDUCATION = 500.00;
        double balance = 1000.00;

        if (balance == 0) {
            System.out.println("Account is deplete: 0 month");
            return;
        }

        if (balance < 0) {
            System.out.println("Invalid balance.");
            return;
        }

        int month = 0, year = 0;

        while (balance > 0) {
            month++;
            if (month == 12) { 
                month = 0;
                year++;
            }
            balance *= (1 + INTEREST_RATE); // Apply interest rate
            balance -= EDUCATION;
        }

        if (month != 0) {
            if (month == 1) System.out.print(month + " month ");
            else System.out.print(month + " months ");
        }
        if (year != 0) {
            if (year == 1) System.out.println(year + " year");
            else System.out.println(year + " years");
        } else System.out.println();
    }
}