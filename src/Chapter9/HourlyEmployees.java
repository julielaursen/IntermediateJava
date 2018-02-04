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
//  Description: This class extends Employee class. it has instance variables (double) that 
// represents the hours worked, instance variable wage ( a double), that represents wages per hour,
// a constructor that takes as arguments first name, last name, social security, hourly wage and
// numbers of hours worked, set and get methods for manipulating the hours and wage, an earnings
// method to calculate the HourlyEmployee's earnings based on hours worked and a toString method
// that returns the hourlyEmployee's string representation. Method setWage should ensure that wage is 
// non negative, and setHours should ensure that the value of hours is between 0-168
//********************************************************************

package Chapter9;

public class HourlyEmployees extends Employee {
	
	private double hours;
	private double wage;
	
	
	public HourlyEmployees(String firstName, String lastName, String socialSecurityNumber, double hours, double wage)
	{		
		super(firstName, lastName, socialSecurityNumber);
		if (wage < 0.0)
			throw new IllegalArgumentException("Hourly wage must be >= 0.0");
		
		if ((hours < 0.0) || (hours > 168.0))
				throw new IllegalArgumentException("Hours worked must be >= 0.0 and <= 168");
	
		this.wage = wage;
		this.hours = hours;
	}
	
	public void setWage(double wage)
	{
		if (wage < 0.0)
			throw new IllegalArgumentException("Hourly wage must be >= 0.0");
		this.wage = wage;
	}
	
	public double getWage()
	{
		return wage;
	}
	
	public void setHours(double hours)
	{
		if ((hours < 0.0) || (hours > 168.0))
			throw new IllegalArgumentException("Hours worked must be >=0.0 and <=168.0");
		this.hours = hours;
	}
	
	public double getHours()
	{
		return hours;
	}
	
	@Override
	public double getPaymentAmount()
	{
		if(getHours() <= 40)
			return getWage() * getHours();
		else
			return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
	}

	
	@Override
	public String toString()
	{
		return String.format("hourly employee: %s%n%s: $%,.2f; %s: %,.2f",
				super.toString(), "hourly wage", getWage(), "hours worked", getHours());
	}
	
}
