import java.util.Scanner;

public class Assignment1{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter first name: ");
	String 	person1 = input.nextLine();

	System.out.print("Enter second name: ");
	String person2 = input.nextLine();

	System.out.print("Enter third name: ");
	String person3 = input.nextLine();

	System.out.print("Enter first age: ");
	int age1 = input.nextInt();

	System.out.print("Enter second age: ");
	int age2 = input.nextInt();

	System.out.print("Enter third age: ");
	int age3 = input.nextInt();

	if (age1 >= age2 && age1 >= age3){
	System.out.printf("The oldest person is %s: " , age1);
	} if (age2 >= age1 && age2 >= age3){
	System.out.printf("The oldest person is %s: " , age2);
	} if (age3 >= age1 && age3 >= age2){
	System.out.printf("The oldest person is %s: " , age3);
	}
	if (firstAge <= age2 && age1 <= age3){
	System.out.printf("The youngest person is %s: " , age1);
	} if (secondAge <= age1 && age2 <= age3){
	System.out.printf("The youngest person is %s: " , secondAge);
	} if (age3 <= age1 && age3 <= age2){
	System.out.printf("The youngest person is %s: " , age3);
	}

}
}
