final class Bike
{
    void run()
    {
            System.out.println("runing");
    }
}
class honda_1 extends Bike
{
    void run()
    {
        System.out.println("running safely with 100kmph");
    }
    public static void main(String[] args)
    {
        honda_1 honda=new honda_1();
        honda.run();
    }
}