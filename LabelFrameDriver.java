//************************************
//Program Name: LabelFrame.java
//Developer: Noah Gonzales
//Date Created: 10/13/2023
//Version: 1.0
//Purpose: Assignment Arrays and Simple GUI
//************************************
package myjavapackage;

import javax.swing.JFrame;

public class LabelFrameDriver {

	public static void main(String[] args) {
		
		//Defining the variable 
		LabelFrame object = new LabelFrame();
		
		//Setting variables size, making it visible, and setting it to close upon exit
		object.setSize(600,200);
		object.setVisible(true);
		object.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
