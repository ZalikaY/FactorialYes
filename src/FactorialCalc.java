import java.util.Scanner;

public class FactorialCalc {

	public static void main(String[] args) {
		
		//Welcome the user
		System.out.println("Welcome to the Factorial Calculator! Factorials are fun and informative!");
		
		//Space
		System.out.println();
		
		
		int i ;
		long factor = 1;
		String cont = "y";
		
		
		//While loop
		while (cont.equalsIgnoreCase("Y")) {
		
			//User Prompt
			System.out.println("Enter an integer that's greater than 0 but less than 10: ");
			//Create Scanner
			Scanner s = new Scanner(System.in);
			int num = s.nextInt();
		
		
		//for loop
		for (i = 1;i <= num; i++) 
			factor = factor *i;
			System.out.println(factor);
		
		//Continue
		System.out.println("Continue? (y/n)");
		s.nextLine();
		cont =s.nextLine();
		
		}
	}
		} 

	//Factorial formula
		/*	public static long factorial(int n){ 
			    if (n == 1) return 1; 
			    return n * factorial(n-1); 
	}*/


