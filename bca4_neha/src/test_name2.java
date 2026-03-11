import java.util.*;
public class test_name2
{
    public static void main(String[] args)
    {
        Stack<String>stack=new Stack<String>();
        stack.push("ravi");
        stack.push("vijay");
        stack.push("ravi");
        stack.push("ajay");
        stack.push("jay");
        stack.push("aashis");
        stack.pop();
        Iterator<String>itr=stack.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
