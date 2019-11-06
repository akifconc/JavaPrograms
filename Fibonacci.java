
import java.util.*;

public class Fibonacci {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements you want from the Fibonnaci Series");
		int x = sc.nextInt();
		int a=0;
		int b=1;
		int c=0;
		System.out.println(a);
		System.out.println(b);
		for(int i=0;i<x-2;i++)
		{
			c = a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
		sc.close();
	}

}
