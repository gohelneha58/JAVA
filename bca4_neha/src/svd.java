class svd
{
    int rollno;
    String name;
    static String college="SVD";
    svd(int r,String n)
    {
        rollno=r;
        name=n;
    }
    void display()
    {
        System.out.println(rollno+""+name+""+college);
    }
        public static void main(String[] args)
        {
            svd s1=new svd(1,"nikhil");
            svd s2=new svd(2,"NIKHIL");
            s1.display();
            s2.display();
        }
}