package Homework5;

import java.util.Scanner;

public class assessmentFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int secretnumber = 29;
		int guess;
	    boolean result = true;
		
		Scanner keyboard = new Scanner(System.in);
		while(result)
		{
		
		System.out.println("choose a number between 1 to 50");
		guess = keyboard.nextInt();
		if(guess == secretnumber)
		{
			result = false;
			System.out.println("you won");	
		}
		else if(guess!=secretnumber)
		{
			System.out.println("guess again");
		}
		}
		
		
		
		
			

	}

}
