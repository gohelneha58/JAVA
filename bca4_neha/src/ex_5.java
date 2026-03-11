public class ex_5
{
	public static void main(String[] args)
	{
		char grade='c';
		switch(grade)
		{
			case 'A':
				System.out.println("excellent!");
				break;
			case 'B':
			case 'C':
				System.out.println("well-done");
				break;
			case 'D':
				System.out.println("you passed");
				break;
			case 'E':
				System.out.println("better try again");
				break;
			default:
				System.out.println("invalide grade");
		}
		System.out.println("your grade is" +grade);
	}
}