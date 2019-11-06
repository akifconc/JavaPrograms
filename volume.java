
public class volume {
	public static void main(String args[])
	{
		Cube first = new Cube();
		Cube second = new Cube(20,20,20);
		
		System.out.println(first.getCubeVolume());
		System.out.println(second.getCubeVolume());
	}
}
