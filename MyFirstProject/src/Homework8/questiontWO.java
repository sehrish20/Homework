package Homework8;

import java.util.HashMap;
import java.util.Scanner;

public class questiontWO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, String> library = new HashMap<String, String>();
		library.put("Hamlet", "William Shakespeare");
		library.put("In search of lost time", "Marcel Proust");
		library.put("The great gatsby", "Scott Fizgerald");
		library.put("War and peace", "Leo Tolstoy");
		library.put("Middlemarch", "George Eliot");
		library.put("To the lighthouse", "Virginia Woolf");
		library.put("Pale fire", "Vladimir Nabokov");
		library.put("Emma", "Jane Austen");

		
		for(String i: library.keySet())
		{
				System.out.println("author    " +library.get(i));
			}
		
			
		}

	}


