
public class enums {

	public static void main(String[] args) {
		Animal animal = Animal.CAT;
		switch(animal)
		{
		case CAT: System.out.println("Cat is chosen");
		          break;
		case DOG: System.out.println("Dog is chosen");
		          break;
		default:
			break;
			
			
		}


	}
	public enum Animal{
		CAT,DOG,MOUSE
		
	} 
	
	
	

}
