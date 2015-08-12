package org.dimigo.inheritance;

public class Circle extends Figure{
	private int radius;
	public Circle(int radius) {
		this.radius = radius;
	}
	
	public Circle(int centerX, int centerY, int radius) {
		super(centerX, centerY);
		this.radius = radius;
	}
	
	protected double calcArea() {
		return (double)radius*radius;
	}
	
}
