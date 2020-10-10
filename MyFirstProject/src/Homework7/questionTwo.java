package Homework7;

public class questionTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		questionTwo trouble = new questionTwo();
		boolean result1 = trouble.monkeySmile(true, true);
		System.out.println("print result   "+result1);
		boolean result2 = trouble.monkeySmile(false, false);
		System.out.println("print result    "+result2);
		boolean result3 = trouble.monkeySmile(true, false);
		System.out.println("print result    "+result3);
		
		
	}
	
	public boolean monkeySmile(boolean aSmile, boolean bSmile)
	{
		if(aSmile == bSmile)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

