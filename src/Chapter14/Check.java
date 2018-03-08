package Chapter14;

import java.util.Scanner;

public class Check {

	public static void main(String[] args) {
		System.out.println("Please enter an amount below $1000.00");
		Scanner scanner = new Scanner(System.in);
		float amount = scanner.nextFloat();
		numToStr(amount);
	}
	
	public static String numToStr(float amount) {

		String[] toTwenty = { "ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX",
		        "SEVEN", "EIGHT", "NINE", "TEN", "ELEVEN", "TWELVE",
		        "THIRTEEN", "FOURTEEN", "FIFTEEN", "SIXTEEN", "SEVENTEEN",
		        "EIGHTEEN", "NINETEEN" };

		String[] tens = { "NULL", "NULL", "TWENTY", "THIRTY", "FOURTY", "FIFTY",
		        "SIXTY", "SEVENTY", "EIGHTY", "NINETY" };
		
		String stringAmount = String.valueOf(amount);
		String[] parts = stringAmount.split("\\.");
		String cents = parts[1];
		
		
	    String str = "";
	    String hundredsStr = "";
	    String tensStr = "";
	    String onesStr = "";
	    float tensInt;
	    float onesInt;
	    
	    if (amount >= 100) {
	    	hundredsStr = toTwenty[ (int) (amount / 100)];
	        tensInt = amount % 100;
	        onesInt = amount % 10;
	    	if (tensInt < 20){
	    		tensStr = toTwenty[(int)(tensInt)];
	    		//System.out.println(tensInt);
	    		//System.out.println(tensStr);
	        	str = hundredsStr + " hundred " +  tensStr;
	    	}
	        	else{	
	    	    tensStr = tens[(int) (tensInt / 10)];
	    	    onesStr = toTwenty[(int) (onesInt % 10)];
		        str = hundredsStr + " hundred " +  tensStr + onesStr;
	    		}
 	    }
	    else if (amount < 100 && amount >= 20) {
	    	str = tens[(int) (amount / 10)] + toTwenty[(int) (amount % 10)];
  	    }
	    else if(amount < 20){
	        str = toTwenty[ (int) amount ];
  	    }
	    System.out.println(str + " dollars and " + cents + "/100 cents");
	    return str;


	}
}
