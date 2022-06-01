package ge.ufc.main;

import ge.ufc.rectangle.Rectangle;

public class Main {
	
	public static void main(String[] args) {
		 		
//		Task 3 main;
		Rectangle rectangle1  = new Rectangle();
		System.out.println(rectangle1.getArea());
		Rectangle rectangle2 = new Rectangle(20);
		System.out.println(rectangle2.getArea());
		Rectangle rectangle3 = new Rectangle(15,30);
		System.out.println(rectangle3.getArea());
			
//		Task 4 main;
		Rectangle[] rectArray = {rectangle1, rectangle2, rectangle3};
		System.out.println(Rectangle.returnMaximumArea(rectArray).getArea());
	}
	
}
