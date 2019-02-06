import java.util.Iterator;
import java.util.LinkedList;

public class Iterators {

	public static void main(String args[]){
		 
		LinkedList<String> animals = new LinkedList<String>();

        animals.add("fox");
        animals.add("cat");
        animals.add("dog");
        Iterator<String> it = animals.iterator();

        while (it.hasNext()) {
            String value = it.next();
            System.out.println(value);
            
            if(value.equals("fox")){
            	
                it.remove();
            }
        }

        System.out.println();
	}
}
