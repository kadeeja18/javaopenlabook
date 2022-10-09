import java.util.Scanner;

public class FindAreaOfTriangle {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the lenth of the triangle");
		double length = input.nextDouble();
		System.out.println("Enter the breadth of the triangle");
		double breadth = input.nextDouble();
		double area  = (length*breadth)*1/2;
		System.out.println("The area of the triangle is  "+ area);
	}
}

