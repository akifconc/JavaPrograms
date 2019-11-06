import java.util.*;
public class LstIrtr {
	
	public static void main(String args[])
	{
		ArrayList <String> mylist = new ArrayList<String>();
		
		mylist.add("first");
		mylist.add("second");
		mylist.add("third");
		mylist.add("fourth");
		mylist.add("fifth");
		mylist.add("sixth");
		
		ListIterator<String> itr = mylist.listIterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println(mylist.size());
		
		
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());
		}
		
	}

}
