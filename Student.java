/*
 * Author: Noah Gonzales
 * Date: 10/05/2023
 * Assignment 3
 * The following code is a class that holds the information of a student.
 */

package myjavapackage;

public class Student {
	
	// Variables 
	private String name = null;
	private int studentID = 0;
	private float gpa = 0;
	
	// Constructor
	public Student(String name, int studentID, float gpa){
		
		this.name = name;
		
		// Validating passed value 
		if ( studentID > 0 && studentID < 10000 )
			this.studentID = studentID;
		else
			this.studentID = 0;
	
		// Validating passed value
		if ( gpa >= 0.0 &&  gpa <= 4.0 )
			this.gpa = gpa;
		else
			this.gpa = 0;	
	};
	
	// Getter Methods
	public String getName() {
		return name;
	}
	
	public int getStudentID() {
		return studentID;
	}
	
	public float getGpa() {
		return gpa;
	}
	
	// Setter Methods
	public void setName(String name) {
		this.name = name;
	}
	
	public void setStudentID(int studentID) {
		
		// Validating passed value
		if ( studentID > 0 && studentID < 10000 )
			this.studentID = studentID;
		else
			this.studentID=0;
	}

	public void setGpa(float gpa) {
		
		// Validating passed value
		if ( gpa >= 0.0 && gpa <= 4.0 )
			this.gpa = gpa;
		else
			this.gpa = 0;
	}
	
	// Method to print out student information 
	public void printStudentInformation(){
		System.out.printf("Student's name is %s, ID is %d, and gpa is %.2f.\n", name,studentID,gpa);
	}
} // End of the Student Class
