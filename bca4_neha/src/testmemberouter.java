class testmemberouter 
{
    private int data=30;
    class inner
    {
        int data=20;
        void msg(){System.out.println("data is:"+this.data);}
    }
    public static void main(String[] args)
    {
        testmemberouter obj=new testmemberouter();
        testmemberouter.inner in=obj.new inner();
        System.out.println(obj.data);
        in.msg();
    }
}
