package Homework10;

public abstract class ShapeTwo {
	
	public String getCircle() {
		return circle;
	}

	public void setCircle(String circle) {
		this.circle = circle;
	}

	public String getSquare() {
		return square;
	}

	public void setSquare(String square) {
		this.square = square;
	}

	private String circle;
	private String square;
	
	public abstract String draw();

}
