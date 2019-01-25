import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class App  {
	public static void main(String args[]) {
		File file = new File("text.txt");
		try(BufferedWriter br = new BufferedWriter(new FileWriter(file))){
			 br.write("hello");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

}
