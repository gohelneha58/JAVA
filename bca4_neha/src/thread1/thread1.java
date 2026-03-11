class a implements Runnable
{
    Thread t ;
    a()
    {
        t=new Thread(this,"child Thread-2");
        System.out.println(t);
        t.start();
    }
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            try
            {
                System.out.println(i);
                Thread.sleep(2000);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }
}
public class thread1
{
    public static void main(String[] args)
    {
        new a();   
    }
}