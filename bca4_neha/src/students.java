class students 
{
    int id,age;
    String name;
    students()
    {
        id=0;
        name="";
        age=0;
    }
    students(int i,String n)
    {
        id=i;
        name=n;
        age=18;
    }
    students(int i,String n,int a)
    {
        id=i;
        name=n;
        age=a;
    }
    void display()
    {
        System.out.println(id+""+name+""+age);
    }
    public static void main(String[] args)
    {
        students s1=new students(1,"nd");
        students s2=new students(2,"nd",25);
        students s3=new students();
        s1.display();
        s2.display();
        s3.display();
    }
}
