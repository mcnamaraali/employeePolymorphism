
public class Payroll {

	public static void main(String[] args) {
		CommissionEmployee commissionEmployee = new CommissionEmployee
				("Sue", "Jones","333-333", 1000.00,.06);
		
		BasePlusCommissionEmployee basePlusCommissionEmployee = new 
				BasePlusCommissionEmployee ("Ali", "Java", "333-333",
						1000.00, 0.6, 1.0);

		
		Employee[] emp = new Employee[4];
		
		emp[0] = commissionEmployee;
		emp[1] = basePlusCommissionEmployee;
		emp[2] = basePlusCommissionEmployee;
		emp[3] = commissionEmployee;
		
		System.out.printf("Employees processed polymorphically %n%n");
		
		for(Employee currEmp : emp) {
			System.out.println(currEmp);
			
		
			if(currEmp instanceof BasePlusCommissionEmployee) {
				
				//downcasting example 
				BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currEmp;
				
				System.out.printf("new base salary with 10%% increase is:"
						+ "€%,.2f%n%n", employee.getBaseSalary());
			}
			System.out.printf("earned €%.2f %n%n", currEmp.earnings());
		}
	
	}

}
