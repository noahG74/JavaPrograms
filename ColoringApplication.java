//************************************
//Program Name: ColoringApplication.java
//Developer: Noah Gonzales
//Date Created: 10/19/2023
//Version: 1.0
//Purpose: Assignment GUI JButtonGroup Color
 //************************************
package myjavapackage;

import javax.swing.JFrame;

public class ColoringApplication {

	public static void main(String[] args) {
		//Defining the variable 
		ColoringFrame coloringFrameTest = new ColoringFrame();
				
		//Setting variables size, making it visible, and setting it to close upon exit
		coloringFrameTest.setSize(350,300);
		coloringFrameTest.setVisible(true);
		coloringFrameTest.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		coloringFrameTest.setLocationRelativeTo(null); // To center it on your screen
	}

}
