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
            Set <Integer> s = new HashSet<Integer>();
            Scanner sc = new Scanner(System.in);
            int t=sc.nextInt();
            ArrayList <Integer> m = new ArrayList<Integer>();
            while(t--!=0)
            {
              int a=sc.nextInt();
              int b=sc.nextInt();
              int c=sc.nextInt();
              int d=sc.nextInt();

              s.add(a);
              s.add(b);
              s.add(c);
              s.add(d);
              m.add(a);
              m.add(b);
              m.add(c);
              m.add(d);
              int n=s.size();
              if(n==4 || n==3)
              System.out.println(2);
              else if(n==2)
              {
              Collections.sort(m);
              if(m.get(0)==m.get(1) && m.get(2)==m.get(3))
              System.out.println(2);
              else
              System.out.println(1);    
              }
              else
              System.out.println(0);
              s.clear();
              m.clear();
            }
            }
            catch(Exception e)
            {
              return;
            }
	}
}
