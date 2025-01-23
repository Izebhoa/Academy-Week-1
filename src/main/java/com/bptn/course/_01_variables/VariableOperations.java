package com.bptn.course._01_variables;

public class VariableOperations {

	public static void main(String[] args) {
		
		//Declare 2 integer variables and assign them values
		int x = 2;
		int y = 5;
		
		//Perform Arithmetic Operations
		int add = x + y;
		int subtract = x - y;
		int multiply = x * y;
		int divide = x / y;
				
		//Print the original variables and the results of the arithmetic operations.
		System.out.println(" The original variables are: x = " + x + " and y = " + y);
		System.out.println(" Addition = " + add);
		System.out.println(" Subtraction = " + subtract);
		System.out.println(" Multiplication = " + multiply);
		System.out.println(" Division = " + divide);
		
		//Reassign new values to the original variables
		x = 4;
		y = 10;
		
		//Print the new values of the original variables
		System.out.println(" The new values of the original variables are: x = " + x + " and y = " + y);
		
		//Declare a character variable and a string variable and print them.
		char a = 'A';
		String stringVar = "Obsidi";
				
		System.out.println("Declared Character is " + a + " and Declared String is " + stringVar);

	}

}
