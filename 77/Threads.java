
public class Threads {

	public static void main(String[] args) throws InterruptedException {

		// active threads
		
		//System.out.println(Thread.activeCount());
		
		// set name of active thread
		
		//Thread.currentThread().setName("MAIN");
		
		// name of active thread
		
		//System.out.println(Thread.currentThread().getName());
		
		// set priority of thread
		
		//Thread.currentThread().setPriority(10);
		
		// see priority of thread
		
		//System.out.println(Thread.currentThread().getPriority());
		
		// check if the thread is alive
		
		//System.out.println(Thread.currentThread().isAlive());
		
		// put thread to sleep
		
		/*
		
		for(int i = 3; i>0; i--) {
			System.out.println(i);
			Thread.sleep(1000);
		}
		
		System.out.println("You are done");
		
		*/
		
		MyThread thread2 = new MyThread();
		
		thread2.setDaemon(true);
		System.out.println(thread2.isDaemon());
		
		thread2.start();
				
		//System.out.println(thread2.isAlive());
		
		//thread2.setName("2nd thread");
		
		//System.out.println(thread2.getName());
		
		//thread2.setPriority(1);
		
		//System.out.println(thread2.getPriority());
		
		//System.out.println(Thread.activeCount());
		
	}

}
