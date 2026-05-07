
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Excutorservice {

	public static void main(String[] args) {

	        ExecutorService executor = Executors.newFixedThreadPool(5);

	        for (int i = 1; i <= 5; i++) {
	            int threadNumber = i;

	            executor.submit(() -> {
	                System.out.println("Task " + threadNumber + 
	                                   " executed by " + Thread.currentThread().getName());
	            });
	        }

	        executor.shutdown();
	    
	}

}
