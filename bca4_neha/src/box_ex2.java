class box_ex2
{
    double width,height,depth;
    void volume()
    {
        System.out.println("volume is:-" + width*height*depth);
    }
}
class box_ex2Demo
{
    public static void main(String[] args)
    {
        box_ex2 mybox1= new box_ex2();
        box_ex2 mybox2= new box_ex2();
        
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;
        mybox1.width = 10;
        mybox1.height = 15;
        mybox1.depth = 25;
        mybox1.volume();
        mybox1.volume();
        
    }
}