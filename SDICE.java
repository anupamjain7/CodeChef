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
      long t=sc.nextLong();
      while(t--!=0)
      {
        long n=sc.nextLong();
        long yy=(n%4);
        int x=(int)yy;
        long y=n/4;
        long a2=0L,b3=0L,c4=0L,d5=0L,e=0L,f=0L;
        switch(x)
        {
            case 1:
                d5=1;
                break;
            case 2:
                c4=2;
                break;
            case 3:
                c4=2;
                b3=1;
                break;
        }
        if(y>0)
        {
            a2+=y*4;
            f=(4-x)*4;
        }
        long sum=(a2*11)+(b3*15)+(c4*18)+(d5*20)+f;
        System.out.println(sum);
    }
    }
    catch(Exception e)
    {
      return;
    }
  }
  }
