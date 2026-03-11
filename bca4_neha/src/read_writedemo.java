import java.io.*;
class read_writedemo 
{
    public static void main(String[] args)
    {
        try
        {
            FileWriter fw = new FileWriter("New_Test.txt");
            fw.write(" i am studying H N shukla College");
            fw.close();
            FileReader fr=new FileReader("New Test.txt");
            int i;
            while((i=fr.read())!=-1)
                System.out.println((char)i);
            fr.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println("\n success");
    }
}
