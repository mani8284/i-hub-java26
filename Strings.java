import java.util.StringTokenizer;
class Strings 
{
	public static void main(String[] args) 
	{
    StringTokenizer st=new StringTokenizer("8,88,888",",");
	while(st.hasMoreElements())
		{
		String str=(String)st.nextElement();
	System.out.println(str);
}
}
}		
