import java.util.*;
public class Stock
{
  public static void main(String atrgs[])
  {
    Scanner in=new Scanner(System.in);
    System.out.println("Enter the no. of warehouses and number of product types");
    int r=in.nextInt();
    int c=in.nextInt();
    int wh[][]=new int[r][c];
    int t=0;
    System.out.println("Enter the stock levels in each warehouse");
    for(int i=0;i<r;i++)
    {
        for(int j=0;j<c;j++)
        wh[i][j]=in.nextInt();
    }
    for(int i=0;i<r;i++)
      {
        t=0;
        for(int j=0;j<c;j++)
          {
            if(wh[i][j]>=100)
              c++;
            else
              continue;
          }
        if(c>=3)
          t++;
      }
    System.out.println("Number of overstocked warehouse:"+t);
  }
}