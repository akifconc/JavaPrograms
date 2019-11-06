import java.util.*;
public class PrimeNumbers {
	static int flag=0;
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int check = sc.nextInt();
		sc.close();
		if(check == 1)
		{
			System.out.println("not prime");
		}
		else
		{
			for(int i = 2;i<check/2;i++)
			{
				if(check%i==0)
				{
					flag++;
					System.out.println("not prime");
				}
			}
			if(flag==0)
			{
				System.out.println("prime");
			}
			
		}
	}
}
