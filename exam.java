
public class exam {

	public static void main(String args[])
	{
		scores a = new scores();
		scores b = new scores();
		scores c = new scores();
		scores d = new scores();
		
		a.setSubject("English");
		a.setMarks(79);
		b.setSubject("Maths");
		b.setMarks(80);
		c.setSubject("Science");
		c.setMarks(59);
		d.setSubject("Hindi");
		d.setMarks(84);
		
		int sum = a.getMarks()+b.getMarks()+c.getMarks()+d.getMarks();
		if((sum/4)>=75)
		{
			System.out.println("Distinction");
		}
		else if((sum/4)>=60 && (sum/4)<75)
		{
			System.out.println("First Divison");
		}
		else if((sum/4)<60 && (sum/4)>=45)
			System.out.println("Passed");
		else
			System.out.println("Fail");
	}
}
