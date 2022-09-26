import java.util.Random;
import java.util.Scanner;

public class Service {
	public String generateEmail (String firstName, String lastName, String department) {
		return firstName+lastName+"@"+department+"."+"greatLearning.com";
	}
	public String generatePassword() { 
	String uppercaseAlphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String lowerCaseAlphabets = "abcdefghijklmnopqrstuvwxys";
	String digits = "0123456789";
	String specialCharacters="&*()!@#$%^_+"; 
	
	String bigString = uppercaseAlphabets+lowerCaseAlphabets+digits+specialCharacters;
	// Using random class object to get the password in random sequence.
	Random random = new Random();
	
	// Using random class object to get the password in random sequence.
	char [] password = new char[8];
	
	//Using For loop to generate random passwords.
	for(int i=0;i<8;++i) {
		
		password[i]=bigString.charAt(random.nextInt(bigString.length()));
	}	 
//returning the generated password.	

	return new String (password);  	
}
	//Using method to select department with scanner and switch case.
	public String computeDepartment() {
		String department = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Technical");
		System.out.println("2. Human Resource");
		System.out.println("3. Admin");
		System.out.println("4. Legal");
		System.out.println("Please Select Department from list above");
		int option = sc.nextInt();
	
		
			switch(option)
		{
		   case 1 :
			   department =  "Technical";
			   break;
			  
		   case 2 :
		      department = "HumanResource" ;
		      break;
		   case 3 :
			   department = "Admin"; 
			   break;
		   case 4 :
			   department = "Legal" ;
			   break;
		   default : 
			   department = "Invalid";
			   break;
		}
			
				sc.close();
			
			return department;	
		
		}
		
		
	//Showing the Employee's credentials by using this method.
	
	public void showCredentials(Employee employee, String email, String password) {
		System.out.println("Dear,"+ employee.getFirstName() +" Welcome to the GreatLearning! here are your Credentials :");
		System.out.println("Email :"+ email);
		System.out.println("Password :"+ password);
	}
	

	
}


