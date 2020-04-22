
public abstract class Employee {
	private final String firstName;
	private final String lastName;
	private final String socialSecurityNumber;

	
	public Employee (String firstName, String lastName, String ssn) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = ssn;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}

	public String getSSN() {
		return socialSecurityNumber;
	}

	//return String representation of Employee Object
	@Override
	public String toString() {
		return String.format("%s %s %n ssn: %s", getFirstName(), 
				getLastName(), getSSN());
	}

	//abstract method must be overridden by concrete classes
	public abstract double earnings(); //no implementation here

}
