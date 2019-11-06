
public class DemoJoin {
	
	private static int count =0;
	public synchronized static void inccount()
	{
		count++;
	}
	public static void main(String args[]){
		Thread t1 = new Thread(new Runnable(){

			@Override
			public void run() {
				
				for(int i =1;i<=10000;i++)
					inccount();
			}
		});
		
		Thread t2 = new Thread(new Runnable(){

			@Override
			public void run() {
				
				for(int i =1;i<=10000;i++)
					inccount();
			}
		});
		
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(count);
		
	}
}
