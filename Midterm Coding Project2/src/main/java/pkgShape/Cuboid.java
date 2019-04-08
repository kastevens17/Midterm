package pkgShape;

import java.util.Comparator;

public class Cuboid extends Rectangle{
	
	private int iDepth;

	public Cuboid(int Width, int Length, int Depth) {
		super(Width, Length);
		//Width=getiWidth(); Do I need this? Come back later. Probably not.
		//Length=getiLength();
		if (Width<=0) throw new IllegalArgumentException("Cannot have a negative");
		if (Length<=0) throw new IllegalArgumentException("Cannot have a negative");
		if (Depth<=0) throw new IllegalArgumentException("Cannot have a negative");
		this.iDepth = Depth;
	}

	public int getiDepth() {
		return iDepth;
	}

	public void setiDepth(int iDepth) {
		this.iDepth = iDepth;
	}
	
	@Override
	public double area() {
		double areavar=(2*getiLength()*this.iDepth)+(2*getiLength()*getiWidth())+(2*getiWidth()*this.iDepth);
		return areavar;
	
	}
	@Override
	public double perimeter() {
		throw new UnsupportedOperationException("Perimeter is not valid here.");
	}
	
	public double volume() {
		double volumevar=iDepth*getiWidth()*getiLength();
		return volumevar;
	}
	//Inner Classes
	public class SortByArea implements Comparator<Cuboid>{
		public int compare(Cuboid a, Cuboid b) {
			return Double.compare(a.area(),b.area());
		}
	}
	
	public class SortByVolume implements Comparator<Cuboid>{
		public int compare(Cuboid a, Cuboid b) {
			return Double.compare(a.volume(),b.volume());
		}
		
	}
}
