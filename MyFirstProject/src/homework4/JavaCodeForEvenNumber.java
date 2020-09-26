package homework4;

import java.util.Scanner;

public class JavaCodeForEvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 0;
		
		Scanner result = new Scanner(System.in);
		System.out.println("get number from user");
		num = result.nextInt();
		
		if (num%2==0)
		{
			System.out.println("print number is even");
		}
		else
		{
			System.out.println("print number is not even");
		}

	}

}
