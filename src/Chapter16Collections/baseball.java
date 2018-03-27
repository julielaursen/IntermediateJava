package Chapter16Collections;

import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Paths;
import java.util.Set;
import java.util.TreeSet;

public class Baseball {

	private static HashMap<Integer, String> winMap;
	private static Baseball testBall;

	public Baseball() {
		winMap = new HashMap<>();
		try {
			Scanner input = new Scanner(Paths.get("baseball.txt"));
			int year = 1903;
			while (input.hasNextLine()) {
				if (year != 1904 && year != 1994) {
					String winner = input.nextLine();
					winMap.put(year, winner);
				}
				year++;
			}
			input.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		testBall = new Baseball();
		testBall.queryWinningTeams();
	}

	public void queryWinningTeams() {
		Scanner reader = new Scanner(System.in);
			System.out.println("Enter a year between 1903 and 2017");
			int year = reader.nextInt();
			if(getWinningAtYear(year) != null) {
				System.out.println("The winner that year was the " + getWinningAtYear(year));
			} else if (getWinningAtYear(year) == null) {
				System.out.println("No World Series Winner that year");	}	
		reader.close();
	}

	public String getWinningAtYear(Integer year) {
		return winMap.get(year);
	}

	public void printAllWinningTeams() {
		for (Integer yr : winMap.keySet()) {
			System.out.println(yr);
		}
	}

	public List<Integer> getWinningYears(String team) {
		ArrayList<Integer> yearsWinning = new ArrayList<>();
		for (Integer yr : winMap.keySet()) {
			if (team.equals(winMap.get(yr))) {
				yearsWinning.add(yr);
			}
		}
		return yearsWinning;
	}

}
