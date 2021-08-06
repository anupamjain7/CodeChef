/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		try {
           Scanner sc = new Scanner(System.in);
           int t=sc.nextInt();
           while(t--!=0)
           {
        	   int n=sc.nextInt();
        	   int d=sc.nextInt();
        	   int h=sc.nextInt();
        	   int a[]=new int[n];
        	   for(int i=0;i<n;i++)
        	   a[i]=sc.nextInt();
        	   int sum=0;
        	   int flag=0;
        	   for(int i=0;i<n;i++)
        		   {
        		   if((a[i]==0) && sum>=d)
        		   	   sum-=d;
        		   else if((a[i]==0) && sum<d)
        			   sum=0;
        		   else	   
        		   sum+=a[i];
        		   if(sum>h)
        		   {
        			   flag=1;
        			   break;
        		   }
        		   
        		   }
        	       if(flag==1)
        	    	   System.out.println("YES");
        	       else
        	    	   System.out.println("NO");
           }
		}
		catch(Exception e)
		{
			return;
		}
	}
}
