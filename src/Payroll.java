
public class Payroll {

	public static void main(String[] args) {
		CommissionEmployee commissionEmployee = new CommissionEmployee
				("Sue", "Jones","333-333", 1000.00,.06);
		
		BasePlusCommissionEmployee basePlusCommissionEmployee = new 
				BasePlusCommissionEmployee ("Ali", "Java", "333-333",
						1000.00, 0.6, 1.0);

		
		Employee[] emp = new Employee[2];
		
		emp[0] = commissionEmployee;
		emp[1] = basePlusCommissionEmployee;
		
		System.out.printf("Employees processed polymorphically %n%n");
		
		for(Employee currEmp : emp) {
			System.out.println(currEmp);
		}

	}

}
