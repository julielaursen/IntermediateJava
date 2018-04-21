package Chapter20Generics;

public class GenericMethodTest {
	
	public static void main(String[] args)
	{
		
		//add two additional integer arguments, lowSubscript, highSubscript
		Integer[] intArray = {1, 2, 3, 4, 5};
		Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
		Character[] charArray = {'H', 'E', 'L', 'L', 'O'};
		Integer lowSubscript = -1; //or lower
		Integer highSubscript; //inputArray.length or higher
		
		System.out.printf("%nArray integerArray contains:%n");
		printArray(intArray);
		System.out.printf("%nArray doubleArray contains:%n");
		printArray(doubleArray);
		System.out.printf("%nArray characterArray contains:%n");
		printArray(charArray);
		System.out.printf("%nTest Array%n");
		try{
			printArray(intArray, 0, 2);
				}
		catch(InvalidSubscriptException ise){
			System.out.println(ise);
		}
		}
	
	//if either lowSubscript or highSubscript is out of range
	//throw an invalidSubscriptException, otherwise print number of elements
	//use super method to put method in an exception
	public static <T> void printArray(T[] inputArray)
	{
		for (T element : inputArray)
			System.out.printf("%s ", element);
		
		System.out.println();
	}
	
	//overloading method
	public static <T> void printArray(T[] inputArray, int lowSubscript, int highSubscript) throws InvalidSubscriptException
	{
		//if lowSubscript or highSubscript
		if (lowSubscript < 0)
			throw new InvalidSubscriptException("lowSubscript out of bounds");
		if (highSubscript > inputArray.length-1)
			throw new InvalidSubscriptException("highSubscript out of bounds");
		
		for (int i = lowSubscript; i<= highSubscript; i++)
		{
			System.out.println(inputArray[i]);
		}
		
		}
}
