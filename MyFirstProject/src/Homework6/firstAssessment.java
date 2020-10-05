package Homework6;

import java.util.Scanner;

public class firstAssessment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int kids;
		int kid1;
		int kid2;
		String kid1name;
		String kid2name;
		
		Scanner input = new Scanner(System.in);
		System.out.println("how many kids user has?");
		kids = input.nextInt();
		System.out.println("print number of kids   "+kids);
		System.out.println("how old is kid1");
		kid1 = input.nextInt();
		kid2 = input.nextInt();
		System.out.println("Print ages of kids1   "+kid1+   "   kids 2       "+kid2);
		System.out.println("what is name of kid1");
		kid1name = input.next();
		System.out.println("what is name of kid2");
		kid2name = input.next();
		System.out.println("print kid1 name    "+kid1name);
		System.out.println("print kid2 name    "+kid2name);
		
		int [] kid = new int [2];
	    kid [0] = 2;
	    kid [1] = 5;
	    
 		
		System.out.println("print length   "+kid.length);
		int length = kid.length;
	
		System.out.println("print kid1 age    "+kid[0]);
		System.out.println("print kid2 age    "+kid[1]);
		
		String [] name = new String [2];
		name [0] = "sarah";
		name [1] = "john";
	
		System.out.println("print names    "+name.length);
		int length0 = name.length;
		System.out.println("print kid1 name    "+name [0]);
		System.out.println("print kid2 name    "+name [1]);

	}

}
