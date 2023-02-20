package Vectors_Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import gbssg.Jamalia_Polat_Vrlec.Vector3D;

class Vector3DTest {

	@Test
	void amountTest() {
		int x = 2;
		int y = 3;
		int z = 6;
		Vector3D v1 = new Vector3D(x, y, z);
		double d = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
		System.out.println(v1.amount());
		assertEquals(d, v1.amount());
	}

	@Test
	void amountTest1() {
		int x = 6;
		int y = 6;
		int z = 6;
		Vector3D v1 = new Vector3D(x, y, z);
		double d = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
		System.out.println(v1.amount());
		assertEquals(d, v1.amount());
	}

	@Test
	void amountTest2() {
		int x = -7;
		int y = -3;
		int z = -8;
		Vector3D v1 = new Vector3D(x, y, z);
		double d = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
		System.out.println(v1.amount());
		assertEquals(d, v1.amount());
	}

	@Test
	void amountTest3() {
		int x = -6;
		int y = -6;
		int z = -6;
		Vector3D v1 = new Vector3D(x, y, z);
		double d = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
		System.out.println(v1.amount());
		assertEquals(d, v1.amount());
	}

	@Test
	void amountTest4() {
		int x = 6;
		int y = -5;
		int z = 6;
		Vector3D v1 = new Vector3D(x, y, z);
		double d = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
		System.out.println(v1.amount());
		assertEquals(d, v1.amount());
	}

	@Test
	void invertTest() {
		int x = 4;
		int y = 5;
		int z = 6;
		Vector3D v1 = new Vector3D(x, y, z);
		Vector3D v2 = new Vector3D(x * -1, y * -1, z * -1);
		v1.invert();
		assertEquals(v2.getX(), v1.getX());
		assertEquals(v2.getY(), v1.getY());
		assertEquals(v2.getZ(), v1.getZ());
	}

	@Test
	void invertTest1() {
		int x = 9;
		int y = -2;
		int z = 7;
		Vector3D v1 = new Vector3D(x, y, z);
		Vector3D v2 = new Vector3D(x * -1, y * -1, z * -1);
		v1.invert();
		assertEquals(v2.getX(), v1.getX());
		assertEquals(v2.getY(), v1.getY());
		assertEquals(v2.getZ(), v1.getZ());
	}

	@Test
	void invertTest2() {
		int x = -2;
		int y = -3;
		int z = -1;
		Vector3D v1 = new Vector3D(x, y, z);
		Vector3D v2 = new Vector3D(x * -1, y * -1, z * -1);
		v1.invert();
		assertEquals(v2.getX(), v1.getX());
		assertEquals(v2.getY(), v1.getY());
		assertEquals(v2.getZ(), v1.getZ());
	}

	@Test
	void isInvertTest() {
		Vector3D v1 = new Vector3D(4, 5, 6);
		Vector3D v2 = v1;
		v1.invert();
		assertTrue(v2.isInverse(v1));
	}

	@Test
	void isInvertTest1() {
		Vector3D v1 = new Vector3D(4, 5, 6);
		Vector3D v2 = new Vector3D(3, 4, 5);
		v1.invert();
		assertFalse(v2.isInverse(v1));
	}

	@Test
	void isUnitVectorTest() {
		int x = 2;
		int y = 3;
		int z = 6;
		Vector3D v1 = new Vector3D(x, y, z);
		double resultX = (x / Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2)));
		double resultY = (y / Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2)));
		double resultZ = (z / Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2)));
		Vector3D v2 = (Vector3D) v1.asUnitVector();
		assertEquals(resultX, v2.getX());
		assertEquals(resultY, v2.getY());
		assertEquals(resultZ, v2.getZ());
	}

	@Test
	void isUnitVectorTest1() {
		int x = -25;
		int y = -6;
		int z = -6;
		Vector3D v1 = new Vector3D(x, y, z);
		double resultX = (x / Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2)));
		double resultY = (y / Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2)));
		double resultZ = (z / Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2)));
		Vector3D v2 = (Vector3D) v1.asUnitVector();
		assertEquals(resultX, v2.getX());
		assertEquals(resultY, v2.getY());
		assertEquals(resultZ, v2.getZ());
	}

	@Test
	void isUnitVectorTest2() {
		int x = 6;
		int y = 6;
		int z = 6;
		Vector3D v1 = new Vector3D(x, y, z);
		double resultX = (x / Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2)));
		double resultY = (y / Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2)));
		double resultZ = (z / Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2)));
		Vector3D v2 = (Vector3D) v1.asUnitVector();
		assertEquals(resultX, v2.getX());
		assertEquals(resultY, v2.getY());
		assertEquals(resultZ, v2.getZ());
	}

	@Test
	void isUnitVectorTest3() {
		int x = 7;
		int y = -6;
		int z = 5;
		Vector3D v1 = new Vector3D(x, y, z);
		double resultX = (x / Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2)));
		double resultY = (y / Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2)));
		double resultZ = (z / Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2)));
		Vector3D v2 = (Vector3D) v1.asUnitVector();
		assertEquals(resultX, v2.getX());
		assertEquals(resultY, v2.getY());
		assertEquals(resultZ, v2.getZ());
	}
}