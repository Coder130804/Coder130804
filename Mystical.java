import java.util.*;
class Mystical
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int arr[]=new int[n];
    int nge[]=new int[n];
    int ans[]=new int[n];
    for(int i=0;i<n;i++)
      arr[i]=in.nextInt();
    Stack<Integer> st=new Stack<>();
    for(int i=n-1;i>=0;i--)
    {
      while(!st.isEmpty() && arr[st.peek()]<=arr[i])
        st.pop();
      nge[i]=st.isEmpty()? -1:st.peek();
      st.push(i);
    }
    st.clear();
    int nse[]=new int[n];
    for(int i=n-1;i>=0;i--)
    {
      while(!st.isEmpty() && arr[st.peek()]>=arr[i])
        st.pop();
      nse[i]=st.isEmpty()? -1:st.peek();
      st.push(i);
    }
    for(int i=0;i<n;i++)
    {
      int index=nge[i];
      ans[i]=(index==-1||nse[index]==-1)? -1:arr[nse[index]];
    }
    for(int v:ans)
      System.out.print(v+" ");
  }
}