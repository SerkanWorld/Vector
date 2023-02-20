package gbssg.Jamalia_Polat_Vrlec;

/**
 * This class is a blueprint of a polyhedron. A polyhedron is a
 * three-dimensional body which surfaces are made of polygons.
 * 
 * @author Filip Vrlec
 * @author Serkan Polat
 * @author Moiz Jamalia
 * @version 1.0
 */
public class Polyeder implements IGeometrieObject, ISerializer {

	private int numberOfEdges;
	private Point3D[] edgePoints;

	/**
	 * @param numberOfEdges
	 * @param edgePoints
	 */
	public Polyeder(int numberOfEdges, Point3D[] edgePoints) {
		this.numberOfEdges = numberOfEdges;
		this.edgePoints = edgePoints;
	}

	/**
	 * @return the number of edges
	 */
	public int getNumberOfEdges() {
		return numberOfEdges;
	}

	/**
	 * @return the number of edge points
	 */
	public Point3D[] getEdgePoints() {
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
		Point3D p1 = new Point3D();
		Point3D p2 = new Point3D();
		Point3D p3 = new Point3D();
		String h = s.replace("NumberOfEdges", "").replace("EdgePoints", "").replace(" ", "");
		String[] temp = h.split("[:;]");

		this.numberOfEdges = Integer.parseInt(temp[1]);

		p1.readFromString(temp[2]);
		p2.readFromString(temp[3]);
		p3.readFromString(temp[4]);
		this.edgePoints[0] = p1;
		this.edgePoints[1] = p2;
		this.edgePoints[2] = p3;
	}

	/**
	 * This method prints the name of the object, and their attributes
	 * 
	 * @return the formatted name and attributes as a string
	 */
	@Override
	public String writeToString() {
		String s = "NumberOfEdges: " + Integer.toString(this.numberOfEdges).concat(" EdgePoints: ");
		for (Point3D p : edgePoints) {
			s += p.writeToString() + "; ";
		}
		return s;
	}

	/**
	 * This method moves the polyhedron according to the vector.
	 * 
	 * @param v
	 */
	@Override
	public void move(Vector v) {
		Vector3D v1 = (Vector3D) v;
		for (Point3D p : edgePoints) {
			p.move(v1);
		}
	}
}