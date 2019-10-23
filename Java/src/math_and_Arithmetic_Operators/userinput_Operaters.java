package math_and_Arithmetic_Operators;

import java.util.Scanner;

public class userinput_Operaters {


	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Please Enter First Number : ");
		int x = scan.nextInt();
		System.out.println("Please Enter First Number : ");
		int y = scan.nextInt();
		int answer;
		
		answer = x + y;
		
		System.out.println("Answer = " + answer);

	}

}
