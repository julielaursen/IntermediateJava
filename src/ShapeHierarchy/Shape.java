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
//  Due Date:             2/16/18
//
//  Instructor:           Fred Kumi 
//
//  Chapter:              Chapter #10
//
//  Description: Implement the shape hierarchy. Each two dimensional shape shoudl contain
// method getArea to calculate the area of the two-dimensional shape. Each three dimensional 
// shape should have methods getArea and getVolume to calculate the surface area and volume, 
// respectively, of the three dimensional shape. Create a program that uses an array of shape 
// references to objects of each concrete class in the hierarchy. This program should print a
// text description of the object to which each array element refers. Also, in the loop that processes 
// all the shapes of the array, determine whether each shaep is a two dimensional shape
// or a three dimensional shape. if it's a two dimensional shape, display its area. If its a three dimensional
// shape, display area and volume.
//
//********************************************************************



package ShapeHierarchy;

public abstract class Shape {

	public double area(){
		return 0;
	}
	
	public double volume(){
		return 0;
	}

}
