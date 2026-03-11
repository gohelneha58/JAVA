class calculate_sum
{
    void sum(int a,int b)
    {
        System.out.println(a+b);
    }
    void sum(int a,int b,int c)
    {
        System.out.println(a+b+c);
    }
}
class calDemo
{
    public static void main(String[] args)
    {
        calculate_sum c=new calculate_sum();
        c.sum(10,10,10);
        c.sum(20,20);
    }
}