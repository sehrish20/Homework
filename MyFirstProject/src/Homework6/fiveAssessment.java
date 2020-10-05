package Homework6;

public class fiveAssessment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] average = new int[5];
		average[0] = 5;
		average[1] = 10;
		average[2] = 15;
		average[3] = 20;
		average[4] = 25;
		
		int sum = 0;
		for(int i=0; i<average.length; i++)
		{
			sum = sum + average[i]/5;
		}
		System.out.println("print average    "+sum);
		

	}

}
