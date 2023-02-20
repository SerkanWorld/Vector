package gbssg.Jamalia_Polat_Vrlec;

/**
 * This class is the blueprint of a two-dimensional point in a coordinate
 * system.
 *
 * @author Filip Vrlec
 * @author Serkan Polat
 * @author Moiz Jamalia
 * @version 1.0
 */
public class Point2D implements IGeometrieObject, ISerializer {

	private double x;
	private double y;

	/**
	 * The purpose of this constructor is to not have an exception if the parameters and set 0 for y and x
	 * are forgotten
	 */
	public Point2D() {
		this.x = 0;
		this.y = 0;
	}

	/**
	 * This constructor only sets the two attributes to a certain value.
	 * 
	 * @param x
	 * @param y
	 */
	public Point2D(double x, double y) {
		this.x = x;
		this.y = y;
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
	 * This method reads the string which consists of the attributes and turns them
	 * into values and adds it to this object.
	 * 
	 * @param s the string with the values formatted as '(x, y)' which is read
	 */
	@Override
	public void readFromString(String s) {
		String[] v = s.split("[(,;)]");
		this.x = Double.parseDouble(v[1]);
		this.y = Double.parseDouble(v[2]);
	}

	/**
	 * This method prints the name of the object, and their attributes formatted as
	 * following: 'Punkt (x , y)'
	 * 
	 * @return the formatted name and attributes as a string
	 */
	public String writeToString() {
		return "Punkt (" + Double.toString(this.x).concat(" , ").concat(Double.toString(this.y)) + ")";
	}

	/**
	 * This method moves the point according to the vector.
	 * @param v the parameter Vector is used to get variables for the displacement
	 */
	@Override
	public void move(Vector v) {
		Vector2D v1 = (Vector2D) v;
		this.x += v1.getX();
		this.y += v1.getY();
	}
}