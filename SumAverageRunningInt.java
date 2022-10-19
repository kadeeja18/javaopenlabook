package javaone;

import java.util.Scanner;

public class SumAverageRunningInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
float sum =0;
double average = 0.0;
Scanner input = new Scanner(System.in);
System.out.println("Enter the minimum number");
int lowerBound = input.nextInt();
System.out.println("Enter the maximum number");
int upperBound = input.nextInt();
int n = upperBound - lowerBound;
for(int i=lowerBound;i<=upperBound;i++) {
sum+=i;	

}
System.out.println("The sum = "+sum);
average = sum/n;
System.out.println("The average of the obtained sum is "+ average);
	}

}
