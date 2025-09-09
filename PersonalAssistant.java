import java.util.Scanner;

	public class PersonalAssistant{
	public static void main(String [] args){

	Scanner scanner = new Scanner(System.in);
	System.out.print("Name: "  );
	String name = scanner.nextLine();
	

	System.out.print("Age: ");
	int age = scanner.nextInt();
	scanner.nextLine();

	System.out.print("Mood: ");
	String mood = scanner.nextLine();

	System.out.print("Guess: ");
	int guess = scanner.nextInt();
	scanner.nextLine();
	
	
	System.out.print("Want Suggestion: ");
	String want = scanner.nextLine();

	

	
       
       // System.out.println("Age: " + age);
        //System.out.println("Mood: " + mood);
       // System.out.println("Guess: " + guess);
        //System.out.println("Want Suggestion: " + want);

	
	if(name == name ){
	System.out.print( "Hello,"+ name + " Welcome to your personal assistant.");
	}
	
	if (age < 13){
	System.out.print("You are a young explorer!" );
	} else {
	System.out.println("");
	}
	if (age>= 13 && age <= 19 ){
	System.out.print("Teen life is fun, enjoy it!" );
	} else {
	System.out.print("");
	}
	if (age >= 19 && age <= 59 ){
	System.out.print("Adulting can be challenging,stay strong!");
	} else {
	System.out.println("");
	}
	if (age >= 60 ){
	System.out.println("Wisdom looks good on you!");
	} else {
	System.out.println("");
	}



	if (mood.equalsIgnoreCase("happy")) {
    	System.out.print("Keep smiling!");
	} else {
   	 System.out.println("");
	}

	if (mood.equalsIgnoreCase("sad")) {
   	 System.out.print("Cheer up! Tomorrow is a new day.");
	} else {
   	 System.out.print("");
	}

	if (mood.equalsIgnoreCase("excited")) {
  	  System.out.print("Awesome! Enjoy your energy!");
	} else {
   	 System.out.println("");
	}

	if (mood.equalsIgnoreCase("tired")) {
   	 System.out.println("Rest well and recharge!");
	} else {
   	 System.out.println("");
	}


	
	if (guess == 1){
	System.out.print("Wow! You guessed it!");
	} else if (guess > 1) {
	System.out.println("Try again Next time!");
	}else if (guess < 1){
	System.out.println("Try again Next time!");
	}
	
	

	if (want.equalsIgnoreCase("Yes")){
	System.out.println("Go out and play a sport you like!");
	} else if(want.equalsIgnoreCase("no")) {
	System.out.println("No worries! Have a great day anyway!");
	}
	

}
}