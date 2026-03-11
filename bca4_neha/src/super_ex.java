public class super_ex
{
    String color="white";    
}
class animal extends super_ex
{
    String color="black";
    void printColor()
    {
        System.out.println(color);
        System.out.println(super.color);
    }
}
class demo_super
{
    public static void main(String[] args)
    {
        animal d= new animal();
        d.printColor();
    }
}
