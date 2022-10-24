/**
 * Program name: Triangle.java
 * Student ID: 100385851
 * Date: Oct 9th, 2022
 * Purpose: Print triangle with number from 1 to 9 base on row
 */

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input a positive integer number: ");
        int number = input.nextInt();

        for (int row = 1; row <= number; row++) {
            for (int column = number; column >= 1; column--) {
                if (column <= row) System.out.print(column + " "); // Print column number with space
                else System.out.print("  "); // Print double space instead number with space
            }
            System.out.println(); // Go to next line after finish a row
        }
    }
}
