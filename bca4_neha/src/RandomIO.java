import java.io.*;
class RandomIO 
{
    public static void main(String[] args)
    {
        RandomAccessFile file=null;
        try
        {
            file=new RandomAccessFile("test.txt","rw");
            file.writeChar('X');
            file.writeInt(555);
            file.writeDouble(3.1412);
            file.seek(0);
            System.out.println(file.readChar());
            System.out.println(file.readInt());
            System.out.println(file.readDouble());
            file.seek(2);
            System.out.println(file.readInt());
            file.close();
        }
        catch(IOException e)
        {
            System.out.println("Exception:"+e);
        }
    }
}
