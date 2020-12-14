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
			while(t--!=0){
			int sum=0;
			int sum2=0;
			int n=sc.nextInt();
			int a[]=new int[n];
			int i=0;
			for(i=0;i<n;i++)
			a[i]=sc.nextInt();
			Arrays.sort(a);
			for(i=n-1;i>=0;i--)
		      {
		          if(sum<=sum2)
		          sum=sum+a[i];
		          else
		          sum2=sum2+a[i];

		      }
			    System.out.println(Math.max(sum,sum2));
			}
			}catch(Exception e)
			{
			    return;
			}
		    
		}
}
