package gbssg.Jamalia_Polat_Vrlec;

/**
 * This class Vector2D is a child class of the class Vector and is
 * two-dimensional.
 * 
 * @author Filip Vrlec
 * @author Serkan Polat
 * @author Moiz Jamalia
 * @version 1.0
 */
public class Vector2D extends Vector implements ISerializer {
	// Attributes
	private double x;
	private double y;

	// Getters and setters
	/**
	 * @return x
	 */
	public double getX() {
		return x;
	}

	/**
	 * @return y
	 */
	public double getY() {
		return y;
	}

	// Constructors
	/**
	 * This constructor only sets the dimension to two.
	 */
	public Vector2D() {
		dimension = 2;
	}

	/**
	 * This constructor sets the dimension to two and sets the attributes x and y to
	 * its respective parameters.
	 * 
	 * @param x
	 * @param y
	 */
	public Vector2D(double x, double y) {
		dimension = 2;
		this.x = x;
		this.y = y;
	}

	/**
	 * This constructor sets the dimension to two, gets two two dimensional points,
	 * from which the x and y attributes will be calculated.
	 * 
	 * @param p1
	 * @param p2
	 */
	public Vector2D(Point2D p1, Point2D p2) {
		dimension = 2;
		x = p1.getX() - p2.getX();
		y = p1.getY() - p2.getY();
	}

	/**
	 * This method adds one vector to the current vector.
	 * 
	 * @param a
	 */
	@Override
	public void add(Vector a) {
		Vector2D v1 = (Vector2D) a;
		this.x += v1.getX();
		this.y += v1.getY();
	}

	/**
	 * This method subtracts the current vector with the vector a
	 * 
	 * @param a
	 */
	@Override
	public void sub(Vector a) {
		Vector2D v1 = (Vector2D) a;
		this.x -= v1.getX();
		this.y -= v1.getY();
	}

	/**
	 * This method multiplies the current vector with the double k
	 * 
	 * @param k
	 */
	@Override
	public void mult(double k) {
		this.x *= k;
		this.y *= k;
	}

	/**
	 * This method calculates the amount of a vector as a double
	 * 
	 * @return the amount as a double
	 */
	@Override
	public double amount() {
		return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
	}

	/**
	 * This method checks if the current vector is equal to the vector a and returns
	 * the answer as a boolean.
	 * 
	 * @param a
	 * @return false or true
	 */
	@Override
	public boolean isEqual(Vector a) {
		Vector2D v1 = (Vector2D) a;
		if (this.x == v1.getX() && this.y == v1.getY()) {
			return true;
		}
		return false;
	}

	/**
	 * This method inverts the current vector.
	 */
	@Override
	public void invert() {
		this.x *= -1;
		this.y *= -1;
	}

	/**
	 * This method is used to check if the current vector is just an inverse vector
	 * of the vector a.
	 * 
	 * @param a
	 * @return true or false
	 */
	@Override
	public boolean isInverse(Vector a) {
		Vector2D v1 = (Vector2D) a;
		v1.invert();
		if (this.x == v1.getX() && this.y == v1.getY()) {
			return true;
		}
		return false;
	}

	/**
	 * This method checks if the current vector is a null vector
	 * 
	 * @return true or false
	 */
	@Override
	public boolean isNullVector() {
		if (this.x == 0 && this.y == 0) {
			return true;
		}
		return false;
	}

	/**
	 * This method converts the current vector to a unit vector
	 * 
	 * @return new vector
	 */
	@Override
	public Vector asUnitVector() {
		double a = amount();
		return new Vector2D((this.x / a), (this.y / a));
	}

	/**
	 * This method receives a string through the parameter, splits them, converts
	 * them to a double and sets the values of those two doubles as x and y values
	 * of this vector.
	 * 
	 * @param s
	 */
	@Override
	public void readFromString(String s) {
		String[] v = s.split("[(,.)]");
		this.x = Double.parseDouble(v[1]);
		this.y = Double.parseDouble(v[2]);
	}

	/**
	 * This method creates a string with the values of x and y.
	 * 
	 * @return the formatted string
	 */
	@Override
	public String writeToString() {
		return "Vektor (" + Double.toString(this.x).concat(" , ").concat(Double.toString(this.y)) + ")";
	}
}