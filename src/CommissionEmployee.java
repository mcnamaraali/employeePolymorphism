
public class CommissionEmployee extends Employee {
	private double grossSales;
	private double commissionRate;
	
	public CommissionEmployee (String firstName, String lastName, 
			String socialSecurityNumber, 
			double grossSales, double commissionRate) {
		super(firstName, lastName, socialSecurityNumber);
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
		
	}

	public double getCommissionRate() {
		return commissionRate;
	}
	
	public double getGrossSales() {
		return grossSales;
	}
	
	@Override
	public double earnings() {

		return getCommissionRate() * getGrossSales();
	}
	
	
	

}
