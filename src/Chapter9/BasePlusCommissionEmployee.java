package Chapter9;

public class BasePlusCommissionEmployee extends CommissionEmployee 
{
	private double baseSalary;
	
	public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double comissionRate, 
			double baseSalary)
	{
		super(firstName, lastName, socialSecurityNumber, grossSales, comissionRate);
		
		if (baseSalary < 0.0)
			throw new IllegalArgumentException("Base salary must be > =0.0");
		this.baseSalary = baseSalary;
	}
	
	public void setBaseSalary(double baseSalary)
	{
		if (baseSalary < 0.0)
			throw new IllegalArgumentException("Base salary must be > 0.0");
		this.baseSalary = baseSalary;
	}
	
	public double getBaseSalary()
	{
		return baseSalary;
	}
	
	@Override
	public double getPaymentAmount()
	{
		return getBaseSalary() + super.getPaymentAmount();
	}
	
	@Override
	public String toString()
	{
		return String.format("%s %s%n%s: %.2f", "Base-salaried", super.toString(), "base salary", getBaseSalary());
	}
}
