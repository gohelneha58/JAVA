import java.io.*;
import java.lang.*;
class BufferedDemo
{
    public static void main(String[] args)
    {
        try
        {
            FileWriter writer= new FileWriter("D:\\testout.txt");
            BufferedWriter buffer=new BufferedWriter(writer);
            buffer.write("welcom to world of java.");
            buffer.close();
            FileReader fr = new FileReader("D:\\testout.txt");
            BufferedReader br=new BufferedReader(fr);
            String ln=null;
            while((ln=br.readLine())!=null)
            {
                System.out.println(ln);
            }
            br.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
                   