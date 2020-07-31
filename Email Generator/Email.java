package emailapp;
import java.util.Scanner;



public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String comEmail;
	private int emailCapacity=500;
	private int defaultPasswordLength=10;
	private String alternateEmail="default";
	private String company="pujaEnterprises.com";
	
	
	//constructor to receive firstname and lastname
	public Email(String firstName, String lastName)
	{
		this.firstName=firstName;
		this.lastName=lastName;;
		//System.out.println("EMAIL CREATED : " +this.firstName +" " +this.lastName);
		
		//asking the dept
		this.department=setDepartment();
		//System.out.println("DEPARTMENT : " +this.department);
		
		//call method that generates random password
		this.password=randomPassword(defaultPasswordLength);
		//System.out.println("PASSWORD : "+this.password);
		
		//generating mail id
		comEmail=firstName.toLowerCase() +"." +lastName.toLowerCase() +"@"+department +"." +company;
		//System.out.println("EMAIL ID : " +this.email);
		
	}
	
	//asking for department to create to auto generate the mail
	private String setDepartment()
	{
		String name=firstName +" " +lastName;
		System.out.print("New Employee : "+name +"\nDEPARTMENT CODES :\n1.For Sales \n2.For Development \n3.For Accounting \n0. for none \nEnter Department code :");
		Scanner sc=new Scanner(System.in);
		int deptChoice=sc.nextInt();
		if(deptChoice==1) { return "sales";
		}
		else if(deptChoice==2) { return "development";
		}
		else if(deptChoice==3) { return "accounting";
		}
		else { return "";	
		}
	}
	
	//creating to generate random password
	private String randomPassword(int length)
	{
		String passwordData="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%&*";
		char[] password=new char[length];
		for(int i=0;i<length;i++)
		{
			int rand=(int)(Math.random()*passwordData.length());
			password[i]=passwordData.charAt(rand);
		}
		return new String(password);
	}
	
	//encapsulation
	public void setEmailCapacity(int capacity)
	{
		this.emailCapacity=capacity;
	}
	public void setAlternativeEmail(String altEmail)
	{
		this.alternateEmail=altEmail;
	}
	public void changePassword(String password)
	{
		this.password=password;
	}
	public int getEmailCapacity()
	{
		return emailCapacity;
	}
	public String getAltEmail()
	{
		return alternateEmail;
	}
	public String getPassword()
	{
		return password;
	}
	
	public String showinfo()
	{
		
		return "NAME : " +firstName +" " +lastName
				+"\nEMAIL : " +comEmail
				+"\nMAILBOX CAPACITY : "+emailCapacity +"mb"
				+"\nALTERNATE EMAIL : " +alternateEmail
				+"\nPASSWORD : " +password;
	} 

}
