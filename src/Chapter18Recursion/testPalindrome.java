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
	System.out.println(isPalindrome(input));
	scanner.close();

	
	//put the string into an array
	
	}
	
	//return boolean value 
	public static boolean isPalindrome(String myString)
	{
	   if (myString.length() == 1 || myString.isEmpty())
		   return true;
	   else if (myString.length()==2)
		   return myString.charAt(0)==myString.charAt(myString.length()-1);
	   else if (myString.charAt(0)==myString.charAt(myString.length()-1))
		   return isPalindrome(myString.substring(1, myString.length()-1));		   
	   else
		   return false;	   
	}
}
