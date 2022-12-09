/*
(Algebra: solve quadratic equations):
Write a program that prompts the user to enter values for a, b, and c and displays
the result based on the discriminant. If the discriminant is positive, display two
roots. If the discriminant is 0, display one root. Otherwise, display “The equation
has no real roots”.

Date: 12/9/22
 */

import java.util.*;  // Import java.util package

public class Exercise_3_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create Scanner Object ("input")

        // Prompt Input: a,b,c
        System.out.print("Enter values for 'a', 'b', and 'c': ");
            double a = input.nextDouble(); // Read Input: a
            double b = input.nextDouble(); // Read Input: b
            double c = input.nextDouble(); // Read Input: c
        
            double discriminant = Math.pow(b, 2) - (4 * a * c);
            double rootOne = ((-1 * b) + Math.sqrt(discriminant)) / (2 * a);
            double rootTwo = ((-1 * b) - Math.sqrt(discriminant)) / (2 * a);

        if (discriminant >= 1) {  // If the discriminant is greater than or equal to one, then output both roots.
            System.out.print("The equation has two roots: " + "r1: " + rootOne + " & r2: " + rootTwo);
        }
        if (discriminant == 0){ // If the discriminant equals zero, then the equation only has one root.
            System.out.print("The equation has one root: " + rootOne);
        }
        if (discriminant <= -1) { // If the discriminant is less than or equal to -1, then there are no real roots.
            System.out.print("The equation has no real roots");
        }
        input.close();   
    }
}
