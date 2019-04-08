package pkgShape;

public class Rectangle extends Shape{
	
	private int iWidth;
	private int iLength;
	
	public Rectangle(int Width, int Length) {
		iWidth = Width;
		iLength = Length;
		if (iWidth<=0) {
			throw new IllegalArgumentException("Cannot have a negative");
		}
		if (iLength<=0) {
			throw new IllegalArgumentException("Cannot have a negative");
		}
		
	}
	
	public int getiWidth() {
		return iWidth;
	}



	public void setiWidth(int iWidth) {
		this.iWidth = iWidth;
	}



	public int getiLength() {
		return iLength;
	}



	public void setiLength(int iLength) {
		this.iLength = iLength;
	}


	@Override
	public double area() {
		double areavar=this.iLength*this.iWidth;
		return areavar;
		
	}
	
	@Override
	public double perimeter() {
		double perimetervar=(this.iLength*2)+(this.iWidth*2);
		return perimetervar;
	}
	public int compareTo(Rectangle o) {
		if (area() < o.area()) {
			return -1;
		} else if (area()>o.area()) {
			return 1;
		} else {
			return 0;
		}
	}
}
