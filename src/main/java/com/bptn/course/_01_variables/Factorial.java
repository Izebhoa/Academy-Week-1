package com.bptn.course._01_variables;

//Import Scanner
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		//Create a Scanner object called 'scanner' to read user's input
		Scanner scanner = new Scanner(System.in);
		
      System.out.print("Please enter a positive integer: ");
      
      //Declare variables used
      int userNum = scanner.nextInt(); //Reads an integer input from the user using the scanner object and stores it in the variable number.
      long factAns = 1; //Declares a long variable named factorial and initializes it to 1. long is used because factorials can grow very large.

      //Use a 'for' loop to calculate the factorial
      if (userNum < 0) {
          System.out.println("The number must be a positive integer.");
      } 
      else {  
          /*the count keeps increasing by 1 until it exceeds userNum.    
      	i is initialized to 1 and increments by 1 on each iteration until it exceeds number.*/
          for (int i = 1; i <= userNum; i++) {

          /* Multiply and store new value in factAns. 
          (Multiplies factorial by the current value of i and stores the result back in factorial.)*/
          factAns *= i;
          }
          System.out.println("Its factorial is: " + factAns);
      }

      scanner.close();
  }
}

  


