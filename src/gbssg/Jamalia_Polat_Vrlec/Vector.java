package gbssg.Jamalia_Polat_Vrlec;

/**
 * This class is a blueprint of a vector.
 * 
 * @author Filip Vrlec
 * @author Serkan Polat
 * @author Moiz Jamalia
 * @version 1.0
 */
public abstract class Vector {

	// Attributes
	protected int dimension; // This attribute's visibility was changed from private to protected because
								// otherwise we couldn't access this attribute in the child classes.
	private static int error;

	// Getters and setter
	public int getError() {
		return error;
	}

	// Methods
	/**
	 * This static method is used to add two different vectors and to return the
	 * vector. This method relies on the abstract method add.
	 * 
	 * @param a the vector which uses the add method from the respective class
	 * @param b is added to the vector a
	 * @return the result as vector a
	 */
	public static Vector add(Vector a, Vector b) {
		a.add(b);
		return a;
	}

	/**
	 * This abstract method is a method which has to be implemented in the child
	 * classes. This method will add a vector to the current vector.
	 * 
	 * @param a is added to the current object
	 */
	public abstract void add(Vector a);

	/**
	 * This static method is used to subtract two different vectors and to return
	 * the vector. This method relies on the abstract method sub.
	 * 
	 * @param a the vector which uses the sub method from the respective class
	 * @param b the vector which is used to subtract
	 * @return the result as vector a
	 */
	public static Vector sub(Vector a, Vector b) {
		a.sub(b);
		return a;
	}

	/**
	 * This abstract method is a method which has to be implemented in the child
	 * classes. This method will subtract a vector from the current vector.
	 * 
	 * @param a is a vector which is used to subtract from the current object
	 */
	public abstract void sub(Vector a);

	/**
	 * This static method is used to multiply a vector with a double. This method
	 * relies on the abstract method 'mult'.
	 * 
	 * @param a the vector which is being multiplied
	 * @param k the double which is used for multiplying
	 * @return the vector a as a result
	 */
	public static Vector mult(Vector a, double k) {
		a.mult(k);
		return a;
	}

	/**
	 * This abstract method is a method which has to be implemented in the child
	 * classes. This method will multiply the current vector with a double.
	 * 
	 * @param k is a double which is used to multiply the current object vector
	 */
	public abstract void mult(double k);

	/**
	 * This static method is used to calculate the amount of the vector. It is
	 * calculated by the usage of the Pythagorean theorem.
	 * 
	 * @param a is the vector of which amount will be calculated
	 * @return the result as a double
	 */
	public static double amount(Vector a) {
		double d = a.amount();
		return d;
	}

	/**
	 * This abstract method is a method which has to be implemented in the child
	 * classes. This method will be used to calculate the amount of a vector.
	 * 
	 * @return the amount as a double
	 */
	public abstract double amount();

	/**
	 * This is a method which compares one vector to another. This method relies on
	 * the abstract method amount.
	 * 
	 * @param a is vector to which the other vector will be compared to
	 * @param b is the other vector
	 * @return a boolean which says if the two vectors are equal
	 */
	public static boolean isEqual(Vector a, Vector b) {
		if (a.equals(b)) {
			return true;
		}
		return false;
	}

	/**
	 * This abstract method is a method which has to be implemented in the child
	 * classes.
	 * 
	 * @param a is a vector to which the current object will be compared to
	 * @return a boolean which says if the two vectors are equal
	 */
	public abstract boolean isEqual(Vector a);

	/**
	 * This abstract method is a method which has to be implemented in the child
	 * classes. It will be used to invert the vector.
	 */
	public abstract void invert();

	/**
	 * This abstract method is a method which has to be implemented in the child
	 * classes. It will be used to check if the vector a is inverted.
	 * 
	 * @param a is the vector
	 * @return a boolean
	 */
	public abstract boolean isInverse(Vector a);

	/**
	 * This abstract method is a method which has to be implemented in the child
	 * classes. It will be used to check if the vector is a null vector.
	 * 
	 * @return a boolean
	 */
	public abstract boolean isNullVector();

	/**
	 * This method is a method which checks if the amount of the calculated Unit
	 * vector is equal 1.
	 * 
	 * @return a boolean
	 */
	public boolean isUnitVector() {
		if (asUnitVector().amount() == 1) {
			return true;
		}
		return false;
	}

	/**
	 * This abstract method is a method which has to be implemented in the child
	 * classes. It will be used to convert the vector to a unit vector.
	 * 
	 * @return vector
	 */
	public abstract Vector asUnitVector();

}