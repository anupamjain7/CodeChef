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
    	   int m=sc.nextInt();
    	   int a[]=new int[n];
    	   int b[]=new int[m];
    	   int suma=0,sumb=0;
    	   for(int i=0;i<n;i++)
    	   {
    		   a[i]=sc.nextInt();
    		   suma=suma+a[i];
    	   }
    	   for(int j=0;j<m;j++)
    	   {
    		   b[j]=sc.nextInt();
    		   sumb=sumb+b[j];
    	   }
    	   Arrays.sort(a);
    	   Arrays.sort(b);
    	   int flag=0;
    	   int count=0;
    	   if(suma>sumb)
    		   System.out.println("0");
    	   else {
    	   
    		  int x=m-1;
    		   for(int k=0;k<n;k++)
    		   {
    			   suma=suma-a[k];
    			   suma=suma+b[x];
    			   sumb=sumb-b[x];
    			   sumb=sumb+a[k];
    			   x--;
    			   count++;
    			   if(suma>sumb || x<0)
    			   {
    				   break;
    			   }
    			  
    		   }
    		 if(suma>sumb)
    		   System.out.println(count);
                 else
    		   System.out.println(-1);
    	   }	   
       
       }
    }
    catch(Exception e)
    {
      return;
    }
		
	}

}
