/* 
3.11 (Find the number of days in a month) Write a program that 
prompts the user to enter the month and year and displays the 
number of days in the month.
*/

import java.util.Scanner;

public class Exercise_3_11 {
    public static void main(String[] args) {


    //Instantiate (create a instance of) the Scanner class:

    Scanner MONTH_AND_YEAR = new Scanner(System.in);

    //Prompt the user to enter the month:

    System.out.println("Enter the month: ");
    int month = MONTH_AND_YEAR.nextInt();

    //Prompt user to enter the year:
    System.out.println("Enter the year: ");
    int year = MONTH_AND_YEAR.nextInt();

    /* 
    - Assign meaning to months 1-12: Name and Days
    - Use a series of if statements to instruct the program
    to output the correct month, year, and number of days 
    based on the input values (month & year).
    */
    
    if (month == 1) {

        String monthOne = "January";

        int daysInJanuary = 31;

        System.out.println(monthOne + " " + year + " had " + daysInJanuary + " days");
     
    }

    if (month == 2) {
    
        String monthTwo = "February";

        if (year%4==0){
            int daysInFebruaryDuringLeap = 29;

            System.out.println(monthTwo + " " + year + " had " + daysInFebruaryDuringLeap + " days");
        }
        else {
            int daysInFebruary = 28;
            System.out.println(monthTwo + " " + year + " had " + daysInFebruary + " days");
        }
    }
    
    if (month == 3) {

        String monthThree = "March";

        int daysInMarch = 31;
        
        System.out.println(monthThree + " " + year + " had " + daysInMarch + " days");
    }

    if (month == 4) {
   
        String monthFour = "April";

        int daysInApril = 30;
        
        System.out.println(monthFour + " " + year + " had " + daysInApril + " days");

    }

    if (month == 5) {

        String monthFive = "May";

        int daysInMay = 31;
        
        System.out.println(monthFive + " " + year + " had " + daysInMay + " days");
        
    }

    if (month == 6) {

        String monthSix = "June";

        int daysInJune = 30;
        
        System.out.println(monthSix + " " + year + " had " + daysInJune + " days");
        
    }

    if (month == 7) {

        String monthSeven = "July";

        int daysInJuly = 31;
        
        System.out.println(monthSeven + " " + year + " had " + daysInJuly + " days");
        
    }

    if (month == 8) {

        String monthEight = "August";

        int daysInAugust = 31;
        
        System.out.println(monthEight + " " + year + " had " + daysInAugust + " days");
        
    }

    if (month == 9) {
         
        String monthNine = "September";

        int daysInSeptember = 30;
        
        System.out.println(monthNine + " " + year + " had " + daysInSeptember + " days");
        
    }

    if (month == 10) {

        String monthTen = "October";

        int daysInOctober = 31;
        
        System.out.println(monthTen + " " + year + " had " + daysInOctober + " days");
        
    }

    if (month == 11) {
         
        String monthEleven = "November";

        int daysInNovember = 30;
        
        System.out.println(monthEleven + " " + year + " had " + daysInNovember + " days");
        
    }

    if (month == 12) {

        String monthTwelve = "December";

        int daysInDecember = 31;
        
        System.out.println(monthTwelve + " " + year + " had " + daysInDecember + " days");
        
    }

   //Close Scanner: Avoid Resource Leak
   MONTH_AND_YEAR.close();

    }

}
