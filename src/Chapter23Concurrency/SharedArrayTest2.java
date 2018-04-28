package Chapter23Concurrency;

// Fig 23.7: SharedArrayTest.java
// Executing two Runnables to add elements to a shared SimpleArray.
import java.util.concurrent.Executors;
import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public class SharedArrayTest2
{
   public static void main(String[] arg)
   {
	  int size = 15000000;
	  int start1 = 0;
	  int limit = size / 4;
	  
      SimpleArray2 sharedSimpleArray = new SimpleArray2(size);

      // create two tasks to write to the shared SimpleArray
      ArrayWriter2 writer1 = new ArrayWriter2(limit, sharedSimpleArray);
      ArrayWriter2 writer2 = new ArrayWriter2(limit, sharedSimpleArray);
      ArrayWriter2 writer3 = new ArrayWriter2(limit, sharedSimpleArray);
      ArrayWriter2 writer4 = new ArrayWriter2(limit, sharedSimpleArray);

      // execute the tasks with an ExecutorService
      ExecutorService executorService = Executors.newCachedThreadPool();
      Instant start = Instant.now();
      
      
      executorService.execute(writer1);
      executorService.execute(writer2);
      executorService.execute(writer3);
      executorService.execute(writer4);

      executorService.shutdown();
      try
      {
         boolean tasksEnded = 
          executorService.awaitTermination(5, TimeUnit.SECONDS);

         if (tasksEnded)
         {
            System.out.printf("%n Total of SimpleArray:%n");
            System.out.println(sharedSimpleArray.getTotalArray()); // print contents
            Instant end = Instant.now();
            long timeElapsed = Duration.between(start, end).toMillis();            
            System.out.println("Time taken: " + timeElapsed + " milliseconds.");
         }
         else
            System.out.println(
               "Timed out while waiting for tasks to finish.");
      } 
      catch (InterruptedException ex)
      {
         ex.printStackTrace();
      } 
   } // end main
} // end class SharedArrayTest
