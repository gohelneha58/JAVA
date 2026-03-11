class box_ex6
{
    double width,height,depth;
    box_ex6(double w,double h,double d)
    {
        width = w;
        height = h;
        depth = d;
    }
    double volume()
    {
        return width*height*depth;
    }
}
class box_ex6Demo
{
    public static void main(String[] args)
    {
        double vol;
        box_ex6 mybox1=new box_ex6(10,20,15);
        box_ex6 mybox2=new box_ex6(3,5,7);
        vol=mybox1.volume();
        System.out.println("volume is:"+vol);
        vol=mybox2.volume();
        System.out.println("volume is:"+vol);
    }
}