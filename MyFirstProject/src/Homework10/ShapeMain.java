package Homework10;

public class ShapeMain implements Shape, Circle, Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ShapeMain draw = new ShapeMain();
		draw.circle();
		draw.square();
		

	}

	@Override
	public void square() {
		// TODO Auto-generated method stub
		
		System.out.println("draw square");
		
	}

	@Override
	public void circle() {
		// TODO Auto-generated method stub
		
		System.out.println("draw circle");
		
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
		System.out.println("In shape class");
		
	}
	
	@Override
	public void drawing() {
		// TODO Auto-generated method stub
		Shape.super.drawing();
		Circle.super.drawCircle();
		Square.super.drawSquare();
	}

}
