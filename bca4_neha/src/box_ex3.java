class box_ex3
{
    double width,height,depth;
    double volume()
    {
        return width*height*depth;
    }
}
class box_ex3Demo
{
    public static void main(String[] args)
    {
        box_ex3 mybox1= new box_ex3();
        box_ex3 mybox2= new box_ex3();
        double vol;
        
        mybox1.width=10;
        mybox1.height=15;
        mybox1.depth=20;
        mybox2.width=20;
        mybox2.height=2;
        mybox2.depth=5;
        vol = mybox1.volume();
        System.out.println("volume is:-"+vol);
        vol = mybox2.volume();
        System.out.println("volume is:-"+vol);
    }
            
}