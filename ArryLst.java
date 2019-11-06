import java.util.*;
public class ArryLst {

		public static void main(String args[])
		{
			ArrayList <Integer> mylist = new ArrayList<Integer>(5);
			
			mylist.add(3);
			mylist.add(28);
			mylist.add(38);
			mylist.add(53);
			mylist.add(2);
			mylist.add(87);
			
			for(Integer x: mylist )
				System.out.println(x);
			
			System.out.println("size is = "+ mylist.size());
			
			mylist.remove(4);
			
			for(Integer x: mylist )
				System.out.println(x);
			
			System.out.println("size is = "+ mylist.size());
			
			
			
			
		}
}
