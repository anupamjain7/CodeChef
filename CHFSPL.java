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
		        int a=sc.nextInt();
		        int b=sc.nextInt();
		        int c=sc.nextInt();
		        int d=a+b;
		        int e=a+c;
		        int f=b+c;
		        int g=Math.max(d,e);
		        int ans=Math.max(g,f);
		        System.out.println(ans);
		    }
		}
		catch(Exception e)
		{
		    return;
		}
	}
}
