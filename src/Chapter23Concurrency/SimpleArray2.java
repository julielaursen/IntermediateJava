package Chapter23Concurrency;
import java.util.Arrays;

public class SimpleArray2
{
   //private static final SecureRandom generator = new SecureRandom();
   private final int[] array; // the shared integer array
   private int writeIndex = 0; // shared index of next element to write
   private long totalArray = 0l;
   

   public long getTotalArray() {
	int totalArray = 0;
	for (int i = 0; i<array.length; i++)
		totalArray += array[i];
	return totalArray;
}

// construct a SimpleArray of a given size
   public SimpleArray2(int size)
   {
      array = new int[size];
   }

   // add a value to the shared array
   public synchronized void add(int value)
   {
      int position = writeIndex; // store the write index

      array[position] = value;

      ++writeIndex; // increment index of element to be written next
      //System.out.printf("Next write index: %d%n", writeIndex);
   }
   
   public String toString()
   {
      return Arrays.toString(array);
   } 
} // end class SimpleArray
