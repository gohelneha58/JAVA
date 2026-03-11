import java.io.*;
public class FileDemo
{
    public static void main(String[] args)
    {
        try
        {
            File file=new File("D:\\neha_java\\bca4_neha\\b.java");
            if(file.isFile())
            {
                System.out.println("File exists");
            }
            else
            {
                System.out.println("File not exists!!!");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
