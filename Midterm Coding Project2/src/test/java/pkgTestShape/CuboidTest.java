package pkgTestShape;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgShape.Cuboid;

public class CuboidTest{
	
	private Cuboid testcube;
	private Cuboid testbigcube;
	private Cuboid testsmallcube;

	@Test
	public void testArea() {
		testcube = new Cuboid(10,20,30);
		double expectedarea = 2200;
		assertEquals(expectedarea, testcube.area(),0);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void testPerimeter() {
		testcube = new Cuboid(10,20,30);
		testcube.perimeter();
	}

	@Test
	public void testCuboid() {
		testcube = new Cuboid(1,2,3);
	}

	@Test
	public void testGetiDepth() {
		testcube = new Cuboid(1,2,3);
		assertEquals(3,testcube.getiDepth());
	}

	@Test
	public void testSetiDepth() {
		testcube = new Cuboid(1,2,3);
		testcube.setiDepth(5);
		assertEquals(5,testcube.getiDepth());
	}

	@Test
	public void testVolume() {
		testcube=new Cuboid(10,20,30);
		assertEquals(6000,testcube.volume(),0);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testCubeExceptions(){
		testcube = new Cuboid(-10,0,10);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testCubeExceptions2(){
		testcube = new Cuboid(9,-10,10);
	}
		
	@Test(expected = IllegalArgumentException.class)
	public void testCubeExceptions3(){
		testcube = new Cuboid(9,10,-10);
	}
	
	
}
/*Didn't finish tests for sortbyarea or volume, don't know how to pass exception tests*/