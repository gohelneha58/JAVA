//maximum value of three number using nested_if
public class nested_if
{
	public static void main(String[] args)
	{
		int a=10,b=7,c=9;
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("\n a is maximum");
			}
			else
			{
				System.out.println("\n c is maximum");
			}
		}
		else
		{
			if(b>c)
			{
				System.out.println("\n b is maximum");
			}
			else
			{
				System.out.println("\n c is maximum");
			}
		}
	}
}
				 