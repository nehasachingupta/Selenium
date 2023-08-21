package week1.day2;
//Home Assignment 1: Print Fibbinocci series for first 11 numbers

//0  1  1  2  3  5  8  13  21  34  55  89  144
//Goal: To understand the arthimetic operation and loop
//a) Create a class by name: Fibbinocci
//b) Create a main method using shortcut
//c) Write a logic to print fibbinocci from 0 to 56
//Hints: 

//Initialize 3 int variables (Tip: firstNum = 0, secNum = 1, sum = 0)
//Print first number
//Iterate from 1 to the 11
//Add first and second number assign to sum
//Assign second number to the first number
//Assign sum to the second number
//Print sum
//Time to given: 15 - 20 minutes.

public class FibSeries_Homework_assigment {

	
		public void fib()
		{
			int firstNum =0, secNum = 1, sum = 0;
			System.out.println(firstNum);
			for(int i=1;i<=11;i++)
			{
			sum=firstNum+secNum;
			if(sum<=56)
			{
			System.out.println(sum);
			}
		    firstNum=secNum;
			secNum=sum;				
			}
		}
		
		    
	public static void main(String[] args) {
		 
		FibSeries_Homework_assigment fibo= new FibSeries_Homework_assigment();
		  System.out.println("generated series is");		  
		  fibo.fib();  
		 
	}
	}



