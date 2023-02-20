package gbssg.Jamalia_Polat_Vrlec;

/**
 * This interface is implemented in classes of some geometric objects such as
 * points, polygons and polyhedrons.
 * 
 * @author Filip Vrlec
 * @author Serkan Polat
 * @author Moiz Jamalia
 * @version 1.0
 */
public interface IGeometrieObject {
	/**
	 * This method will be used to move the geometric object according to the vector
	 * given.
	 * 
	 * @param v
	 */
	void move(Vector v);
}