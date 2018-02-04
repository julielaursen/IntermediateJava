//********************************************************************
//
//  Author:               Julie Laursen
//
//  Program #:            1
//
//  File Name:            Homework1.java
//
//  Course:               ITSE 2317 Java Programming (Intermediate)
//
//  Due Date:             3/30/18
//
//  Instructor:           Fred Kumi 
//
//  Chapter:              Chapter #9
//
//  Description: This class extends Employee class. It should only contain the instance
//  variables and mehods that are not declared in superclass Employee. It should invoke class 
//  Employee's constructor and CommissionEmployee's toString method should invoke Employee's 
//  toString method.
//
//********************************************************************

package Chapter9;

public class CommissionEmployee extends Employee {
	
	private double grossSales;
	private double commissionRate;
	
		
	
	public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate)
	{
		super(firstName, lastName, socialSecurityNumber);
		if (grossSales < 0.0)
			throw new IllegalArgumentException("Gross sales must be >= 0.0");
		if (commissionRate <= 0.0 || commissionRate > 1.0)
			throw new IllegalArgumentException("Commission Rate must be > 0.0 and < 1.0");
	
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}
	
	
	public void setGrossSales(double grossSales)
	{
		if (grossSales < 0.0)
			throw new IllegalArgumentException("Gross sales must be >= 0.0");
		this.grossSales = grossSales;
	}
	
	public double getGrossSales()
	{
		return grossSales;
	}
	
	public void setCommissionRate(double commissionRate)
	{
		if (commissionRate <= 0.0 || commissionRate >= 1.0)
			throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
		this.commissionRate = commissionRate;
	}

	public double getCommissionRate()
	{
		return commissionRate;
	}
	
	@Override
	public double getPaymentAmount()
	{
		return getCommissionRate() * getGrossSales();
	}

	
	@Override
	public String toString()
	{
		return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f", "commission employee", 
				getFirstName(), getLastName(), "social security number", getSocialSecurityNumber(),
				"gross sales", grossSales, "commission rate", commissionRate);
	}
	
	
}

