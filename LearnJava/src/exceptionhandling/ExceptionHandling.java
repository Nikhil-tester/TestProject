package exceptionhandling;

public class ExceptionHandling {
	
	public static void main(String[] args) {
		
		
		try {
		System.out.println("Hello World ...");
		int i= 1/0;
		System.out.println("Completed ");
		}
		//if try block fails then catch block will run
		catch(Exception exp)
		{
			System.out.println("I am inside catch block");
			System.out.println("Message is : " + exp.getMessage());
			System.out.println("Couse is : "+ exp.getCause());
			exp.printStackTrace();
		}
		//this will run irrecpective of any blocks fail or pass at the end
		finally{
			System.out.println("I am inside finally block");
			
			
		}
	}

}
