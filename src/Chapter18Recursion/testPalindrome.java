package Chapter18Recursion;

 import java.util.*;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;

//returns boolean value true if the string stored in an array was a palindrome and 
//false otherwise. Ignore spaces and punctuation.

public class testPalindrome {
	
	static ArrayList<String> myArray=new ArrayList<String>();	
	
	public static void main(String[] args) {
	
	//input and store a string
	System.out.println("Enter a string");
	Scanner scanner = new Scanner(System.in);
	String input = scanner.nextLine();
	scanner.close();

	
	//put the string into an array
	char[] charArray = input.toCharArray();
	System.out.println(charArray);
	for (int i = charArray.length-1; i>=0; i--)
		myArray.add(i);
	
	//run an if statement. if input == myArray, then it's a palindrome
	}
}
