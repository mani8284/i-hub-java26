import java.util.*;
class Nani
{
	public static void main(String[] args) 
	{
		Vector v=new Vector();
		for(int i=1;i<=10;i++)
		{
			v.add(i);
		}
		system.out.println(v);
		Enumeration e=v.elements();
		While(e.hasMoreElements())
		{
			Integer i=(Integer)e.nextElement();
			System.out.println(i);
		}
	}
}
