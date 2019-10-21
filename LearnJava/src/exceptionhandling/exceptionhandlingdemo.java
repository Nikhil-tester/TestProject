package exceptionhandling;

public class exceptionhandlingdemo {

	public static void main(String[] args) {
		try {
			demo();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	 public static void demo() throws Exception {
		
		
			System.out.println("Hello World ...");
			
			//delibratly throw an exception
			//throw new ArithmeticException("not valid operation	");
			
			int i= 1/0;
			System.out.println("Completed ");
			

	}

}
