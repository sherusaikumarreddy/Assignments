public class PrimeNumber 
{
	public static void main(String[] args)
	{
	System.out.println("prime num between 1 to 100");
	for(int i=1;i<=100;i++)
	{
		int p=0;
		for(int j=2;j<i;j++)
		{
			if(i%j==0)
			{
				p++;
				break;
			}
		}
		if(p==0)
		{
			System.out.println(i);
		}
	}
		
	}
}
