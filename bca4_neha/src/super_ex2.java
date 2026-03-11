public class super_ex2
{
    void eat(){System.out.println("eating....");}
}
class mini extends super_ex2
{
    void eat(){System.out.println("eating bread...");}
    void bark(){System.out.println("barking...");}
    void work()
    {
        super.eat();
        bark();
    }
}
class demo_ex
{
    public static void main(String[] args)
    {
        mini d=new mini();
        d.work();
    }
}
