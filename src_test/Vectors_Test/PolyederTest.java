package Vectors_Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import gbssg.Jamalia_Polat_Vrlec.Point3D;
import gbssg.Jamalia_Polat_Vrlec.Polyeder;

class PolyederTest {
	
	@Test
	void writeToStringTest() {
		Point3D[] point3ds = new Point3D[3];
		Polyeder polyeder = new Polyeder(9, point3ds);
		Point3D p5 = new Point3D();
		Point3D p6 = new Point3D();
		Point3D p7 = new Point3D();
		point3ds[0] = p5;
		point3ds[1] = p6;
		point3ds[2] = p7;
		String actual = polyeder.writeToString();
		String expexted = "NumberOfEdges: 9 EdgePoints: Punkt (0.0 , 0.0 , 0.0); Punkt (0.0 , 0.0 , 0.0); Punkt (0.0 , 0.0 , 0.0); ";
		assertEquals(expexted, actual);
	}
	
	@Test
	void writeToStringTest2() {
		Point3D[] point3ds = new Point3D[3];
		Polyeder polyeder = new Polyeder(3, point3ds);
		Point3D p5 = new Point3D(1,2,3);
		Point3D p6 = new Point3D(4,5,6);
		Point3D p7 = new Point3D(7,8,9);
		point3ds[0] = p5;
		point3ds[1] = p6;
		point3ds[2] = p7;
		String actual = polyeder.writeToString();
		String expexted = "NumberOfEdges: 3 EdgePoints: Punkt (1.0 , 2.0 , 3.0); Punkt (4.0 , 5.0 , 6.0); Punkt (7.0 , 8.0 , 9.0); ";
		assertEquals(expexted, actual);
	}
	
	@Test
	void writeToStringTest3() {
		Point3D[] point3ds = new Point3D[3];
		Polyeder polyeder = new Polyeder(3, point3ds);
		Point3D p5 = new Point3D(-1,-2,-3);
		Point3D p6 = new Point3D(-4,-5,-6);
		Point3D p7 = new Point3D(-7,-8,-9);
		point3ds[0] = p5;
		point3ds[1] = p6;
		point3ds[2] = p7;
		String actual = polyeder.writeToString();
		String expexted = "NumberOfEdges: 3 EdgePoints: Punkt (-1.0 , -2.0 , -3.0); Punkt (-4.0 , -5.0 , -6.0); Punkt (-7.0 , -8.0 , -9.0); ";
		assertEquals(expexted, actual);
	}
	
	@Test
	void writeToStringTest4() {
		Point3D[] point3ds = new Point3D[3];
		Polyeder polyeder = new Polyeder(3, point3ds);
		Point3D p5 = new Point3D(1,-2,3);
		Point3D p6 = new Point3D(-4,5,-6);
		Point3D p7 = new Point3D(7,-8,9);
		point3ds[0] = p5;
		point3ds[1] = p6;
		point3ds[2] = p7;
		String actual = polyeder.writeToString();
		String expexted = "NumberOfEdges: 3 EdgePoints: Punkt (1.0 , -2.0 , 3.0); Punkt (-4.0 , 5.0 , -6.0); Punkt (7.0 , -8.0 , 9.0); ";
		assertEquals(expexted, actual);
	}

	@Test
	void getNumberOfEdgesTest() {
		Point3D[] point3ds = new Point3D[3];
		Polyeder polyeder = new Polyeder(3, point3ds);
		int i = polyeder.getNumberOfEdges();
		assertEquals(3, i);
	}
	
	@Test
	void getNumberOfEdgesTest1() {
		Point3D[] point3ds = new Point3D[3];
		Polyeder polyeder = new Polyeder(7, point3ds);
		int i = polyeder.getNumberOfEdges();
		assertEquals(7, i);
	}
	
	@Test
	void getNumberOfEdgesTest2() {
		Point3D[] point3ds = new Point3D[3];
		Polyeder polyeder = new Polyeder(9, point3ds);
		int i = polyeder.getNumberOfEdges();
		assertEquals(9, i);
	}
}