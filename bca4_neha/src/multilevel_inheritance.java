public class multilevel_inheritance  
{
    void eat(){ System.out.println("eating...");}
}
class DOG extends multilevel_inheritance
{
    void bark(){ System.out.println("barking");}
}
class babydog extends DOG
{
    void weep(){ System.out.println("weeping");}
}
class Demo
{
    public static void main(String[] args)
    {
        babydog d= new babydog();
        d.weep();
        d.bark();
        d.eat();
    }
}

