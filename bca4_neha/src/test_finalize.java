public class test_finalize
{
    int a;
    public static void main(String[] args)
    {
        test_finalize obj=new test_finalize();
        obj.a=10;
        System.out.println(obj.a);
        obj=null;
        System.gc();
        System.out.println("end of garbage collection");
    }
    protected void finalize()
    {
        System.out.println("finalize method called");
    }
}