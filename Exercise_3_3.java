/*
(Algebra: solve 2 x 2 linear equations) A linear equation can be solved using Cramer’s 
rule given in Programming Exercise 1.13. Write a program that prompts the user to enter
 a, b, c, d, e, and f and displays the result. If ad - bc is 0, report that The equation
has no solution.
 */

import java.util.*; // Import java.util package
public class Exercise_3_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // 1. Create Scanner Object "input"
        System.out.print("Enter values for letters a, b, c, d, e, and f:"); // Prompt Input
        double a = input.nextDouble(); // Read Input: a
        double b = input.nextDouble(); // Read Input: b
        double c = input.nextDouble(); // Read Input: c
        double d = input.nextDouble(); // Read Input: d
        double e = input.nextDouble(); // Read Input: e
        double f = input.nextDouble(); // Read Input: f

        // Solving for x and y using the Cramer’s rule:
        double divisor = ((a * d) - (b * c));
        double solveForX = ((e * d) - (b * f)) / divisor;
        double solveForY = ((a * f) - (e * c)) / divisor;

        if (divisor != 0) {
            System.out.print("x = " + solveForX + " and y = " + solveForY);
        }
        if (divisor == 0) {
            System.out.print("The equation has no solution.");
        }
    }
}
