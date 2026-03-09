public class Test1
{
    public static void main(String args[]) throws ArrayIndexOutOfBoundsException
    {
        int arr[]={1,2,3,4,5};
        try
        {
            System.out.println(arr[4]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("Code Executed");
        }
    }
}