package Chapter23Concurrency;

//class SimpleArray (synchronized version)
//class ArrayWrite
//class SharedArrayTest
//change array size to 15,000,000 and modify run method to add
//random numbers between 1-20 to the array. 
//Add a totalArray attribute to the SimpleArray class
//to return the sum of members in the array
//use four threads and do not populat ethe array past the end
//Remove all the thread.sleep statements in the above classes
//
//Create a simple integer array of size 15,000,000 and populate
// it with random numbers, return the sum of the numbers
//Use the Date/Time API timing techniques from 23.12 to 
//compare the time required for both program sto run

import java.util.Arrays;
import java.util.Random;
import java.security.SecureRandom;
import java.time.Duration;
import java.time.Instant;

public class Concurrency {
	{
		public static void main(String[] args)
		{
			SecureRandom random = new SecureRandom();
			int[] array1 = random.ints(15_000_000).toArray();
		}
	}
	
}
 