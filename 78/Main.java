
public class Main {

	public static void main(String[] args) throws InterruptedException {

		MyThread thread1 = new MyThread();
		
		MyRunnable runnable1 = new MyRunnable();
		Thread thread2 = new Thread(runnable1);
		
		//thread1.setDaemon(true);
		//thread2.setDaemon(true);
		
		thread1.start();
		
		/* calling thread will wait (in this case main thread) until the specified 
		 * thread dies or for x milliseconds
		 */
		
		//thread1.join(3000); 	// waiting for thread1 to finish executing
		
		thread2.start();
		
		//System.out.println(1/0);

	}

}
