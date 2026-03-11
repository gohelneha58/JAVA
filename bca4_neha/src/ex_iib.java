public class ex_iib 
{
    int number;
    {
        System.out.println("instance initilization block");
        number=10;
    }
    public ex_iib()
    {
        System.out.println("constructor1 excuted number:"+number);
    }
    public ex_iib(int num)
    {
        System.out.println("constructor2 excuted number:"+number);
        this.number=num;
    }
    public static void main(String[] args)
    {
        new ex_iib();
        System.out.println("---");
        new ex_iib(20);
    }
}
