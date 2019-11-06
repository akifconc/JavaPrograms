
public class area {
	
	public static void main(String args[])
	{
	
	Polygon rec = new Rectangle();
	Polygon tri = new Triangle();
		
		rec.setValues(10, 20);
		tri.setValues(20,30);
		
		System.out.println("area of rectangle is "+ rec.area());
		System.out.println("area of triangle is " + tri.area());
	}
}
