package Vectors_Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import gbssg.Jamalia_Polat_Vrlec.*;

class Point2DTest {

	/**
	 * This is the first method to test the readFromString method.
	 */
	@Test
	void testReadFromString1() {
		Point2D punkt1 = new Point2D();
		Point2D punkt2 = new Point2D(3, 4);

		String read = "(3 , 4)";
		punkt1.readFromString(read);

		assertEquals(punkt1.getX(), punkt2.getX());
		assertEquals(punkt1.getY(), punkt2.getY());
	}

	@Test
	void testWriteToStrnig1() {
		Point2D punkt = new Point2D(2, 6);
		String expected = "Punkt (2.0 , 6.0)";
		String actual = punkt.writeToString();

		assertEquals(expected, actual);
	}

	@Test
	void testWriteToStrnig2() {
		Point2D punkt = new Point2D(2.2134, 6.12341234);
		String expected = "Punkt (2.2134 , 6.12341234)";
		String actual = punkt.writeToString();

		assertEquals(expected, actual);
	}

	@Test
	void testWriteToStrnig3() {
		Point2D punkt = new Point2D(2, 6);
		String expected = "Punkt (6.0 , 2.0)";
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
		Point2D punkt = new Point2D(2, 6);
		Vector2D vektor = new Vector2D(2, 2);

		double expectedX = punkt.getX() + vektor.getX();
		double expectedY = punkt.getY() + vektor.getY();

		punkt.move(vektor);

		double actualX = punkt.getX();
		double actualY = punkt.getY();

		assertEquals(expectedX, actualX);
		assertEquals(expectedY, actualY);
	}

	@Test
	void testMove2() {
		Point2D punkt = new Point2D(2, -6);
		Vector2D vektor = new Vector2D(-2, -2);

		double expectedX = punkt.getX() + vektor.getX();
		double expectedY = punkt.getY() + vektor.getY();

		punkt.move(vektor);

		double actualX = punkt.getX();
		double actualY = punkt.getY();

		assertEquals(expectedX, actualX);
		assertEquals(expectedY, actualY);
	}

	@Test
	void testMove3() {
		Point2D punkt = new Point2D(-9, -2);
		Vector2D vektor = new Vector2D(-2, -4);

		double expectedX = punkt.getX() + vektor.getX();
		double expectedY = punkt.getY() + vektor.getY();

		punkt.move(vektor);

		double actualX = punkt.getX();
		double actualY = punkt.getY();

		assertEquals(expectedX, actualX);
		assertEquals(expectedY, actualY);
	}
}