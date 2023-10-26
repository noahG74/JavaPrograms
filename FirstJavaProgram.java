/*
 * Author: Noah Gonzales
 * Date: 9/11/2023
 * Assignment 1
 * The following code is just a simple input and output demonstration 
 */


package myjavapackage; //Package is defined and named "myjavapackage"

import java.util.Scanner; // Importing the package needed to get scanners 


/*
 * Here we will add two numbers that the user provided then display the sum of those two numbers
 * Then we will display the Users name
 */

public class FirstJavaProgram {

	public static void main(String[] args) { // The main method
		Scanner scanner = new Scanner(System.in); // Creating a scanner object.
		
		/* Defining the variables needed for the First and Second number as well as one 
		   for the sum of the two and a variable for the name */ 
		float firstNumber = 0, secondNumber = 0, result = 0;  
		String name = null;
		
		// Getting the two user numbers and validating the users input
		System.out.print("Please enter the first float number (a number with a decimal): ");
		if(scanner.hasNextFloat())
			firstNumber = scanner.nextFloat(); // Sets the users input to the variable 
		else
		{
			firstNumber = 0; // Setting the number to 0 if the input wasn't a float 
			scanner.next(); // Clears the scanners's buffer
		}
		
		System.out.print("\nPlease enter the second float number (a number with a decimal): ");
		if(scanner.hasNextFloat())
			secondNumber = scanner.nextFloat(); // Sets the users input to the variable
		else
		{
			secondNumber = 0; // Setting the number to 0 if the input wasn't a float 
			scanner.next(); // Clears the scanners's buffer
		}
		
		// Adding the two numbers
		result = firstNumber+secondNumber;
				
		// Displaying the sum of the two numbers
		System.out.printf("\nThe sum of the float numbers: %.2f\n",result);
		
		// Getting the users name
		System.out.print("\nPlease enter your name: ");
		scanner.nextLine(); // This is to clear the scanner's buffer
		name = scanner.nextLine(); // Sets the users input to the variable
		
		// Displaying the users name with a greeting 
		System.out.println("\nNice to meet you " + name);
		
		scanner.close();
		
	} // End of main
} // End of class FirstJavaProgram
