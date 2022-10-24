/**
 * Program name: Lab5.java
 * Student ID: 100385851
 * Date: Oct 23rd, 2022
 * Purpose: Get all number from 0 to n which is palindrom and prime number
 */


import java.util.Scanner;

public class Lab5 {
    /**
     * Check if number is palindrome
     * @param number
     * @return True if number is palindrome, else false
     */
    public static boolean isPalindrome(int number) {
        int test_number = 0, temp_number = number;

        // Reverse number and save to test_number
        while (temp_number != 0) {
            // Get last digit of temp_number and add to the bottom of test_number
            test_number = test_number * 10 + temp_number % 10;
            // Remove last digit of temp_number
            temp_number /= 10;
        }

        if (test_number == number) return true;
        else return false;
    }

    /**
     * Check if number is a prime number
     * @param number
     * @return True if number is prime number, else false
     */
    public static boolean isPrime(int number) {
        if (number == 1) return false;
        if (number == 2) return true;
        // If number is dividable to any number from 2 to SQRT(number), then it is not prime number
        for (int index = 2; index <= Math.sqrt(number) + 1; index++)
            if (number % index == 0) return false;
        return true;
    }

    /**
     * Check from 1 to n, if any number is both palindrom and prime number
     * @param args
     */
    public static void main(String args[]) { 
        Scanner input = new Scanner(System.in);
        int number;
        boolean valid = false;
    
        do {
            System.out.print("Input number: ");
            number = input.nextInt();
            if (number > 1) valid = true;
            else System.out.println("Please input number which is greater than 1.");
        } while(!valid);
        
        for (int index = 1; index <= number; index++) {
            if (isPalindrome(index) && isPrime(index)) 
                System.out.print(index + " ");
        }

        System.out.println();
    }
}
