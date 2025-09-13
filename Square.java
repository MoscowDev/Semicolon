

 /*PROMPT user to "Enter number"
    store number in a variable

create a variable and set it to 0
  
Using loop,
     count FROM 0 TO number - 1 DO
     store = store + number
    END FOR

    PRINT "Square is: " + store*/


import java.util.Scanner;

public class Square{
public static void main(String[]args){

Scanner scanner = new Scanner(System.in);
System.out.println("Enter number");

int number = scanner.nextInt();
int store = 0;


for(int count = 0; count < number || count > number; count ++ ){
store = number + store;

}
System.out.println( store);


}
}