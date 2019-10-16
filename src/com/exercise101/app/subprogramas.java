package com.exercise101.app;

import java.util.Scanner;

public class subprogramas 
{

	public static void main(String[] args)
	{
		// variable declaration
		int num1=0;
		int num2=0;
		int result=0;
		
		//objects declaration
		Scanner input =new Scanner(System.in);
		
		System.out.println(ShowTunnedMessage("Ale"));
		
		ShowMessage();
		//System.out.println("Dame un numero");
		num1 = input.nextInt();
		
		ShowMessage();
		//System.out.println("Dame otro numero");
		num2 = input.nextInt();
		
		result = num1+num2;
		
		System.out.print("Result is " + result);
		
	}
	//method to ask number
	public static void ShowMessage()
	{
		System.out.print("input a number");
	}
	//method to shoe a tuned message
	public static String ShowTunnedMessage(String message)
	{
		return "Hola!" + message;
	}
	
	//method to add numbers
	public static int Addnumbers(int num1, int num2)
	{
		return num1+num2;
	
	
	}
}
