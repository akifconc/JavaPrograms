import java.util.*;
public class LnkdLst {

		public static void main(String args[])
		{
			LinkedList <String> mylist = new LinkedList<String>();
			
			mylist.add("First");
			mylist.add("Second");
			mylist.add("third");
			mylist.add("fourth");
			mylist.add("fifth");
			mylist.add("sixth");
			
			for(String x: mylist )
				System.out.println(x);
			
			System.out.println("size is = "+ mylist.size());
			
			mylist.remove(4);
			
			for(String x: mylist )
				System.out.println(x);
			
			System.out.println("size is = "+ mylist.size());
			
			
			
			
		}
}
