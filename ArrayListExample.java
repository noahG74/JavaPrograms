//************************************
// Program Name: ArrayListExample.java
// Developer: Noah Gonzales
// Date Created: 10/09/2023
// Version: 1.0
// Purpose: Assignment ArrayList
//************************************

package myarraylistexamplepackage;

import java.util.ArrayList;

public class ArrayListExample {
	
	public static void main(String[] args) {
		
		//Creating the Array List to hold scientists
		ArrayList<String> scientistsArray = new ArrayList<String>();
		
		//Adding 5 scientists to the array
		System.out.print("Scientists\n");
		
		scientistsArray.add("Al Khwarizmi");
		scientistsArray.add("Al Jazari");
		scientistsArray.add("Ada Lovelace");
		scientistsArray.add("Alan Turing");
		scientistsArray.add("Alan Kay");
		
		//Printing the array
		for (String string:scientistsArray)
			System.out.println(string);
		
		//Adding another scientists to the list 
		System.out.print("\nAfter adding a scientist to the fourth place...\n");
		scientistsArray.add(3,"George Boole");
		
		//Printing the new array
		for (int i = 0; i < scientistsArray.size(); i++)
			System.out.println(scientistsArray.get(i));
		
		//Printing the number of elements in the array
		System.out.print("\nThe number of elements in the names is " + scientistsArray.size());
		
		//Removing the scientist in the 1st index spot (2nd spot in the displayed list)
		System.out.print("\n\nAfter removing a scientist from second place...\n");
		scientistsArray.remove(1);
		
		//Printing the new array
		for (String string:scientistsArray)
			System.out.println(string);
		
		//Checking if the name "Grace Hopper" is in the Array 
		System.out.print("\nChecking if \"Grace Hopper\" is in the list");
		
		if (scientistsArray.contains("Grace Hopper"))
			//Displays if the name "Grace Hopper" is in the list
			System.out.println("\nGrace Hopper is in the list.");
		else
			//Displays if the name "Grace Hopper" is not in the list
			System.out.print("\n\nGrace Hopper is not on the list...\n");
	}
}