package misc;
// Java Program to demonstrate how 
// to use CountDownLatch, Its used 
// when a thread needs to wait for other 
// threads before starting its work.
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
 
public class CountdownLatchDemo
{
    @SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String args[]) 
                   throws InterruptedException, ExecutionException
    {
    		ExecutorService executor = Executors.newFixedThreadPool(2);
        // Let us create task that is going to 
        // wait for four threads before it starts
        CountDownLatch latch = new CountDownLatch(5);
        
        FutureTask[] tasks = new FutureTask[5];
        
        for (int i = 0; i < 5; i++) {
        		Callable worker = new Worker(latch);
        		tasks[i] = new FutureTask(worker);
        		Thread t = new Thread(tasks[i]);
        		executor.execute(t);
        }
 
        for (int i = 0; i <5; i++) {
        		System.out.println("Future result is: " + tasks[i].get() + "; and Task done is " + tasks[i].isDone());
        }
 
        // The main task waits for four threads
        latch.await();
 
        // Main thread has started
        System.out.println(Thread.currentThread().getName() +
                           " has finished");
    }
}
 
// A class to represent threads for which
// the main thread waits.
@SuppressWarnings("rawtypes")
class Worker implements Callable
{
    private CountDownLatch latch;
 
    public Worker(CountDownLatch latch)
    {
        this.latch = latch;
    }
 
    public Object call() throws Exception
    {
    	 System.out.println(Thread.currentThread().getName()
                 + " starting..");
    		Random generator = new Random();
        Integer randomNumber = generator.nextInt(5);
        Thread.sleep(randomNumber*1000);
        latch.countDown();
        System.out.println(Thread.currentThread().getName()
                        + " finished");
        return randomNumber;
   
    }
}
