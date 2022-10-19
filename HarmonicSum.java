package javaone;

import java.util.Scanner;

public class HarmonicSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.println("Enter the maximum denominator");
int max_denominator=input.nextInt();
//	int max_denominator = 5000;
double sumL2R = 0;
double sumL =0;
double sumR=0;
double sumR2L = 0;
for (double denominator = 1;denominator<=max_denominator;denominator++) {
	sumL =(double)(1/denominator);
	sumR=(double)(1)/(max_denominator-denominator+1);
	sumL2R+=sumL;
	sumR2L+=sumR;
			}

//for(double denominator=max_denominator;denominator>=1;denominator--) {
//	sumR = (double)(1/denominator);
//	sumR2L+=sumR;
//}
System.out.println("The sum from Left to right" + sumL2R );
System.out.println("The sum from Right to Left" + sumR2L );

	}
 
}
