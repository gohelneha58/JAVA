public class hierarchical   
{
    void eat(){ System.out.println("eating...");}
}
class Dog extends hierarchical
{
    void bark(){ System.out.println("barking");}
}
class cat extends hierarchical
{
    void meow(){ System.out.println("meowing...");}
}
class DEMO
{
    public static void main(String[] args)
    {
        cat c= new cat();
        c.meow();
        c.eat();
    }
}

