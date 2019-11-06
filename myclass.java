

public class myclass{

	public static void main(String args[])
	{
		student first = new student();
		first.setId(1);
		first.setName("Mark");
		first.setAge(15);

		System.out.println(first.getName() + " is " + first.getAge() + " years old ");
	}

}

