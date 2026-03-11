import java.io.*;
class Test
{
    void method()throws IOException
    {
        throw new IOException("device error");
    }
}
class import_java_ch3_6 
{
    public static void main(String[] args)
    {
        try
        {
            Test obj=new Test();
            obj.method();
        }
        catch(Exception e){System.out.println("exception handled"+e);
        System.out.println("normal flow...");
    }
}
