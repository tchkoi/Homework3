package ge.ufc.rectangle;

public class Rectangle {
	
//	Task 1;
	public static final double maxHeight;
	public static final double maxWidth;
	
	private double height;
	private double width;
	
	public void setWidth (double width) {
		if(width <= maxWidth) {
			this.width = width;
		} else {
			this.width = maxWidth;
		}
	}
	
	public double getWidth() {
		return width;
	}
	
	public void setHeight (double height) {
		if(height <= maxHeight) {
			this.height = height;
		} else {
			this.height = maxHeight;
		}
	}
	
	public double getHeight() {
		return height;
	}

//	Task 2;
	static {
		maxHeight = 30;
		maxWidth = 25;
	}
	
	
//	Task 3;
	public Rectangle(double height) {
		setHeight(height);
	}
	
	public Rectangle(double height, double width) {
		setWidth(width);
		setHeight(height);
	}
	
	public Rectangle() {
		setWidth(15);
	}
	
//	Task 4;
	
	public double getArea () {
		return this.height*this.width;
	}
	
	public static Rectangle returnMaximumArea (Rectangle[] rectArray) {
		
		if (rectArray == null || rectArray.length == 0) {
			return null;
		}
		
		Rectangle tempRect = null;
		
		double area = 0;
		for (int i = 0; i < rectArray.length; i++) {
			if (rectArray[i].getArea() > area) {
				area = rectArray[i].getArea();
				tempRect = rectArray[i];
			} 
		}
		
		return tempRect;
	}
}
