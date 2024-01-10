class Exceptions 
{
	public static void main(String[] args) 
	{
		String s=null;
		customFunc(s); 
	}
		static void customFunc(String str)
			{
			try
			{
			
			System.out.println("First character:" + str.indexOf(0));
	}
	catch (NullPointerException ne)
		{
		ne.printStackTrace();
		}
}
}

