//************************************
//Program Name: ColoringFrame.java
//Developer: Noah Gonzales
//Date Created: 10/19/2023
//Version: 1.0
//Purpose: Assignment GUI JButtonGroup Color
 //************************************
package myjavapackage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColoringFrame extends JFrame implements ActionListener {
	
	// Defining variables 
	private final JRadioButton redColorRadioButton;
	private final JRadioButton greenColorRadioButton;
	private final JRadioButton blueColorRadioButton;
	private final JRadioButton randomColorRadioButton;
	private final JTextArea textArea;
	private final JButton recolorButton;
	
	public ColoringFrame()
	{
		super("Coloring Application");

		// Setting the Layout
		setLayout(new FlowLayout());
		
		// Initializing the different radio
		redColorRadioButton = new JRadioButton("Red",false);
		greenColorRadioButton = new JRadioButton("Green",false);
		blueColorRadioButton = new JRadioButton("Blue",false);
		randomColorRadioButton = new JRadioButton("Random",false);

		// Creating a button group to hold the radio buttons
		ButtonGroup colorButtonGroup =  new ButtonGroup();
		colorButtonGroup.add(redColorRadioButton);
		colorButtonGroup.add(greenColorRadioButton);
		colorButtonGroup.add(blueColorRadioButton);
		colorButtonGroup.add(randomColorRadioButton);
		
		// Crating the button panel to attach the radio buttons
		JPanel colorButtonPanel = new JPanel();
		colorButtonPanel.add(redColorRadioButton);
		colorButtonPanel.add(greenColorRadioButton);
		colorButtonPanel.add(blueColorRadioButton);
		colorButtonPanel.add(randomColorRadioButton);
		
		// Initializing the Text Area
		textArea = new JTextArea("Noah Gonzales", 7, 15);
		
		// Initializing the recolor button and adding the action listener 
		recolorButton = new JButton ("Recolor");
		recolorButton.addActionListener(this);

		// Adding everything to the frame
		add(colorButtonPanel);
		add(textArea);
		add(recolorButton);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// Checking if the recolor button was pressed 
		if (e.getSource() == recolorButton) {
			
			// Changing the color based off of what radio button is selected 
			if (redColorRadioButton.isSelected()) {
				getContentPane().setBackground(Color.RED);
				textArea.setForeground(Color.RED);
			}
			else if (greenColorRadioButton.isSelected()) {
				getContentPane().setBackground(Color.GREEN);
				textArea.setForeground(Color.GREEN);
			}
			else if (blueColorRadioButton.isSelected()) {
				getContentPane().setBackground(Color.BLUE);
				textArea.setForeground(Color.BLUE);
			}
			else if (randomColorRadioButton.isSelected()) {
				// Generating the random color 
				Color randomColor = new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256));
				getContentPane().setBackground(randomColor);
		 		textArea.setForeground(randomColor);
			}
		}	
	}
}