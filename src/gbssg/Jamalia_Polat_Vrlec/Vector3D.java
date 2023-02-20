package gbssg.Jamalia_Polat_Vrlec;

/**
 * This class Vector2D is a child class of the class Vector and is
 * three-dimensional.
 * 
 * @author Filip Vrlec
 * @author Serkan Polat
 * @author Moiz Jamalia
 * @version 1.0
 */
public class Vector3D extends Vector implements ISerializer {
	// Attributes
	private double x;
	private double y;
	private double z;

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

	/**
	 * @return z
	 */
	public double getZ() {
		return z;
	}

	// Constructors
	/**
	 * This constructor only sets the dimension to three.
	 */
	public Vector3D() {
		dimension = 3;
	}

	/**
	 * This constructor sets the dimension to three and sets the x, y, z values to
	 * its respective parameters.
	 * 
	 * @param x
	 * @param y
	 * @param z
	 */
	public Vector3D(double x, double y, double z) {
		dimension = 3;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	/**
	 * This constructor sets the dimension to three, gets three three dimensional
	 * points, from which the x and y attributes will be calculated.
	 * 
	 * @param p1
	 * @param p2
	 * @param p3
	 */
	public Vector3D(Point3D p1, Point3D p2) {
		dimension = 3;
		this.x = p1.getX() - p2.getX();
		this.y = p1.getY() - p2.getY();
		this.z = p1.getZ() - p2.getZ();
	}

	// Methods
	/**
	 * This method adds one vector to the current vector.
	 * 
	 * @param a
	 */
	@Override
	public void add(Vector a) {
		Vector3D v1 = (Vector3D) a;
		this.x += v1.getX();
		this.y += v1.getY();
		this.z += v1.getZ();
	}

	/**
	 * This method subtracts the current vector with the vector a
	 * 
	 * @param a
	 */
	@Override
	public void sub(Vector a) {
		Vector3D v1 = (Vector3D) a;
		this.x -= v1.getX();
		this.y -= v1.getY();
		this.z -= v1.getZ();
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
		this.z *= k;
	}

	/**
	 * This method calculates the amount of a vector as a double
	 * 
	 * @return the amount as a double
	 */
	@Override
	public double amount() {
		return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2) + Math.pow(this.z, 2));
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
		Vector3D v1 = (Vector3D) a;
		if (this.x == v1.getX() && this.y == v1.getY() && this.z == v1.getZ()) {
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
		this.z *= -1;
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
		Vector3D v1 = (Vector3D) a;
		v1.invert();
		if (this.x == v1.getX() && this.y == v1.getY() && this.z == v1.getZ()) {
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
		if (this.x == 0 && this.y == 0 && this.z == 0) {
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
		return new Vector3D(this.x / a, this.y / a, this.z / a);
	}

	/**
	 * This method receives a string through the parameter, splits them, converts
	 * them to a double and sets the values of those three doubles as x, y and z
	 * values of this vector.
	 * 
	 * @param s
	 */
	@Override
	public void readFromString(String s) {
		String[] v = s.split("[(,.)]");
		this.x = Double.parseDouble(v[1]);
		this.y = Double.parseDouble(v[2]);
		this.z = Double.parseDouble(v[3]);
	}

	/**
	 * This method creates a string with the values of x, y and z.
	 * 
	 * @return the formatted string
	 */
	@Override
	public String writeToString() {
		return "Vektor (" + Double.toString(this.x).concat(" , ").concat(Double.toString(this.y)).concat(" , ")
				.concat(Double.toString(this.z)) + ")";
	}
}