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
		int D1=sc.nextInt();
		int V1=sc.nextInt();
		int D2=sc.nextInt();
		int V2=sc.nextInt();
		int P=sc.nextInt();
		int sum=0;
		int i=1;
		for(i=1;i<P;i++)
		{
		    if(D1<=i)
		    sum+=V1;
		    if(D2<=i)
		    sum+=V2;
		    if(sum>=P)
		     break;
		    
		}
		System.out.println(i);
		}
		catch(Exception e)
		{
			return;
		}
		
		}

}
