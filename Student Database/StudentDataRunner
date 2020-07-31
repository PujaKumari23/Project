package studentdata;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int year;
	private String studentId;
	private String courses=null;
	private int tutionBalance=0;
	private int costOfCourse=999;
	private static int id=1000;
	
	
	
	//prompt to know many no of students
	
	public Student()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter Firstname : ");
		this.firstName=sc.nextLine();
		
		System.out.print("Enter Lastname : ");
		this.lastName=sc.nextLine();
		
		System.out.println("Enter grade :  \n\t1.Kindergarden \n\t2.Sophomore \n\t3.Junior  \n\t4.High School");
		this.year=sc.nextInt();
		
		setStudentId();
		
		
	}
	
	//generate ID  i.e, gradelevel+ID
	private void setStudentId()
	{
	
		id++;
		this.studentId= year +"" +id;
		
	}
	
	//enroll in courses
	public void courseEnroll()
	{
	
		do {
		System.out.print("Enter the course to Enroll and Type Q to quit : ");
		Scanner sc =new Scanner(System.in);
		String input=sc.nextLine();
		if(!input.equals("Q"))
		{
			this.courses= courses +"\n  " +input;
			tutionBalance=tutionBalance+costOfCourse;
		}
		else
		{
			break;
		}
		}
		while(1!=0);

		
	}
	
	
	//view balance
	public void viewBalance()
	{
		System.out.println("Remaining balance is : Rs " +tutionBalance);
	}
	
	//pay Tution
	public void payTution()
	{
		viewBalance();
		System.out.print("Enter the amount you want to pay : ");
		Scanner sc=new Scanner(System.in);
		int payment=sc.nextInt();
		tutionBalance=tutionBalance-payment;
		System.out.println("Thankyou for payment of Rs. " +payment);
		viewBalance();
		
		
	}
	
	//print info
	public String toString()
	{
		return "\nFirstname : " +firstName
				+"\nLastname : " +lastName
				+"\nYear : " +year
				+"\nStudent Id : "+studentId
				+"\nCourses : " +this.courses
				+"\nTution Balance : " +tutionBalance
				;
		
	}

}
