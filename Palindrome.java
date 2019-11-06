import java.util.*;
public class Palindrome {
	static int temp,sum=0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int x = sc.nextInt();
		sc.close();
		int c = x;
		while(x>0)
		{
			temp= x%10;
			sum= (sum*10)+temp;
			x=x/10;
		}
		if(c==sum)
			System.out.println("yes");
		else
			System.out.println("no");
	}

}
