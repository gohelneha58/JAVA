class A
{
    static int cube(int x)
    {
        return x*x*x;
    }
    public static void main(String[] args)
    {
        int result=A.cube(5);
        System.out.println(result);
        result=A.cube(10);
        System.out.println(result);
    }
}