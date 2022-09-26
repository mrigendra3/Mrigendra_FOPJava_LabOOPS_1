
public class Employee {
	//Taking firstName & lastName
		private String firstName;
		private String lastName;
		
		//Taking Parameterized Constructor
		public Employee (String firstName, String lastName) {
			this.firstName = firstName;
			this.lastName = lastName;
		}
		// Using Getter and Setters for firstName & lastName
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
	}

