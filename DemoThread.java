class Akif extends Thread{

	public void run() {
		for(int i =0;i<10;i++)
		{
			System.out.println(Thread.currentThread().getId() + i);
		}
		
	}
	
}
public class DemoThread {

	public static void main(String[] args) {
		
		Akif obj = new Akif();
		obj.start();
		Akif obj2 = new Akif();
		obj2.start();

	}

}
