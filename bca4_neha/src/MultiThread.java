class C extends Thread
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("from Thread C:i="+i);
        }
        System.out.println("Exit from C");
    }
}
class B extends Thread
{
    public void run()
    {
        for(int i=1;i<5;i++)
            System.out.println("from Thread B:i="+i);
        System.out.println("exit from B");
    }
}
class MultiThread 
{
    public static void main(String[] args)
    {
        C a= new C();
        B b= new B();
        a.start();
        b.start();
    }
}
