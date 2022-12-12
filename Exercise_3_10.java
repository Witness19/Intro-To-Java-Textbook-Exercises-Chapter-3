/*
(Game: addition quiz) Listing 3.3, SubtractionQuiz.java, randomly generates a
subtraction question. Revise the program to randomly generate an addition question
with two integers less than 100.
 */

import java.util.*;

public class Exercise_3_10 {
        public static void main(String[] args) {
            //generate an addition question with two integers less than 100
            int one = (int) (Math.random() * 100);  // Generate a random integer from 0 to 99
            int two = (int) (Math.random() * 100);  // Generate a random integer from 0 to 99
            int sum = one + two;
    
        Scanner input = new Scanner(System.in); // Create Scanner Object
        System.out.print("Find the sum of the following three integers? " + one + " + " + two + " = "); //Prompt Input
        int total = input.nextInt(); // Read Input
    
            if (sum == total) {
                System.out.print("Correct");
            }
            if (sum != total) {
                System.out.print("Wrong, the correct awnser is " + sum + ".");
            }
    }
}
