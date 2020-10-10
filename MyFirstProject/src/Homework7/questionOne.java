package Homework7;

public class questionOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		questionOne largest = new questionOne();
		int result1 = largest.intMax(1, 2, 3);
		System.out.println("print largest value   "+result1);
		int result2 = largest.intMax(1, 3, 2);
		System.out.println("print largest value   "+result2);
		int result3 = largest.intMax(3, 2, 1);
		System.out.println("print largest value   "+result3);
	
	}
		
	public int intMax(int a, int b, int c)
		{    
			if (a>b && a>c)
			{
				return a;
			}
			if (b>a && b>c)
			{
				return b;
			}
	        else
	         {
			return c;
		

	}
		}
}
