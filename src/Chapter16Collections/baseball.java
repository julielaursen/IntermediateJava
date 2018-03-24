package Chapter16Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Paths;

public class baseball {
	
	public static Scanner input;
	
	public static void main(String[] args) 
	{
	Map<Integer, String> myMap = new HashMap<>();
	
		//System.out.println(System.getProperty("user.dir"));
		try {
		 input = new Scanner(Paths.get("baseball.txt"));
		 int year = 1903;
		 while (input.hasNextLine()){
			if(year != 1904 && year != 1994){
			String winner = input.nextLine();
			myMap.put(year, winner);
			}
			year++;	
		    }
		 System.out.println(myMap);
		
		input.close();
		} catch (IOException e) {
			e.printStackTrace();
		}	 
		
		getYear();
	}
	
	public static int getYear(){
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a year between 1903 and 2017");
		int year = reader.nextInt();
		reader.close();		
		return 0;
	}
	
}	

//
//}

//	

	