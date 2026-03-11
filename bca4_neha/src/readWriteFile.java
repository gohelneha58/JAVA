import java.io.*;
public class readWriteFile
{
    public static void main(String[] args)throws Exception
    {
        FileInputStream fin=new FileInputStream("test.txt");
        FileOutputStream fout= new FileOutputStream("T.txt");
        int i=0;
        while((i=fin.read())!=-1)
        {
            fout.write((byte)i);
        }
        System.out.println("1 file copied");
        fin.close();
        fout.close();
        fin= new FileInputStream("T.txt");
        while((i=fin.read())!=-1)
        {
            System.out.println((char)i);
        }
        fin.close();
    }
}
