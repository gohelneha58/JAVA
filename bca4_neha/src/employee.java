class person
{
    person()
    {
        System.out.println("constructor of person class");
    }
}
class employee extends person
{
    employee()
    {
        System.out.println("constructor of employee class");
    }
        public static void main(String[] args)
        {
            employee e1= new employee();
        }
}
