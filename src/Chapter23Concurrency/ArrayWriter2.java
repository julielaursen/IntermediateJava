package Chapter23Concurrency;

// Fig. 23.6: ArrayWriter.java
// Adds integers to an array shared with other Runnables
import java.lang.Runnable;
import java.util.Random;

public class ArrayWriter2 implements Runnable
{
   private final SimpleArray2 sharedSimpleArray;
   private final int limit;
   private Random rand = new Random();

   public ArrayWriter2(int limit, SimpleArray2 array)
   {
      //startValue = start;
      this.limit = limit;
      sharedSimpleArray= array;
   }

   public void run()
   {
      for (int i = 0; i < limit; i++)
      {
         sharedSimpleArray.add(rand.nextInt(20)); // add an element to the shared array
      } 
   }
} // end class ArrayWriter




