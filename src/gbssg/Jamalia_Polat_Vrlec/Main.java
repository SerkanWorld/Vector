package gbssg.Jamalia_Polat_Vrlec;

public class Main {

	public static void main(String[] args) {
		Vector2D v1 = new Vector2D(9, 9);
		Vector3D v2 = new Vector3D(5, 5, 5);
		Vector2D v3 = new Vector2D(5, 3);
		Vector2D v4 = new Vector2D();
		Vector3D v5 = new Vector3D();
		Vector2D v6 = new Vector2D();
		String s = "(1,2,3)";
		String p = "(1,2)";
		Point2D p1 = new Point2D(4, 3);
		Point2D p2 = new Point2D(5, 6);
		Point2D p3 = new Point2D();
		Point2D p4 = new Point2D();
		Point2D[] point2ds = new Point2D[2];
		Point2D[] point2ds1 = new Point2D[2];
		Point3D[] point3ds = new Point3D[3];

		point2ds[0] = p1;
		point2ds[1] = p2;

		point2ds1[0] = p3;
		point2ds1[1] = p4;

		Polygon pol1 = new Polygon(2, point2ds);

		String a = pol1.writeToString();

		Polygon pol4 = new Polygon(2, point2ds1);
		pol4.readFromString(a);

		System.out.println("Pol4: " + pol4.writeToString());

		v6.readFromString(p);
		System.out.println("v6: " + v6.writeToString());

		v5.readFromString(s);
		System.out.println("V5: " + v5.writeToString());

		System.out.println(v1.amount());

		System.out.println(v1.asUnitVector().amount());

		v1.add(v3);

		System.out.println("writeToString method: " + v2.writeToString());

		v4 = (Vector2D) Vector.add(v1, v3);

		System.out.println("amount of V4 " + v4.amount());

		System.out.println(v1.amount());

		System.out.println("boolean " + v1.asUnitVector().isUnitVector());

		System.out.println("boolean " + v1.isUnitVector());

		System.out.println(v2.amount());

		System.out.println(v2.asUnitVector().amount());
		
		String w = "NumberOfEdges: 2 EdgePoints: Punkt (4.0 , 8.0); Punkt (34.0 , 6.0);"; 
		
		Polygon pol2 = new Polygon(2, point2ds1);
		pol2.readFromString(w);

		Polyeder pol3 = new Polyeder(3, point3ds);
		String z = "NumberOfEdges: 3 EdgePoints: Punkt (4.0 , 3.0 , 4.5); Punkt (7.0 , 6.0 , 3.0); Punkt (9.0 , 4.0 , 2.0);";
		pol3.readFromString(z);
		
		System.out.println("Test 1: " + pol2.writeToString());
		System.out.println("Test 2: " + pol3.writeToString());
	}
}