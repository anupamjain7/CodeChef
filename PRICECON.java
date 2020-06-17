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
         int t,N,i,k,sum=0;
         int a[]=new int[20000];
          t=sc.nextInt();
         while(t--!=0)
         {
           N=sc.nextInt();
           k=sc.nextInt();
           for(i=0;i<N;i++)
           {
              a[i]=sc.nextInt();
           }
           for(i=0;i<N;i++)
           {
             if(a[i]>k)
             {
               sum=sum+(a[i]-k);
             }
           }
           System.out.println(sum);
           sum=0;
         }
   }
  catch(Exception e)
  {
      return;
  }
}
}
