package Chapter23Concurrency;

// Fig. 23.6: ArrayWriter.java
// Adds integers to an array shared with other Runnables
import java.lang.Runnable;
import java.util.Random;

public class ArrayWriter implements Runnable
{
   private final SimpleArray sharedSimpleArray;
   //private final int startValue;
   private final int limit;
   private Random rand = new Random();

   public ArrayWriter(int limit, SimpleArray array)
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





/**************************************************************************
 * (C) Copyright 1992-2015 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
