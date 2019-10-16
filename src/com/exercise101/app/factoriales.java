package com.exercise101.app;
import java.util.Scanner;

public class factoriales
{

	public static void main(String[] args) 
	{
		// variable declaration
		long factorial = 1;
		int number = -1;
		//object construction
		Scanner input = new Scanner(System.in);

		do
		{
			System.out.println("number to calculate factorial; ");
			number=input.nextInt();
			if(number<=0);
			{
				System.out.println("You must give a positive value");
				
			}
		}while(number<=0);
		
		factorial = GiveFactorial( number); //the number does not have to be a variable but the same tipo de dato
		//System.out.print("The factorial number of: " + number + " is: " +factorial+ " which is gotten by multiplying several times " + number);
			System.out.println(String.format("The factorial of %d is: is: %d, which is gotten b multypliyng several times %d", number, factorial, number));
	}
	
	public static long GiveFactorial(int n)
	{
		int factorial = 1;
		for(int i=1; i<n; i++) {
			factorial=factorial*i;
		}
		return factorial;
	}
	public static long GiveFactorial(double number1, int number2)
	{
		return  (long) 0.0;
	}
	
}
		


