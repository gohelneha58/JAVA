class Finallyblock_ch3_4
{
    public static void main(String[] args)
    {
        try
        {
            int data=8/2;
            System.out.println(data);
        }
        catch(NullPointerException e){System.out.pritln(e);}
        finally
        {
            System.out.println("finally block is always executed");
        }
        System.out.println("rest of the code...");
    }
}
