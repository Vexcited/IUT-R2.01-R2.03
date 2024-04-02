package helloworld;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter your first name:");
		String firstName = keyboard.nextLine();
		
		int groupNumber;
		do {
			System.out.println("Enter your group number (1-3):");
            groupNumber = keyboard.nextInt();
        } while (groupNumber < 1 || groupNumber > 3);
		
		
		System.out.println("Hello, " + firstName + " from G" + groupNumber + "!");
		keyboard.close();
	}
}
