import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		 Scanner sc =  new Scanner(System.in);
		 
		 try {
        	 int t=sc.nextInt();
        	 while(t--!=0) {
        		 
        	 
        	 int n=sc.nextInt();
        	 int a[]=new int[n];
        	 for(int i=0;i<n;i++)
        	 a[i]=sc.nextInt();	 
        	 Arrays.sort(a);
        	 int sum=0;
        	 int flag=0;
        	 for(int i=1;i<=n;i++)
        	 {
        		 if(i<a[i-1])
        		 {
                             flag=1;
        		     break;
        		 }
        		 sum=sum+(i-a[i-1]);
        		 
        	 }
        	
        	 if(flag==1)
        		 System.out.println("Second");
        	 else if(sum%2==0)
        		 System.out.println("Second");
        	 else if(sum%2!=0)
        		 System.out.println("First");
        	 }
        	 }
         catch(Exception e)
         {
        	 return;
         }


	}
}
