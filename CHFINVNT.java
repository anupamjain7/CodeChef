/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{	
		// TODO Auto-generated method stub
        try {     
        Scanner sc = new Scanner(System.in); 
        int t=sc.nextInt();
        while(t--!=0)
        {
          int n=sc.nextInt();
          int p=sc.nextInt();
          int k=sc.nextInt();
          long ans=0L;
          int d=p%k;
            int e=n%k;
          if(e<=d-1)
          {
              ans=(n%k)*(n/k+1)+(d-n%k)*(n/k);
              ans+=(p/k+1);
          }
          else
          {
              ans=d*((n/k)+1);
              ans+=((p/k)+1);
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
