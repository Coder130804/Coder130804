class Subtract
{
    int Subtract(int a,int b)
    { 
        return(a-b);
    }
    int Subtract(int a,int b,int c)
    {
       return (a-b-c);
    }
    double Subtract(double a,double b)
    {
        return(a-b);
    }
    int Subtract(int n, int numbers[])
    {
        for(int i:numbers)
        n=n-i;
        return n;
    }
}