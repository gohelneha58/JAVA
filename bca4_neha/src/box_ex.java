public class box_ex
{
        double width;
        double height;
        double depth;
}

class box_exDemo
{
    public static void main(String[] args)
    {
        box_ex mybox = new box_ex();
        Double vol;
        mybox.width =10;
        mybox.height =20;
        mybox.depth =30;
        vol = mybox.width * mybox.height * mybox.depth;
        System.out.println ("volume is:-"+vol);
    }
}