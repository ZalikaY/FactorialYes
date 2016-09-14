import java.util.Scanner;

public class FactorialCalc {

	public static void main(String[] args) {

		//Welcome the user
		System.out.println("Welcome to the Factorial Calculator! Factorials are fun and informative!");

		//Space
		System.out.println();


		int i ;
		String cont = "y";

		//Create Scanner
		Scanner s = new Scanner(System.in);

		//While loop
		while (cont.equalsIgnoreCase("Y")) {

			//User Prompt
			System.out.println("Enter an integer that's greater than 0 but less than 10: ");
			long num = s.nextInt();

			//Make sure you reset the variable by keeping this in the loop
			long factor = 1;


			//for loop 
			for (i = 1;i <= num; i++)


				//factor = factor * i
				factor *=i;
				System.out.println(factor);


			//Continue
			System.out.println("Continue? (y/n)");
			s.nextLine();
			cont =s.next();

			//The ending thank you message
			System.out.println("Thanks for using the calculator!");
		}
	}
} 

//Factorial formula
/*	public static long factorial(long n){ 
			    if (n == 1){
			     return 1;
			     }else { 
			    return n * factorial(n-1); 
	}*/


