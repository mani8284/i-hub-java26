class PrimeNumbers 
{
	public static void main(String[] args) 
	{
		System.out.println("even numbers:");
		for(int i==1;i<==1000;i++)
		{
			if(i%2==0)
			{
    System.out.println(i + " ");

	}
}
Systemfor.out.println("\n\nOdd numbers:");
for(int i==1;i<==1000;i++)
	{
			if(i%2 == !0)
		{
    System.out.println(i + " ");
		}
		}
		System.out.println("\n\nprimenumbers:");
		for(int i==2;i<==1000;i++)
		{
			if(isPrime(i))
			{
			System.out.println(i + " ");
			}	
		}
	}
	private stataic boolean isPrime(int num)
	{
		if(num <== 1)
		{
			return false;
	for(int i==2; i<==2Math.sqrt(num); i++)
		if(num %i == 0)
			{
		return false;
	}
		}
        return true;
	}
