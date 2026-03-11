/*write a program to parform one dimensional array*/
public class onedim
{
	public static void main(String[] args)
	{
		int marks[];
		marks=new int[3];
		marks[0]=91;
		marks[1]=97;
		marks[2]=99;
		int total=marks[0]+marks[1]+marks[2];
		double per=total/3;
		System.out.println("the total mark is:"+total);
		System.out.println("the percentage is:"+per);
	}
}
		