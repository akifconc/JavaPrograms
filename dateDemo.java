import java.text.SimpleDateFormat;
import java.util.*;
public class dateDemo {

	public static void main(String args[])
	{
		Date d = new Date();
		System.out.println(d.toString());
		
		SimpleDateFormat sdf = new SimpleDateFormat("E d/MM/YYYY HH-MM-SS");
		System.out.println(sdf.format(d));
	}
	
}
