//edited version of 16.18

package Collections;

import java.util.Map;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;
import java.util.Scanner;


public class wordTypeCount {

	public static void main(String[] args)
	{
	//create hashmap to store string keys and integer values
		Map<String, Integer> myMap = new HashMap<>();
		
		createMap(myMap); //create map based on user input
		displayMap(myMap); //display map content
	}
	
	private static void createMap(Map<String, Integer> map) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string");
		String input = scanner.nextLine();
		String strippedString = input.replaceAll("\\s+","");
		//System.out.println(strippedString);

		
		//tokenize the input
		String[] tokens = strippedString.split("");
		//System.out.println(strippedString);
		
		for (String token: tokens)
		{
			String letter = token.toLowerCase();
			
			//if the map contains the word
			if(map.containsKey(letter))
			{
				int count = map.get(letter);
				map.put(letter, count + 1);
			}
			else
				map.put(letter,  1);
		}
	}
		
	private static void displayMap(Map<String, Integer> map)
		{
			Set<String> keys = map.keySet();
			
			//sort keys
			TreeSet<String> sortedKeys = new TreeSet<>(keys);
			
			System.out.printf("%nMap contains:%nKey\t\tValue%n");
			
			//generate output for each key in map
			for (String key: sortedKeys)
				System.out.printf("%-10s%10s%n", key, map.get(key));
				System.out.printf("%nsize: %d%nisEmpty; %b%n", map.size(), map.isEmpty());
		}

	
	
}
