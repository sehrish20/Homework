package Homework6;

import java.util.Arrays;

public class secondAssessment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String [] names1 = new String [3];
		names1 [0] = "mike";
		names1 [1] = "judith";
		names1 [2] = "james";
		
		System.out.println("print length    "+names1.length);
		int length = names1.length;
		
		Arrays.sort(names1);

		for (String N : names1)
		{
			System.out.println("print names:    "+N);
		}
		
		String [] colors = new String [10];
		colors [0] = "red";
		colors [1] = "orange";
		colors [2] = "pink";
		colors [3] = "green";
		colors [4] = "white";
		colors [5] = "gold";
		colors [6] = "yellow";
		colors [7] = "silver";
		colors [8] = "black";
		colors [9] = "blue";
		
		Arrays.sort(colors);
		
		for (String C : colors)
		{
			System.out.println("print colors :    "+C);		
		}
	}

}
