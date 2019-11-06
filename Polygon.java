
abstract public class Polygon  {
	
	protected int height;
	protected int width;
	public double area()
	{
		return (height*width);
	}
	
	public void setValues(int a, int b)
	{
		height = a;
		width = b;
	}
}

