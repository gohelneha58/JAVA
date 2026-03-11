import java.io.*;
public class Date_INOUT 
{
    public static void main(String[] args)throws Exception
    {
        FileOutputStream f=new FileOutputStream("new_data.dat");
        DataOutputStream d= new DataOutputStream(f);
        try
        {
            d.writeInt(10);
            d.writeInt(20);
            d.writeInt(30);
            d.close();
        }
        catch(Exception e){}
        DataInputStream din=null;
        try
        {
            FileInputStream fin = new FileInputStream("New_Data.dat");
            din =new DataInputStream(fin);
            while(true)
            {
                int theNumber= din.readInt();
                System.out.println(theNumber);
            }
        }
        catch(EOFException ex)
        {
            din.close();
        }
        catch(IOException ex)
        {
            System.out.println(ex);
        }
                
    }
}
