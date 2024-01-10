import java.util.Scanner;
class Test4 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
System.out.println("Enter the salary:");
	int salary=sc.nextInt();
	float tds=(float)salary*10/100;
	System.out.println("10 percent of tds is=+tds:");
	}
}
