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
		try{
                Scanner sc = new Scanner(System.in);
		long t=sc.nextLong();
		while(t--!=0)
		{
		    long a=sc.nextLong();
		    long b=sc.nextLong();
		    long c=sc.nextLong();
		    long bsecond=b*60;
		    long csecond=c*60;
		    long req=0L;
		    req+=Math.min(a,bsecond);
		    bsecond-=Math.min(a,bsecond);
		    req+=2*bsecond;
		    if(req<=csecond)
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
