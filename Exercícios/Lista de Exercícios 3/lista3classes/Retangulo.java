package lista3classes;

public class Retangulo {
	private int length, width = 1;
	
	public int perimeter() {
		return 2*(length + width);
	}
	
	public int area() {
		return length*width;
	}
	
	public void setLength(int length) {
		if (length > 0 && length < 20) {
			this.length = length;			
		}
	}
	public void setWidth(int width) {
		if (width > 0 && width < 20) {
			this.width = width;			
		}
	}
	
	public int getLength() {
		return length;
	}
	public int getWidth() {
		return width;
	}
}
