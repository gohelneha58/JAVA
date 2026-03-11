class box_ex5
{
    double width,height,depth;
    box_ex5()
    {
        width = 10;
        height = 10;
        depth = 10;
    }
    double volume()
    {
        return width*height*depth;
    }
}
class box_ex5Demo
{
    public static void main(String[] args)
    {
        double vol;
        box_ex5 mybox1=new box_ex5();
        box_ex5 mybox2=new box_ex5();
        vol=mybox1.volume();
        System.out.println("volume is:"+vol);
        vol=mybox2.volume();
        System.out.println("volume is:"+vol);
    }
}