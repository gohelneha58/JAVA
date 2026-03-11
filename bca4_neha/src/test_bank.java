class bank
{
    int getRateOfInterest(){return 0;}
}
class sbi extends bank
{
    int getRateOfInterest(){return 8;}
}
class icici extends bank
{
    int getRateOfInterest(){return 7;}
}
class axis extends bank
{
    int getRateOfInterest(){return 9;}
}
class test_bank
{
    public static void main(String[] args)
    {
        sbi s=new sbi();
        icici i=new icici();
        axis a=new axis();
        System.out.println("sbi rate of interest:"+ s.getRateOfInterest());
        System.out.println("icici rate of interest:"+ s.getRateOfInterest());
        System.out.println("axis rate of interest:"+ s.getRateOfInterest());
    }
}
