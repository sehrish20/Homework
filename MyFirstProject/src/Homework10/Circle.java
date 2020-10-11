package Homework10;

public interface Circle {
	
	public void circle();
	
	default void drawCircle()
	{
		System.out.println("draw circle");
	}

}
