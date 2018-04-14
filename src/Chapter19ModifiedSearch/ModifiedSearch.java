package Chapter19ModifiedSearch;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;

public class ModifiedSearch {
	

	public static int linearSearch(int data[], int searchKey, int startingIndex)
	{
		if (searchKey == data[startingIndex])
			return startingIndex ;
		else return linearSearch(data, searchKey, startingIndex + 1);
	}
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		SecureRandom generator = new SecureRandom();
		
		int[] data = new int[10];
		
		for (int i=0; i < data.length; i++)
			data[i] = 10 + generator.nextInt(90);
		
		System.out.printf("%s%n%n", Arrays.toString(data));
		
		System.out.print("Please enter an integer value (-1 to quit): ");
		int searchInt = input.nextInt();
		
		int startingIndex = 0;
		
		while (searchInt != -1)
		{
			int position = linearSearch(data, searchInt, startingIndex);
			if (position == -1)
				System.out.printf("%d was not found%n%n", searchInt);
			else
				System.out.printf("%d was found in position %d%n%n", searchInt, position);
			
			System.out.print("Please enter an integer value (-1 to quit): ");
			searchInt = input.nextInt();
		}
	}
}
