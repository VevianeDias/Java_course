package entities;

public class Rectangle {

	public double width = 0;
	public double height = 0;
	
	
	public double area() {
		return  width*height;
	}
	
	public double perimeter() {
		return  2*(width+height);
	}
	
	public double diagonal() {
		return Math.sqrt(width*width + height*height);
	}
	
}

