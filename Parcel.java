import java.util.*;
class Parcel
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int k=in.nextInt();
    int a[]=new int[n];
    int s=0,m=0;
    for(int i=0;i<n;i++){
      a[i]=in.nextInt();
      s=s+a[i];
      m=Math.max(m,a[i]);
    }
    int l=m;
    int r=s;
    int ans=s;
    while(l<=r)
    {
      int mid=(l+r)/2;
      int cnt=1,curr=0;
      for(int x:a)
      {
        if(curr+x>mid)
        {
          cnt++;
          curr=0;
        }
        curr=curr+x;
      }
      if(cnt<=k)
      {
        ans=mid;
        r=mid-1;
      }
      else
        l=mid+1;
      }
      System.out.println(ans);
  }
}