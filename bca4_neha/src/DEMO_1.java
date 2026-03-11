interface printable
{
    void print();
}
interface showable
{
    void show();
}
class DEMO_1 implements printable , showable
{
    public void print()
    {
        System.out.println("hello");
    }
    public void show()
    {
        System.out.println("welcome");
    }
    public static void main(String[] args)
    {
        DEMO_1 obj=new DEMO_1();
        obj.print();
        obj.show();
    }
}