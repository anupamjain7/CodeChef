import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		try{
		    Scanner sc = new Scanner(System.in);
		    int t=sc.nextInt();
		    while(t--!=0)
		    {
		        int n=sc.nextInt();
		        int ans=0;
		        for(int i=1;i<=n;i++)
		        {
		            for(int k=2*i;k<=n;k+=i)
		            {
		                ans=ans+(1+(n-i)/k);
		            }
		        }
		        System.out.println(ans);
		    }
		}
		catch(Exception e)
		{
		    return;
		}
	}
}
