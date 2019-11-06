
public class Armstrong {
	
	public static void main(String[] args) {
		
		int n=153;
		int sum=0;
		int x =n;
		while(n>0){
			int temp = n%10;
			temp=temp*temp*temp;
			sum=sum+temp;
			n=n/10;
		}
		if(sum==x)
			System.out.println("Armstrong");
		else
			System.out.println("not");
	}

}
