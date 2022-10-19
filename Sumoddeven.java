package javaone;

import java.util.Scanner;

public class Sumoddeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
int sumOdd = 0;
int sumEven = 0;
int absDiff=0;
System.out.println("Enter the initial number:");
int initial = input.nextInt();
System.out.println("Enter the final number:");
int finalv = input.nextInt();
for( int i=initial;i<=finalv;i++) {
	if(i%2==0) {
		sumEven +=i; 
	}
	else {
	sumOdd+=i;
	}
}

System.out.println("The even sum is " +sumEven);
System.out.println("The odd sum is " + sumOdd);
if(sumEven>sumOdd) {
	absDiff = sumEven-sumOdd;
}
else {
	absDiff = sumOdd-sumEven;
}
System.out.println("The abs difference is "+absDiff);
	}

}
