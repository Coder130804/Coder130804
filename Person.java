class Person extends Account
{
    String name;
    int aadhar_no;
    Person(String n,int a,int an,double b)
    {
        super.input(an,b);
        name=n;
        aadhar_no=a;
    }
    void disp()
    {
        System.out.println("Name:"+name);
        super.disp();
        System.out.println("Aadhar No."+aadhar_no);
    }
}