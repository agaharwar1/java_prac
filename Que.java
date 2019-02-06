
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Que {

	public static void main(String args[])
	{
		 Queue<Integer> q1 = new ArrayBlockingQueue<Integer>(3);
		 
		 q1.add(10);
	        q1.add(20);
	        q1.add(30);
	        
	        System.out.println("First element " + q1.element());
	        
	      
	        for(Integer value: q1) {
	            System.out.println("Queue value: " + value);
	        }
	        
	        System.out.println("Removed from queue: " + q1.remove());
	       
	        
	    
	}
}
