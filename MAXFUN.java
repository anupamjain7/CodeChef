import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
       try {
      Scanner sc = new Scanner(System.in);
		
		int t=sc.nextInt();
		while(t--!=0)
		{
			int n=sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
			Arrays.sort(a);
			long sum=Math.abs(a[n-1]-a[0]);
			System.out.println(2*sum);
		}
		}
		catch(Exception e)
		{
			return;
		}
	}

}
