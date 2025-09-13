/*Prompt a user to enter three inputs
  Store the inputs in three variables(a,b,c)
  Check if (a) is equal to (b) and (a) is equal to (c), and (b) is equal         to (c). Display "EQUILATERAL"
IF NOT

  Check if (a) is equal to (b) or (a) is equal to (c), or (b) is equal

/*
  prompt a user to "Enter score: "
    store in a variable

    Use a conditional statement to check 
    IF user entry is greater than or equal 90,
    DISPLAY "A" if true
    Check IF entry number is greater than or equal 80 or less than or equal to 89
    DISPLAY "B" if true,
    Check IF entry number is greater than or equal 70 or less than or equal to 79
    DISPLAY "C" if true,
    
    Check IF entry number is greater than or equal 60 or less than or equal to 69
    DISPLAY "D" if true,

    
    DISPLAY "F" if NOT TRUE,
*/


import java.util.Scanner;

public class NumericalScore{
public static void main(String[]args){
Scanner scanner= new Scanner(System.in);

System.out.print("Enter a numerical score: ");
int number = scanner.nextInt();


if (number >= 90){
System.out.println("A");
}
else if(number >= 80 && number <= 89 ){
System.out.println("B");
}
else if(number >= 70 && number <= 79){
System.out.println("C");
}
else if(number >= 60 && number <= 69){
System.out.println("D");
}
else{
System.out.println("F");
}




}
}