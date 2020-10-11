package Homework10;

public interface Shape {
	
	public void draw();
	
	default void drawing()
	{
		System.out.println("In shape class");
	}

}
