package Homework6;

import java.util.Scanner;

public class fourthAssessment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("get values");
		int value1 = input.nextInt();
		System.out.println("print value from user    "+value1);
		System.out.println("get values");
		int value2 = input.nextInt();
		System.out.println("print value from user    "+value2);
		System.out.println("get values");
		int value3 = input.nextInt();
		System.out.println("print value from user    "+value3);
		System.out.println("get values");
		int value4 = input.nextInt();
		System.out.println("print value from user    "+value4);
		System.out.println("get values");
		int value5 = input.nextInt();
		System.out.println("print value from user    "+value5);
		System.out.println("get values");
		int value6 = input.nextInt();
		System.out.println("print value from user    "+value6);
		System.out.println("get values");
		int value7 = input.nextInt();
		System.out.println("print value from user    "+value7);
		System.out.println("get values");
		int value8 = input.nextInt();
		System.out.println("print value from user    "+value8);
		System.out.println("get values");
		int value9 = input.nextInt();
		System.out.println("print value from user    "+value9);
		System.out.println("get values");
		int value10 = input.nextInt();
		System.out.println("print value from user    "+value10);
		
		int [] value0 = new int [10];
		value0 [0] = value1;
		value0 [1] = value2;
		value0 [2] = value3;
		value0 [3] = value4;
		value0 [4] = value5;
		value0 [5] = value6;
		value0 [6] = value7;
		value0 [7] = value8;
		value0 [8] = value9;
		value0 [9] = value10;
		
		System.out.println("print length   "+value0.length);
		int length = value0.length;
		
		value0[1] = 8;
		System.out.println("new value   "+value0[1]);
		
		
		
		for (int i=0; i<value0.length; i++)
		{
			System.out.println(value0 [i]);
			
			

	}
	}
}
