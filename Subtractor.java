class Subtractor
{
    public static void main(String args[])
    {
        Subtract s1=new Subtract();
        System.out.println("Method1(two int): "+ s1.Subtract(13,12));
        System.out.println("Method2(three int): "+ s1.Subtract(13,12,5));
        System.out.println("Method3(two double): "+ s1.Subtract(13.59,9.76));
        int arr[]={1,2,3,4,5};
        System.out.println("Method4(array): "+ s1.Subtract(13,arr));
    }
    
}