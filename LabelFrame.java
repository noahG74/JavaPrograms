//************************************
//Program Name: LabelFrame.java
//Developer: Noah Gonzales
//Date Created: 10/13/2023
//Version: 1.0
//Purpose: Assignment Arrays and Simple GUI
//************************************

package myjavapackage;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class LabelFrame extends JFrame{
	
	/**
	 * 
	 */
	LabelFrame(){
		super("My Frame");
		
		// Defining needed variables
		int [] userInputs = new int[5];
		int sum = 0, average = 0, smallestNumber , biggestNumber = 0;
		
		// Taking input from user and storing them into array
		for(int i = 0; i < userInputs.length; i++) {
			String element = JOptionPane.showInputDialog("Value for " + (i+1) + ". array element");
			userInputs[i] = Integer.parseInt(element);
		}
		
		// Calculating the average
		for(int i = 0; i < userInputs.length; i++)
			sum = sum + userInputs[i];
		average = sum/userInputs.length;
		
		//Finding the smallest number in the array
		smallestNumber = userInputs[0];
		for(int i = 1; i < userInputs.length; i++){
			if (smallestNumber > userInputs[i])
				smallestNumber = userInputs[i];
		}
		
		//Finding the biggest number in the array
		biggestNumber = userInputs[0];
		for(int i = 1; i < userInputs.length; i++){
			if (biggestNumber < userInputs[i])
				biggestNumber = userInputs[i]; 
		}
		
		//Making the labels to show the biggest/smallest number in the array and the average of all the values in the array
		JLabel label1 = new JLabel("The biggest number in the array is "+ biggestNumber + ".");
		JLabel label2 = new JLabel("The smallest number in the array is "+ smallestNumber + ".");
		JLabel label3 = new JLabel("The average the array is "+ average + ".");
		
		//Changing the color of the labels 
		label1.setForeground((Color.BLUE));
		label2.setForeground((Color.RED));
		label3.setForeground((Color.GREEN));
		
		//Centering the text lines in all the labels
		label1.setHorizontalAlignment(JLabel.CENTER);
		label2.setHorizontalAlignment(JLabel.CENTER);
		label3.setHorizontalAlignment(JLabel.CENTER);
		
		//Making the panel and adding each label to it 
		JPanel panel = new JPanel(new GridLayout(2,1));
		
		panel.add(label1);
		panel.add(label2);
		panel.add(label3);
		
		//Adding the panel to the frame
		add(panel);
	}
}
