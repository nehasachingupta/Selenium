package week1.day2;

import java.util.Scanner;
//Home Assignment 2: Print if the given number is prime
//Goal: To understand the problem solving, looping and conditional statement

//a) Create a class by name: IsPrime
//b) Create a main method using shortcut
//c) Write a logic to find if the given number is prime or not
//d) Print if it is prime or not
//Hint: Iterate through all numbers from 2 to n-1 (input) and 
//for every number check if it divides n (input). 
//If we find any number that divides, print prime.
//If nothing divides, then print non-prime

//Time to given: 15 - 20 minutes.


public class IsPrime_Homework_assignment {
	public void isprime(int num)
	{
	
	    int flag = 1 ;
		for(int i=2;i<=num-1;i++)
		{
			if(num%i==0){
			       flag = 0;
			       break;
		             }
			else
				flag=1 ;
			}
		
	if(flag ==1) 
	{
	System.out.println("entered no "+num+" "+"is a prime no");
	}
	else
	{
		System.out.println("entered no "+num+" "+"is not a prime no");
	}
	}
public static void main(String[] args) {
	 Scanner sc= new Scanner(System.in);
	  IsPrime_Homework_assignment prime=new IsPrime_Homework_assignment();
	  System.out.println("Enter any prime no to check");
	  int a=sc.nextInt();
	  prime.isprime(a);
}
}

