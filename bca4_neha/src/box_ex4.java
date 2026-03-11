class box_ex4
{
    double width,height,depth;
    double volume()
    {
        return width*height*depth;
    }
    void setdim(double w,double h,double d)
    {
        width=w;
        height=h;
        depth=d;
    }
}
class box_ex4Demo
{
    public static void main(String[] args)
    {
        double vol;
        box_ex4 mybox1=new box_ex4();
        box_ex4 mybox2=new box_ex4();
        mybox1.setdim(10,15,25);
        mybox2.setdim(3, 5, 7);
        vol=mybox1.volume();
        System.out.println("volume is:"+vol);
        vol=mybox2.volume();
        System.out.println("volume is:"+vol);
    }
}