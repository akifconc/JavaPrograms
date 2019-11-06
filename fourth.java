public class fourth{
	/*PRE AND POST INCREMENT*/
	public static void main(String args[])
	{
		int x = 10;
		System.out.println(x++);/*this will still print 10 but
					  the value now is increased 
					  for any further operation*/
		System.out.println(x);/*this will print 11 as the value
					has been already been increased 
					in the last operation*/
		System.out.println(++x);/*this is pre incrementation and
					  this will print 12*/
	}
}
