/*
   (Health Application: BMI) Revise Listing 3.4, ComputeAndInterpretBMI.java, tolet the user enter
   weight, feet, and inches. For example, if a person is 5 feet and 10inches, you will enter 5 for 
   feet and 10 for inches.
*/
import java.util.Scanner;

public class Exercise_3_6 {
    public static void main(String[] args) {
        
        /* 
        Instantiate (create an instance of) the scanner 
        class/Create an scanner object
        */ 
        Scanner weightAndHeight = new Scanner(System.in);

        //Prompt user to enter weight in Ibs
        System.out.println("Enter weight in pounds: ");
        double weight = weightAndHeight.nextDouble();

        //Convert users weight in Ibs to Kg: (Ibs * 0.45359237)
        double weightInKilograms = (weight * 0.45359237);
        
        //prompt the user to enter their height in feet
        System.out.println("Enter feet: ");
        double feet = weightAndHeight.nextDouble();

        //prompt user to enter height in inches
        System.out.println("Enter inches: ");
        double inches = weightAndHeight.nextDouble();

        /* Convert the feet portion of the height to feet:
        Formula to convert feet to inches: (Foot * 12)
        */
        double feetToInches = (feet * 12);

        // Complete the conversion of the heigh in inches only:
        double totalHeightInInches = (feetToInches + inches);

        //Convert the users height to meters: (inch x 0.0254)
        double heightInMeters = (totalHeightInInches * 0.0254);

        // BMI Formula: (KG/M^2)
        double bmi = weightInKilograms / Math.pow(heightInMeters, 2);

        // Display result
        System.out.println("BMI is " + bmi);
            
            if (bmi < 18.5){

        System.out.println("Underweight");
    }
            else if (bmi < 25){
        
        System.out.println("Normal");
            }

            else if (bmi < 30){
        
        System.out.println("Overweight");
            }

            else{
        System.out.println("Obese");
            }

        weightAndHeight.close();
    }
}
