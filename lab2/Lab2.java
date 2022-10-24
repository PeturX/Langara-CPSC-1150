/**
 * Program name: Lab2.java
 * Student ID: 100385851
 * Date: Oct 1st, 2022
 * Purpose: Solve quadratic equation
 */

import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a = 0, b = 0, c = 0;

        System.out.print("Input a: ");
        a = input.nextDouble();
        System.out.print("Input b: ");
        b = input.nextDouble();
        System.out.print("Input c: ");
        c = input.nextDouble();

        /* Check input validation */
        if (a == 0 && b ==0 ) {
            System.out.println("Not a valid input. Try again.");
            System.exit(0);
        }
        /* Linear equation check */
        if (a == 0) {
            System.out.println("Linear equation");
            System.out.println("The solution is " + (-1 * b / c));
        }

        /* Calculate the discriminant value */
        double delta = Math.pow(b, 2) - 4 * a * c;

        /* No real root check */
        if (delta < 0) {
            System.out.println("No real root");
        }
        /* Double root check */
        else if (delta == 0) {
            System.out.println("Double root: " + ((-1 * b) / (2 * a)));
        } else {
            System.out.println("x1: " + ((-1 * b + Math.sqrt(delta)) / (2 * a)));
            System.out.println("x2: " + ((-1 * b - Math.sqrt(delta)) / (2 * a)));
        }

    }
}   