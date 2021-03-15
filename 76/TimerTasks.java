import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class TimerTasks {

	public static void main(String[] args) {

		Timer timer = new Timer();
		
		TimerTask task = new TimerTask() {
			
			int counter = 10;

			@Override
			public void run() {
				//System.out.println("Task is completed :)");
				
				if(counter > 0) {
					System.out.println(counter + " seconds");
					counter--;
				}
				else {
					System.out.println("Task is completed");
					timer.cancel();
				}
				
			}
		};
		
		Calendar date = Calendar.getInstance();
		date.set(Calendar.YEAR, 2021);
		date.set(Calendar.MONTH, Calendar.MARCH);
		date.set(Calendar.DAY_OF_MONTH, 15);
		date.set(Calendar.HOUR_OF_DAY, 19);
		date.set(Calendar.MINUTE, 47);
		date.set(Calendar.SECOND, 0);
		date.set(Calendar.MILLISECOND, 0);
		
		// complete task at a certain time
		
		//timer.schedule(task, 3000);
		
		// complete task on a certain date
		
		//timer.schedule(task, date.getTime());
		
		// complete task at a fixed rate. Example: countdown timer
		
		//timer.scheduleAtFixedRate(task, 0, 1000);
		
		// complete task at a fixed rate on a specific date
		
		timer.scheduleAtFixedRate(task, date.getTime(), 1000);
		
	}

}
