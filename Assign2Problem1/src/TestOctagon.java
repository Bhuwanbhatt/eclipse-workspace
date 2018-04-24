
public class TestOctagon {

	public static void main(String[] args) {
		//try-catch block to handle the exception thrown by clone method
		try {
			Octagon oct1 = new Octagon(5.0);//construct a new octagon with side 5.
				System.out.println("oct1: " + oct1.toString());	
			Octagon oct2 = (Octagon)(oct1.clone());//clones the octagon oct1 
			    System.out.println("oct2: " + oct2.toString());
			    System.out.println("oct1.compareTo.(oct2): " + oct1.compareTo(oct2) );//Compares the two octagon, oct1 with oct2.
		   }
      catch(CloneNotSupportedException ex) {
    	     System.out.println("The object cannot be cloned");
      }
	}

}
