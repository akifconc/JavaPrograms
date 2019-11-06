import java.util.*;
public class second
{ 
	/*Taking user input*/
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your id: ");
		int id = sc.nextInt();
		System.out.println("enter your name: ");
		sc.nextLine();
		String name = new String();
		name = sc.nextLine();

		System.out.println("Your user name is");
		System.out.println(name);
   		System.out.println("your id is " + id);
	}
}
