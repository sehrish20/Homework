package Homework3;

public class CarDefaultModifier {
	
	int speed = 30;
	String color = "blue";
	
	void Display(int speed, String color)
	{
		this.speed = speed;
		this.color = color;
	}
	
	public int carspeed()
	{
		int result1 = speed;
		return result1;
	}
	
	public String carcolor()
	{
		String result2 = color;
		return result2;
	}

}
