import java.util.*;
import java.lang.*;
import java.io.*;

/*
 * 
 */
public class Solution
{
	public static int  maxEnergy(int[] ener)
	{
		int l=ener.length,temp=0,answer=0;
		for(int i=0;i<l;i++)
		{
			for(int j=i+1;j<l;j++)
			{
				if(ener[j]<ener[i])
				{
					temp=ener[i];
					ener[i]=ener[j];
					ener[j]=temp;
				}
			}
		}
		answer=ener[l-2]+ener[l-1];
		return answer;
	}

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter no. of chemicals");
		int ener_size = in.nextInt();
		int ener[] = new int[ener_size];
		System.out.println("Enter the energies of each chemical with + or - signs:");
		for(int idx = 0; idx < ener_size; idx++)
		{
			ener[idx] = in.nextInt();
		}
		int result = maxEnergy(ener);
		System.out.print(result);
		
	}
}
