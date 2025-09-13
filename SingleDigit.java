/*prompt a user to enter a  number,
  store the input in a variable
  check if the input is equal to any number between 0 and 9
  print the exact number in words
  if not, print "Invalid"
*/

import java.util.Scanner;

public class SingleDigit{

	public static void main(String[] args){

	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Enter Digit: ");
	int digit = scanner.nextInt();

	if(digit == 0){
	System.out.print("Zero");
}
	else if( digit ==1){
	System.out.print("One" );
}
	else if(digit ==2){
	System.out.print("Two" );
}
	else if(digit ==3){
	System.out.print("Three" );
}
	else if(digit ==4){
	System.out.print("Four" );
}
	else if(digit==5){
	System.out.print("Five" );
}
	else if(digit==6){
	System.out.print("Six" );
}
	else if(digit==7){
	System.out.print("Seven" );
}
	else if(digit==8){

	System.out.print("Eight" );
}
	else if(digit==9){
	System.out.print("Nine" );
}
	else{
	System.out.print("INVALID");
}

}
}
