/**
 * Program name: Lab5B.java
 * Student ID: 100385851
 * Date: Oct 23rd, 2022
 * Purpose: Change even digit to odd
 */


import java.util.Scanner;

public class Lab5B {
    /**
     * Change even digit of number to odd by adding 1.
     * @param number User number
     * @return Number which even digits have been change to odd
     */
    public static int even2odd(int number) {
        int reversed = 0;

        while (number != 0) {
            // Get last digit from number
            int last_digit = number % 10;
            // Add last_digit to the bottom of reversed
            reversed = reversed * 10 + last_digit;
            // Remove number's last digit
            number /= 10;
        }

        while (reversed != 0) {
            // Get last digit from reverse
            int last_digit = reversed % 10;
            // If last_digit is even, then add 1
            if (last_digit % 2 == 0) last_digit++;
            // Add last_digit to the bottom of number
            number = number * 10 + last_digit;
            // Remove reverse's last digit
            reversed /= 10;
        }

        return number;
    }

    /**
     * Get user number, use even2odd method and return answer
     * @param args
     */
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input number: ");
        int number = input.nextInt();
        int answer = even2odd(number);
        System.out.println("Number: " + number + ", answer: " + answer);
    }
}
