package javaone;

import java.util.Scanner;

public class PrintDayInWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your number");
int dayNumber = input.nextInt();
if(dayNumber==1) {
	System.out.println("Monday");
}
else if(dayNumber==2){
	System.out.println("TUESDAY");
}
else if(dayNumber==3){
	System.out.println("WEDNESDAY");
	}
else if(dayNumber==4){
	System.out.println("THURSDAY");
}
else if(dayNumber==5){
	System.out.println("FRIDAY");
}
else if(dayNumber==6){
	System.out.println("SATURDAY");
}
else if(dayNumber==7){
	System.out.println("SUNDAY");
}

else {
	System.out.println("Others");
}
switch(dayNumber) {
case 1: 
System.out.println("Monday");

break;
case 2: 
System.out.println("TUESDAY");

break;
case 3: 
System.out.println("WEDNESDAY");

break;
case 4: 
System.out.println("THURSDAY");

break;
case 5: 
System.out.println("FRIDAY");

break;
case 6: 
System.out.println("SATURDAY");

break;
case 7: 
System.out.println("SUNDAY");

break;

default:
	System.out.println("others");
	break;
}

}
}
