class single_inheritance 
{
    void eat(){ System.out.println("eating...");}
}
class dog extends single_inheritance
{
    void bark(){ System.out.println("barking");}
}
class demo
{
    public static void main(String[] args)
    {
        dog d= new dog();
        d.bark();
        d.eat();
    }
}
