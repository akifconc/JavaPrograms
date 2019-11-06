
public class MthdOvrldng {
	
	public static void main(String args[])
	{
		int one = 10;
		int two = 20;
		double third = 34.7;
		double fourth = 43.2;
		String firstName = "Akif";
		String lastName = " Beg";
		
		System.out.println(Add(one,two));
		System.out.println(Add(third,fourth));
		System.out.println(Add(firstName,lastName));
	}
	
	public static int Add(int a, int b)
	{
		return a+b;
	}
	public static double Add(double a, double b)
	{
		return a+b;
	}
	public static String Add(String a, String b)
	{
		return a+b;
	}
}

