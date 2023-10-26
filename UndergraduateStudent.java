//************************************
// Program Name: UndergraduateStudent.java
// Developer: Noah Gonzales
// Date Created: 10/12/2023
// Version: 1.0
// Purpose: Exam 1
//************************************

package Exam1;

public class UndergraduateStudent {
	
	// Variables 
	private String name = null;
	private int studentID = 0;
	private int age = 0;
	private float gpa = 0;
	
	
	// Constructor
	public UndergraduateStudent(String name, int studentID, int age, float gpa){
		
		this.name = name;
		
		// Validating passed value 
		if ( studentID > 0 && studentID < 10000 )
			this.studentID = studentID;
		else
			this.studentID = 0;
		
		// Validating passed value
		if ( age >= 17 && age < 50 )
			this.age = age;
		else
			this.age = 0;
	
		// Validating passed value
		if ( gpa >= 0.0 &&  gpa <= 4.0 )
			this.gpa = gpa;
		else
			this.gpa = 0;	
	};
	
	//Setter Method 
	public void setGpa(float gpa) {
		
		// Validating passed value
		if ( gpa >= 0.0 && gpa <= 4.0 )
			this.gpa = gpa;
		else
			this.gpa = 0;
	}
	
	
	// Getter Methods
	public String getStudentName() {
		return name;
	}
	
	public int getStudentID() {
		return studentID;
	}
	
	public int getStudentAge() {
		return age;
	}
	
	public float getStudentGpa() {
		return gpa;
	}
	
	// Method to print out student information 
	public void printStudentInformation(){
		System.out.printf("Student's name: %s \n Student's ID: %d \n Student's Age: %d \n "
				+ "Student's GPA: %.2f.\n", name,studentID,age,gpa);
	}
}
