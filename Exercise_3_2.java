/*
(Game: add three numbers) The program in Listing 3.1, AdditionQuiz.java, generates
two integers and prompts the user to enter the sum of these two integers.
Revise the program to generate three single-digit integers and prompt the user to
enter the sum of these three integers.
*/
 
import java.util.*; //import java.util package

public class Exercise_3_2 {
    public static void main(String[] args) {
        int one = (int) (Math.random() * 101);  // Generate a random integer from 0 to 100
        int two = (int) (Math.random() * 101);  // Generate a random integer from 0 to 100
        int three = (int) (Math.random() * 101);  // Generate a random integer from 0 to 100
        int sum = one + two + three; // Declare the sum of three random numbers

    Scanner input = new Scanner(System.in); // Create Scanner Object
    System.out.print("Find the sum of the following three integers? " + one + " + " + two + " + " + three + " = "); //Prompt Input
    int total = input.nextInt(); // Read Input

        if (sum == total) {
            System.out.print("Correct");
        }
        if (sum != total) {
            System.out.print("Wrong, the correct awnser is " + sum + ".");
        }
    }
}
