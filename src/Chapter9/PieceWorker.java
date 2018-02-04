//********************************************************************
//
//  Author:               Julie Laursen
//
//  Program #:            2
//
//  File Name:            Homework2.java
//
//  Course:               ITSE 2317 Java Programming (Intermediate)
//
//  Due Date:             3/30/18
//
//  Instructor:           Fred Kumi 
//
//  Chapter:              Chapter #9
//
//  Description: shoudl contain private instance variable wage and pieces. provide a concrete implementation of method earnings
//  that calculates earnings by wage per piece. Create an array of Employee variables to store references to objects of each concrete
//  class in the new employee hierarchy. For each employee, display its string representation and earnings.
//
//********************************************************************

package Chapter9;

public class PieceWorker extends Employee{

	private double wage;
	private int pieces;
	
	//Create an array of Employee variables to store references to objects of each concrete class in the new employee hierarchy
	
	public PieceWorker(String firstName, String lastName, String socialSecurityNumber, double wage, int pieces)
	{		
		super(firstName, lastName, socialSecurityNumber);
	}
	
	public double getPaymentAmount()
	{
		return pieces * wage;
	}
}
