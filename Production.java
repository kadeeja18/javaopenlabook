package javaone;

import java.util.Scanner;

public class Production {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		long prod=1;
		
		System.out.println("Enter the initial number:");
		int initial = input.nextInt();
		System.out.println("Enter the final number:");
		int finalv = input.nextInt();
		for( int i=initial;i<=finalv;i++) {
		prod*=i;
		}

		System.out.println("The prod of int " +prod);
		
	}

}
