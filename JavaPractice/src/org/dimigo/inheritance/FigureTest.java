package org.dimigo.inheritance;

public class FigureTest {

	public static void main(String[] args) {
		Circle c = new Circle(5);
		Triangle t = new Triangle(10,10,5,8);
		Rectangle r = new Rectangle(20,20,5,8);
		
		System.out.println("원의 넓이 : "+c.calcArea());
		System.out.println("삼각형의 넓이 : "+t.calcArea());
		System.out.println("사각형의 넓이 : "+r.calcArea()+"\n");
		
		c.printCenter();
		t.printCenter();
		r.printCenter();
		
		System.out.println("\n---중심좌표 이동 (x축, y축 5씩)");
		c.moveFigure(5, 5);
		t.moveFigure(5, 5);
		r.moveFigure(5, 5);
		System.out.println();
		c.printCenter();
		t.printCenter();
		r.printCenter();
		
	}

}
