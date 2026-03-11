class PrintStr
{
    Synchronized static void print(String s1,String s2)
    {
        System.out.println(s1+":");
        try
        {
            Thread.sleep(400);
        }
        catch(InterruptedException e)
        {
            System.out.println("interrupted");
        }
        System.out.println(s2);
    }
}
class strThread implements Runnable
{
    Thread t;
    String s1,s2;
    strThread(String s1,String s2)
    {
        this.s1=s1;
        this.s2=s2;
        t=new Thread(this,"myThread");
        t.start();
    }
    public void run()
    {
        PrintStr.print(s1,s2);
    }
}
class ex_Synchronized 
{
    public static void main(String[] args)
    {
        System.out.println(" Synchronied Ex");
        new strThread("1","one");
        new strThread("2","two");
        new strThread("3","three");
    }
}
