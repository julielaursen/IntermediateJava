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
//  Description: This class creates a general Employee superclass 
//  with attributes and behaviors that are common for all employees 
//  including firstName, lastName, socialSecurityNumber. This class
//  includes getters for all private variables and a portion of method 
//  toString.
//  CommissonEmployee from section 9.4.5 will be a subclass of this class
//
//********************************************************************



package Chapter9;

public abstract class Employee implements Payable{

	private final String firstName;
	private final String lastName;
	private final String socialSecurityNumber;
	
	//constructor
	public Employee(String firstName, String lastName, String socialSecurityNumber)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public String getSocialSecurityNumber()
	{
		return socialSecurityNumber;
	}
	
	@Override
	public String toString()
	{
		return String.format("%s  %s%n%s: %s",
				getFirstName(), getLastName(), "social security number: ", getSocialSecurityNumber());
	}
	
	//public abstract double earnings();
	
	//Create an array of employee references to object sof each concrete class in the employee hierarchy. 
	// for each employee, display its String representation and earnings
	

}
