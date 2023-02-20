package Vectors_Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import gbssg.Jamalia_Polat_Vrlec.Point2D;
import gbssg.Jamalia_Polat_Vrlec.Polygon;

class PolygonTest {

	@Test
	void getNumberOfEdgesTest() {
		Point2D[] point2ds = new Point2D[2];
		Polygon polygon = new Polygon(3, point2ds);
		int i = polygon.getNumberOfEdges();
		assertEquals(3, i);
	}

	@Test
	void getNumberOfEdgesTest1() {
		Point2D[] point2ds = new Point2D[2];
		Polygon polygon = new Polygon(6, point2ds);
		int i = polygon.getNumberOfEdges();
		assertEquals(6, i);
	}

	@Test
	void getNumberOfEdgesTest2() {
		Point2D[] point2ds = new Point2D[2];
		Polygon polygon = new Polygon(1, point2ds);
		int i = polygon.getNumberOfEdges();
		assertEquals(1, i);
	}

	@Test
	void writeToStringTest() {
		Point2D[] point2ds = new Point2D[2];
		Polygon polygon = new Polygon(2, point2ds);
		Point2D p5 = new Point2D();
		Point2D p6 = new Point2D();
		point2ds[0] = p5;
		point2ds[1] = p6;
		String actual = polygon.writeToString();
		String expexted = "NumberOfEdges: 2 EdgePoints: Punkt (0.0 , 0.0); Punkt (0.0 , 0.0); ";
		assertEquals(expexted, actual);
	}

	@Test
	void writeToStringTest2() {
		Point2D[] point2ds = new Point2D[2];
		Polygon polygon = new Polygon(2, point2ds);
		Point2D p5 = new Point2D(2, 3);
		Point2D p6 = new Point2D(4, 5);
		point2ds[0] = p5;
		point2ds[1] = p6;
		String actual = polygon.writeToString();
		String expexted = "NumberOfEdges: 2 EdgePoints: Punkt (2.0 , 3.0); Punkt (4.0 , 5.0); ";
		assertEquals(expexted, actual);
	}

	@Test
	void writeToStringTest3() {
		Point2D[] point2ds = new Point2D[2];
		Polygon polygon = new Polygon(2, point2ds);
		Point2D p5 = new Point2D(-7, 3);
		Point2D p6 = new Point2D(8, -1);
		point2ds[0] = p5;
		point2ds[1] = p6;
		String actual = polygon.writeToString();
		String expexted = "NumberOfEdges: 2 EdgePoints: Punkt (-7.0 , 3.0); Punkt (8.0 , -1.0); ";
		assertEquals(expexted, actual);
	}
	
	@Test
	void writeToStringTest4() {
		Point2D[] point2ds = new Point2D[2];
		Polygon polygon = new Polygon(2, point2ds);
		Point2D p5 = new Point2D(-7, -3);
		Point2D p6 = new Point2D(-8, -1);
		point2ds[0] = p5;
		point2ds[1] = p6;
		String actual = polygon.writeToString();
		String expexted = "NumberOfEdges: 2 EdgePoints: Punkt (-7.0 , -3.0); Punkt (-8.0 , -1.0); ";
		assertEquals(expexted, actual);
	}
}