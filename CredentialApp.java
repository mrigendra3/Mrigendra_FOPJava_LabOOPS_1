
public class CredentialApp {
	//Defining the main method here.
	public static void main(String args[]) {
		Employee employee = new Employee("Mrigendra","Kumar");
		Service s1 = new Service();
		String firstName = employee.getFirstName();
		String lastName = employee.getLastName();
		String department = s1.computeDepartment();
		
	//Checking if Department is valid, then we call showCredentials().	
		if(department != "Invalid")
		{
		s1.showCredentials(employee, s1.generateEmail(firstName, lastName, department),
				s1.generatePassword());
	}
		//If Department is invalid then display this message to the user.
		else {
			System.out.println("Invalid Input, Try Again!");
		}
	}
}



