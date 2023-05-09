import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scanner = new Scanner(System.in);
		
		System.out.println("Whats your name?");
		String name = Scanner.nextLine();
		System.out.println("Hello " + name);
		
		System.out.println("Age?");
		int num = Scanner.nextInt();
		Scanner.nextLine();
		System.out.println("You said: "+ num +" years old?");
		
		System.out.println("Yes or No");
		String confirmation = Scanner.nextLine();
		
		if (confirmation.equalsIgnoreCase("Yes")||confirmation.equalsIgnoreCase("Y")) {			
			if (num > 18) {
				System.out.println("You are not a Minor");
			} else {
				System.out.println("You are a Minor");
			}
		} else if (confirmation.equalsIgnoreCase("No") || confirmation.equalsIgnoreCase("N")) {
			System.out.println("You stink");
		} else {
			System.out.println("Invalid input");
		}
		
		
	}

}
