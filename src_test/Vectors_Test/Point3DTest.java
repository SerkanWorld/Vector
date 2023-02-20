package Vectors_Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import gbssg.Jamalia_Polat_Vrlec.*;

class Point3DTest {

	@Test
	void testReadFromString1() {
		Point3D punkt1 = new Point3D();
		Point3D punkt2 = new Point3D(3, 4, 8);

		String read = "(3 , 4 , 8)";
		punkt1.readFromString(read);

		assertEquals(punkt1.getX(), punkt2.getX());
		assertEquals(punkt1.getY(), punkt2.getY());
	}

	@Test
	void testWriteToStrnig1() {
		Point3D punkt = new Point3D(2, 6, 8);
		String expected = "Punkt (2.0 , 6.0 , 8.0)";
		String actual = punkt.writeToString();

		assertEquals(expected, actual);
	}

	@Test
	void testWriteToStrnig2() {
		Point3D punkt = new Point3D(2.2134, 6.12341234, 2.2222223);
		String expected = "Punkt (2.2134 , 6.12341234 , 2.2222223)";
		String actual = punkt.writeToString();

		assertEquals(expected, actual);
	}

	@Test
	void testWriteToStrnig3() {
		Point3D punkt = new Point3D(2, 6, 2.2222223);
		String expected = "Punkt (6.0 , 2.0 , 2.2222223)";
		String actual = punkt.writeToString();

		assertNotEquals(expected, actual);
	}

	@Test
	void testWriteToStrnig4() {
		Point2D punkt = new Point2D(2.2134, 6.12341234);
		String expected = "Punkt (6.12341234 , 2.2134)";
		String actual = punkt.writeToString();

		assertNotEquals(expected, actual);
	}

	@Test
	void testMove1() {
		Point3D punkt = new Point3D(2, 6, 8);
		Vector3D vektor = new Vector3D(2, 2, 100);

		double expectedX = punkt.getX() + vektor.getX();
		double expectedY = punkt.getY() + vektor.getY();
		double expectedZ = punkt.getZ() + vektor.getZ();

		punkt.move(vektor);

		double actualX = punkt.getX();
		double actualY = punkt.getY();
		double actualZ = punkt.getZ();

		assertEquals(expectedX, actualX);
		assertEquals(expectedY, actualY);
		assertEquals(expectedZ, actualZ);
	}

	@Test
	void testMove2() {
		Point3D punkt = new Point3D(2, -6, 0);
		Vector3D vektor = new Vector3D(-2, -2, 11);

		double expectedX = punkt.getX() + vektor.getX();
		double expectedY = punkt.getY() + vektor.getY();
		double expectedZ = punkt.getZ() + vektor.getZ();

		punkt.move(vektor);

		double actualX = punkt.getX();
		double actualY = punkt.getY();
		double actualZ = punkt.getZ();

		assertEquals(expectedX, actualX);
		assertEquals(expectedY, actualY);
		assertEquals(expectedZ, actualZ);
	}
	
	@Test
	void testMove3() {
		Point3D punkt = new Point3D(-2, -6, -0);
		Vector3D vektor = new Vector3D(-2, -2, -11);

		double expectedX = punkt.getX() + vektor.getX();
		double expectedY = punkt.getY() + vektor.getY();
		double expectedZ = punkt.getZ() + vektor.getZ();

		punkt.move(vektor);

		double actualX = punkt.getX();
		double actualY = punkt.getY();
		double actualZ = punkt.getZ();

		assertEquals(expectedX, actualX);
		assertEquals(expectedY, actualY);
		assertEquals(expectedZ, actualZ);
	}
}