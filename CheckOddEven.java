package javaone;

import java.util.Scanner;

public class CheckOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.println("Enter the number");
int number = input.nextInt();
if(number%2 ==0) {
	System.out.println("The Given number "+number  +" is Even");}
	else
		System.out.println("The Given number "+number  +" is odd");
System.out.println("Bye");
}
	
	}


