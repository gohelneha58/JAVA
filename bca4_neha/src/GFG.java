public class GFG 
{
    {
        System.out.println("IIB1 block");
    }
    {
         System.out.println("IIB2 block");
    }
    public GFG()
    {
        System.out.println("constructor called");  
    }
    {
        System.out.println("IIB3 block");
    }
    public static void main(String[] args)
    {
        GFG a = new GFG();
    }
}
