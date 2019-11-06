import java.util.*;
public class FibonacciRecursive {
	static int a =0, b=1,temp=0,count=0;
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the count");
		count = sc.nextInt();
		sc.close();
		System.out.println(a);
		System.out.println(b);
		fib(count-2);
	}
	public static void fib(int x)
	{
		if(x>0)
		{
			temp = a+b;
			System.out.println(temp);
			a=b;
			b=temp;
			fib(x-1);
		}
	}

}
