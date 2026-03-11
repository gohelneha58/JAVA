class game
{
    public void type()
    {
        System.out.println("indoor & outdoor");
    }
}
class circket extends game
{
    public void type()
    {
        System.out.println("outdoor game");
    }
    public static void main(String[] args)
    {
        game gm=new game();
        circket ck=new circket();
        gm.type();
        ck.type();
        gm=ck;
        gm.type();
    }
}