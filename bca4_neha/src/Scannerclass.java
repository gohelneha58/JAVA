import java.util.Scanner;
public class Scannerclass
{
    public static void main(String[] args)
    {
        Scanner myobj=new Scanner(System.in);
        System.out.println("enter name, age and salary=");
        String name= myobj.nextLine();
        int age = myobj.nextInt();
        double salary = myobj.nextDouble();
        System.out.println("name :" + name);
        System.out.println("age :" + age);
        System.out.println("salary :" + salary);
    }
}