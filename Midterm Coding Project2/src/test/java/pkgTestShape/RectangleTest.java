package pkgTestShape;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgShape.Rectangle;

public class RectangleTest {
	
	private Rectangle testrec;
	private Rectangle testrecsmall;
	private Rectangle testrecmed;
	private Rectangle testrecbig;
	private Rectangle testrecalsobig;

	
	@Test
	public void testRectangle() {
		testrec = new Rectangle(10,10);
	}
	
	@Test(expected =IllegalArgumentException.class)
	public void testRectangleExceptions(){
		testrec = new Rectangle(-10,0);
	}
	
	@Test(expected =IllegalArgumentException.class)
	public void testRectangleExceptions2(){
		testrec = new Rectangle(9,-10);
	}

	@Test
	public void testArea() {
		testrec = new Rectangle(5,10);
		double expectedarea = 50;
		assertEquals(expectedarea, testrec.area(), 0);
	}

	@Test
	public void testPerimeter() {
		testrec = new Rectangle(10,10);
		double exp = 40;
		assertEquals(exp, testrec.perimeter(), 0);
	}

	@Test
	public void testGetiWidth() {
		testrec = new Rectangle(5,10);
		assertEquals(5, testrec.getiWidth());

	}

	@Test
	public void testSetiWidth() {
		testrec = new Rectangle(5,10);
		testrec.setiWidth(50);
		assertEquals(50,testrec.getiWidth());
	}

	@Test
	public void testGetiLength() {
		testrec = new Rectangle(10,100);
		assertEquals(100,testrec.getiLength());
	}

	@Test
	public void testSetiLength() {
		testrec = new Rectangle(5,10);
		testrec.setiLength(50);
		assertEquals(50,testrec.getiLength());
	}

	@Test
	public void testCompareTo() {
		testrecsmall = new Rectangle(2,2);
		testrecmed = new Rectangle(5,5);
		testrecbig = new Rectangle(2,25);
		testrecalsobig = new Rectangle(5,10);
		
		assertEquals(0,testrecbig.compareTo(testrecalsobig));
		assertEquals(-1,testrecsmall.compareTo(testrecmed));
		assertEquals(1,testrecmed.compareTo(testrecsmall));
	}

}
