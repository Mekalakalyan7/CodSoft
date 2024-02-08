import java.util.Scanner;

public class StudentGradeCalculator 
{

	public static void main(String[] args) 
    {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter Total number of Subjects:");
        int TotalSubjects = sc.nextInt();
        int sumOfSubjects = 0;
		int percentage;
		for(int i=0; i<TotalSubjects; i++) 
        {
			System.out.println("Enter Marks for Subject" + (i+1) + ":");
			sumOfSubjects += sc.nextInt();
		}
        percentage = sumOfSubjects/TotalSubjects;
		System.out.println("Total Marks: "+sumOfSubjects);
		System.out.println("Percentage: "+ percentage + "%");
        sc.close();
		
		if(percentage < 50) 
        {
			System.out.println("Grade: Failed");
		}
          else if(percentage >=50 && percentage <= 60)
        {
			System.out.println("Grade: C");
		} 
          else if(percentage >= 61 && percentage <= 70) 
        {
			System.out.println("Grade: B");
		} 
          else if(percentage >= 71 && percentage <= 80)
        {
			System.out.println("Grade: A");
		} 
          else if(percentage >= 81 && percentage <= 90)
        {
			System.out.println("Grade: H");
		} 
          else if(percentage >= 91 && percentage <= 100)
        {
			System.out.println("Grade: S");
		}
          else 
        {
			System.out.println("Invalid Marks. Please enter valid marks.");
		}
	}
}
