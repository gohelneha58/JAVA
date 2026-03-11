class InvalidAgeExp extends Exception
{
    InvalidAgeExp(String s)
    {
        super(s);
    }
}
class customException
{
    static void validate(int age)throws InvalidAgeExp
    {
        if(age<18)
            throw new InvalidAgeExp("not valid");
        else
            System.out.println("welcome to vote");
    }
    public static void main(String[] args)
    {
        try
        {
            validate(13);
        }
        catch(Exception e)
        {
            System.out.println("Exception occured:"+e);
        }
        System.out.println("rest of the code...");
    }
}
