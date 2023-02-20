package gbssg.Jamalia_Polat_Vrlec;

/**
 * This interface is implemented in classes of objects which have to be
 * projected in some way or another. Classes which implement this interface are
 * Vector2d, Vector3D, Point2D, Point3, Polygon and Polyeder.
 * 
 * @author Filip Vrlec
 * @author Serkan Polat
 * @author Moiz Jamalia
 * @version 1.0
 */
public interface ISerializer {
	/**
	 * This method will be used to read information from strings, convert them to
	 * the needed data type and use them effectively.
	 * 
	 * @param s
	 */
	void readFromString(String s);

	/**
	 * This method will be used to return the values of an object as a string.
	 * 
	 * @return
	 */
	String writeToString();
}