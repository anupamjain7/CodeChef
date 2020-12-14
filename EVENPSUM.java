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
            long m=sc.nextLong();
            long n=sc.nextLong();
            long s=(((m*n)+1)/2);
            System.out.println(s);
          }
          }
          catch(Exception e)
          {
            return;
          }


    }

  }
