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
			int a=sc.nextInt();
			int y=sc.nextInt();
			int x=sc.nextInt();
			long ans;
			if(a>=y){
			ans=(long)x*y;
			System.out.println(ans);
			}
                        else
                        {
                            ans=(long)a*x+1;
                            System.out.println(ans);
                        }
		    
		    
		}
		}
		catch(Exception e)
		{
			return;
		}
	}
}
