package Vectors_Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import gbssg.Jamalia_Polat_Vrlec.Vector2D;

class Vector2DTest {

	@Test
	void amountTest() {
		int x = 2;
		int y = 3;
		Vector2D v1 = new Vector2D(x, y);
		double d = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		assertEquals(d, v1.amount());
	}

	@Test
	void amountTest1() {
		int x = 7;
		int y = 7;
		Vector2D v1 = new Vector2D(x, y);
		double d = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		assertEquals(d, v1.amount());
	}

	@Test
	void amountTest2() {
		int x = -7;
		int y = -4;
		Vector2D v1 = new Vector2D(x, y);
		double d = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		assertEquals(d, v1.amount());
	}

	@Test
	void amountTest3() {
		int x = -2;
		int y = -2;
		Vector2D v1 = new Vector2D(x, y);
		double d = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		assertEquals(d, v1.amount());
	}

	@Test
	void amountTest4() {
		int x = 9;
		int y = -4;
		Vector2D v1 = new Vector2D(x, y);
		double d = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		assertEquals(d, v1.amount());
	}

	@Test
	void invertTest() {
		int x = 4;
		int y = 5;
		Vector2D v1 = new Vector2D(x, y);
		Vector2D v2 = new Vector2D(x * -1, y * -1);
		v1.invert();
		assertEquals(v2.getX(), v1.getX());
		assertEquals(v2.getY(), v1.getY());
	}

	@Test
	void invertTest1() {
		int x = 5;
		int y = -21;
		Vector2D v1 = new Vector2D(x, y);
		Vector2D v2 = new Vector2D(x * -1, y * -1);
		v1.invert();
		assertEquals(v2.getX(), v1.getX());
		assertEquals(v2.getY(), v1.getY());
	}

	@Test
	void invertTest2() {
		int x = -4;
		int y = -5;
		Vector2D v1 = new Vector2D(x, y);
		Vector2D v2 = new Vector2D(x * -1, y * -1);
		v1.invert();
		assertEquals(v2.getX(), v1.getX());
		assertEquals(v2.getY(), v1.getY());
	}

	@Test
	void isInvertTest() {
		Vector2D v1 = new Vector2D(4, 5);
		Vector2D v2 = v1;
		v1.invert();
		assertTrue(v2.isInverse(v1));
	}

	@Test
	void isInvertTest1() {
		Vector2D v1 = new Vector2D(4, 5);
		Vector2D v2 = new Vector2D(3, 4);
		v1.invert();
		assertFalse(v2.isInverse(v1));
	}

	@Test
	void isUnitVectorTest() {
		int x = 2;
		int y = 3;
		Vector2D v1 = new Vector2D(x, y);
		double resultX = (x / Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)));
		double resultY = (y / Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)));
		Vector2D v2 = (Vector2D) v1.asUnitVector();
		assertEquals(resultX, v2.getX());
		assertEquals(resultY, v2.getY());
	}

	@Test
	void isUnitVectorTest1() {
		int x = -7;
		int y = -4;
		Vector2D v1 = new Vector2D(x, y);
		double resultX = (x / Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)));
		double resultY = (y / Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)));
		Vector2D v2 = (Vector2D) v1.asUnitVector();
		assertEquals(resultX, v2.getX());
		assertEquals(resultY, v2.getY());
	}

	@Test
	void isUnitVectorTest2() {
		int x = 4;
		int y = 4;
		Vector2D v1 = new Vector2D(x, y);
		double resultX = (x / Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)));
		double resultY = (y / Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)));
		Vector2D v2 = (Vector2D) v1.asUnitVector();
		assertEquals(resultX, v2.getX());
		assertEquals(resultY, v2.getY());
	}

	@Test
	void isUnitVectorTest3() {
		int x = 4;
		int y = -5;
		Vector2D v1 = new Vector2D(x, y);
		double resultX = (x / Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)));
		double resultY = (y / Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)));
		Vector2D v2 = (Vector2D) v1.asUnitVector();
		assertEquals(resultX, v2.getX());
		assertEquals(resultY, v2.getY());
	}
}