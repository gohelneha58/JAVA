class test_equal
{
    public static void main(String[] args)
    {
        String s1=new String("HNS");
        String s2=new String("HNS");
        String s3=s2;
        if(s1==s2)
            System.out.println("s1 & s2 are identical objects");
        if(s1.equals(s2))
            System.out.println("s1 & s2 are identical in value");
        if(s3==s2)
            System.out.println("s3 & s2 are identical object");
        if(s3.equals(s2))
            System.out.println("s3 & s2 are identical in value");
    }
}