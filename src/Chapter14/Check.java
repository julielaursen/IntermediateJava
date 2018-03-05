package Chapter14;

import java.util.Scanner;

public class Check {

	public static void main(String[] args) {
		System.out.println("Please enter an amount below $1000.00");
		Scanner scanner = new Scanner(System.in);
		int amount = scanner.nextInt();
		numToStr(amount);
	}
	
	public static String numToStr(int amount) {

		String[] toTwenty = { "ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX",
		        "SEVEN", "EIGHT", "NINE", "TEN", "ELEVEN", "TWELVE",
		        "THIRTEEN", "FOURTEEN", "FIFTEEN", "SIXTEEN", "SEVENTEEN",
		        "EIGHTEEN", "NINETEEN" };

		String[] tens = { "NULL", "NULL", "TWENTY", "THIRTY", "FOURTY", "FIFTY",
		        "SIXTY", "SEVENTY", "EIGHTY", "NINETY" };
		
		
	    String str = "";
	    if (amount >= 100) {
	        str = toTwenty[ amount / 100] + " hundred " + numToStr(amount % 100);
		    System.out.println(str);
	 	    return str;
	    }
	    else if (amount >= 20) {
	    	str = tens[amount / 10] + numToStr(amount % 10);
	    	System.out.println(str);
	    	return str;
	    }
	
	    else {
	        str += toTwenty[ amount ];
		    System.out.println(str);
	 	    return str;
	    }
	}

}
