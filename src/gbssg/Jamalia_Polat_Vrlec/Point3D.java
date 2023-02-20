package gbssg.Jamalia_Polat_Vrlec;

/**
 * This class is the blueprint of a three-dimensional point in a coordinate
 * system.
 *
 * @author Filip Vrlec
 * @author Serkan Polat
 * @author Moiz Jamalia
 * @version 1.0
 */
public class Point3D implements IGeometrieObject, ISerializer {

	private double x;
	private double y;
	private double z;

	/**
	 * The purpose of this constructor is to not have an exception if the parameters
	 * are forgotten and set 0 for y, z and x
	 */
	public Point3D() {
		this.x = 0;
		this.y = 0;
		this.z = 0;
	}

	/**
	 * This constructor only sets the three attributes to a certain value.
	 * 
	 * @param x
	 * @param y
	 * @param z
	 */
	public Point3D(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	/**
	 * @return x value as double
	 */
	public double getX() {
		return x;
	}

	/**
	 * @return y value as double
	 */
	public double getY() {
		return y;
	}

	/**
	 * @return z value as double
	 */
	public double getZ() {
		return z;
	}

	/**
	 * This method reads the string which consists of the attributes and turns them
	 * into values and adds it to this object.
	 * 
	 * @param s the string with the values formatted as '(x, y, z)' which is read
	 */
	@Override
	public void readFromString(String s) {
		String[] v = s.split("[(,;)]");
		this.x = Double.parseDouble(v[1]);
		this.y = Double.parseDouble(v[2]);
		this.z = Double.parseDouble(v[3]);
	}

	/**
	 * This method prints the name of the object, and their attributes formatted as
	 * following: 'Vektor (x, y, z)'
	 * 
	 * @return the formatted name and attributes as a string
	 */
	@Override
	public String writeToString() {
		return "Punkt (" + Double.toString(this.x).concat(" , ").concat(Double.toString(this.y)).concat(" , ")
				.concat(Double.toString(this.z)) + ")";
	}

	/**
	 * This method moves the point according to the vector.
	 * 
	 * @param v the parameter Vector is used to get variables for the displacement
	 */
	@Override
	public void move(Vector v) {
		Vector3D v1 = (Vector3D) v;
		this.x += v1.getX();
		this.y += v1.getY();
		this.z += v1.getZ();
	}
}