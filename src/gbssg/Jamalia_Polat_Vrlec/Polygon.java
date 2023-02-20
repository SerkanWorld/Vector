package gbssg.Jamalia_Polat_Vrlec;

/**
 * This class is a blueprint of a polygon. A polygon is a two-dimensional body
 * which has at least three edges and points.
 * 
 * @author Filip Vrlec
 * @author Serkan Polat
 * @author Moiz Jamalia
 * @version 1.0
 */
public class Polygon implements IGeometrieObject, ISerializer {

	private int numberOfEdges;
	private Point2D[] edgePoints;

	/**
	 * This constructor only sets the two attributes to a certain value.
	 * 
	 * @param numberOfEdges
	 * @param edgePoints
	 */
	public Polygon(int numberOfEdges, Point2D[] edgePoints) {
		this.numberOfEdges = numberOfEdges;
		this.edgePoints = edgePoints;
	}

	/**
	 * @return the number of edges as an int
	 */
	public int getNumberOfEdges() {
		return numberOfEdges;
	}

	/**
	 * @return the edge points as an int array
	 */
	public Point2D[] getEdgePoints() {
		return edgePoints;
	}

	/**
	 * This method reads the string which consists of the attributes and turns them
	 * into values and adds it to this object.
	 * 
	 * @param s
	 */
	@Override
	public void readFromString(String s) {
		Point2D p1 = new Point2D();
		Point2D p2 = new Point2D();
		String h = s.replace("NumberOfEdges", "").replace("EdgePoints", "").replace(" ", "");
		String[] temp = h.split("[:;]");

		this.numberOfEdges = Integer.parseInt(temp[1]);

		p1.readFromString(temp[2]);
		p2.readFromString(temp[3]);
		this.edgePoints[0] = p1;
		this.edgePoints[1] = p2;
	}

	/**
	 * This method prints the name of the object, and their attributes
	 * 
	 * @return the formatted name and attributes as a string
	 */
	@Override
	public String writeToString() {
		String s = "NumberOfEdges: " + Integer.toString(this.numberOfEdges).concat(" EdgePoints: ");
		for (Point2D p : edgePoints) {
			s += p.writeToString() + "; ";
		}
		return s;
	}

	/**
	 * This method moves the polygon according to the vector
	 * 
	 * @param v
	 */
	@Override
	public void move(Vector v) {
		Vector2D v1 = (Vector2D) v;
		for (Point2D p : edgePoints) {
			p.move(v1);
		}
	}
}