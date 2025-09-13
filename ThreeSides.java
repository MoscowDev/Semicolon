/* Prompt user to enter first point
Save as a
Prompt user to enter second point
Save as b
Prompt user to enter third point
Save as a c
Check if a is equal to b and a is equal to c and b is eual to c
Print equilateral, if not
Check if a is equal to b or a is equal to c or b is equal to c
Print Isoceles, if not
Print Scalane */

import java.util.Scanner;

public class ThreeSides{

	public static void main(String[] args){

	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Enter first length: ");
	int side1 = scanner.nextInt();

	System.out.print("Enter second length: ");
	int side2 = scanner.nextInt();

	System.out.print("Enter third length: ");
	int side3 = scanner.nextInt();


	
	if(side1 ==side2 && side1 == side3 && side2==side3){
	System.out.println("Equilateral");
	}

	else if(side1 == side2 || side1 == side3 || side2==side3){
	System.out.println("Isoseceles");
	}

	else {
	System.out.println("Scalene");
	}


	}
}
