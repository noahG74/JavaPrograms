package Exam1;

import java.util.ArrayList;
import java.util.Random;

public class StudentDriver {

	public static void main(String[] args) {
		// Defining the Size of the undergraduateStudentArray
		final int SIZE = 4;
		
		//Defining random for age, GPA
		Random randGpa = new Random();
		Random randAge = new Random();
		
		//Defining Variables to hold average ages
		float averageAgeForUndergraduateStudents = 0.0f;
		float averageAgeForGraduateStudents = 0.0f;
		
		//Defining Variables to hold average GPAs
		float averageGpaForUndergraduateStudents = 0.0f;
		float averageGpaForGraduateStudents = 0.0f;
				
		// Defining/Initializing both of the Student classes array's
		UndergraduateStudent [] undergraduateStudentArray = new UndergraduateStudent[SIZE];
		undergraduateStudentArray[0] = new UndergraduateStudent("Noah", 919, randAge.nextInt(17,45), randGpa.nextFloat(0.00f,4.00f));
		undergraduateStudentArray[1] = new UndergraduateStudent("Tom", 920, randAge.nextInt(17,45), randGpa.nextFloat(0.00f,4.00f));
		undergraduateStudentArray[2] = new UndergraduateStudent("Gabe", 921, randAge.nextInt(17,45), randGpa.nextFloat(0.00f,4.00f));
		undergraduateStudentArray[3] = new UndergraduateStudent("Karissa", 922, randAge.nextInt(17,45), randGpa.nextFloat(0.00f,4.00f));
		
		ArrayList<GraduateStudent> graduateStudentArray = new ArrayList<GraduateStudent>();
		graduateStudentArray.add((new GraduateStudent("Kelvin", 2000, randAge.nextInt(17,45), randGpa.nextFloat(0.00f,4.00f))));
		graduateStudentArray.add((new GraduateStudent("Vanoss", 2001, randAge.nextInt(17,45), randGpa.nextFloat(0.00f,4.00f))));
		graduateStudentArray.add((new GraduateStudent("Mini Lad", 2002, randAge.nextInt(17,45), randGpa.nextFloat(0.00f,4.00f))));
		graduateStudentArray.add((new GraduateStudent("Nogla", 2003, randAge.nextInt(17,45), randGpa.nextFloat(0.00f,4.00f))));
		graduateStudentArray.add((new GraduateStudent("Franklin", 2004, randAge.nextInt(17,45), randGpa.nextFloat(0.00f,4.00f))));
		
		//Printing Information for all of the Students 
		System.out.print("Undergraduate Students:\n");
		for(UndergraduateStudent UndergraduateStudent:undergraduateStudentArray)
			UndergraduateStudent.printStudentInformation();
		
		System.out.print("\nGraduate Students:\n");
		for(GraduateStudent GraduateStudent:graduateStudentArray)
			GraduateStudent.printStudentInformation();
		
		//Calculating the average Age for each Student Group
		for(UndergraduateStudent UndergraduateStudent:undergraduateStudentArray)
			averageAgeForUndergraduateStudents += UndergraduateStudent.getStudentAge();
		averageAgeForUndergraduateStudents /= undergraduateStudentArray.length;
	
		for(GraduateStudent GraduateStudent:graduateStudentArray)
			averageAgeForGraduateStudents += GraduateStudent.getStudentAge();
		averageAgeForGraduateStudents /= graduateStudentArray.size();
		
		//Calculating the average Gpa for each Student Group
		for(UndergraduateStudent UndergraduateStudent:undergraduateStudentArray)
			averageGpaForUndergraduateStudents += UndergraduateStudent.getStudentGpa();
		averageGpaForUndergraduateStudents /= undergraduateStudentArray.length;
		
		for(GraduateStudent GraduateStudent:graduateStudentArray)
			averageGpaForGraduateStudents += GraduateStudent.getStudentGpa();
		averageGpaForGraduateStudents /= graduateStudentArray.size();
		
		//Displaying both the average ages and the highest between the two
		System.out.print("\nThe average age for undergraduate students is " + averageAgeForUndergraduateStudents);
		System.out.print("\nThe average age for graduate students is " + averageAgeForGraduateStudents);
		if(averageAgeForUndergraduateStudents > averageAgeForGraduateStudents )
			System.out.print("\nThe average age is higher in Undergraduate Students");
		else
			System.out.print("\nThe average age is higher in Graduate Students");
		
		//Displaying both the average gpa's and the highest between the two
		System.out.printf("\n\nThe average gpa for undergraduate students is %.2f %n",averageGpaForUndergraduateStudents);
		System.out.printf("The average gpa for graduate students is %.2f %n",averageGpaForGraduateStudents);
		if(averageGpaForUndergraduateStudents > averageGpaForGraduateStudents )
			System.out.printf("The average gpa is higher in Undergraduate Students");
		else
			System.out.printf("The average gpa is higher in Graduate Students");
		
 
	}
}
