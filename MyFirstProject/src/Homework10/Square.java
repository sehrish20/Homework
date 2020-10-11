package Homework10;

public interface Square {
	
	public void square();
	
	default void drawSquare()
	{
		System.out.println("draw square");
	}

}
