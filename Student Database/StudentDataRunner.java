package studentdata;

import java.util.Scanner;

public class StudentDataRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ask users how many users we want to enter using array of objects
	    int n;
		System.out.print("Enter the no Students you want to enroll : ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		Student students[]=new Student[n];
	
		for(int i=0;i<n;i++)
		{
			students[i]=new Student();
			students[i].courseEnroll();
			students[i].payTution();
			
		}
		for(int i=0;i<n;i++)
		{
		System.out.println(students[i].toString());
		}
		
	}

}
