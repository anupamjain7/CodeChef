import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
	 Scanner sc = new Scanner(System.in);
       try {
       int t=sc.nextInt();
       while(t--!=0)
       {
    	   
    	   int n=sc.nextInt();
    	   int k=sc.nextInt();
    	   int d=sc.nextInt();
    	   int sum=0;
    	   for(int i=0;i<n;i++)
    	   {
    		   int y=sc.nextInt();
    		   sum=sum+y;
    	   }
    	   int x=sum/k;
    	   int z=Math.min(x, d);
    	   System.out.println(z);
       }
       }
       catch(Exception e)
       {
    	   return;
       }
		
		
       
	}
}
