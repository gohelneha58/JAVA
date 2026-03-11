import java.io.*;
public class STDemo
{
    public static void main(String[] args)throws IOException
    {
        FileReader freader= new FileReader("C:\\Users\\user\\Documents\\NetBeansProjects\\bca4_neha\\src\\AIIContent.txt");
        StreamTokenizer st= new StreamTokenizer(freader);
        double sum=0;
        int numWords=0;
        while(st.nextToken()!=st.TT_EOF)
        {
            if(st.ttype==StreamTokenizer.TT_NUMBER)
            {
                sum+=st.nval;
            }
            else if(st.ttype==StreamTokenizer.TT_WORD)
            {
                numWords++;
            }
        }
        System.out.println("sum of total number is the file:"+sum);
        System.out.println("total words(doesn't include number)in the file:"+numWords);
    }
}
