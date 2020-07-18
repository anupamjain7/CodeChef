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
  Scanner sc = new Scanner(System.in);
  try
  {
  int t=sc.nextInt();
  while(t--!=0)
     {
       int counta=0,countb=0;
       int n=sc.nextInt();
       while(n--!=0)
       {
         int a=sc.nextInt();
         int b=sc.nextInt();
         int o=c(a);
         int p=c(b);
         if(o>p)
           counta++;
         else if(p>o)
           countb++;
         else
           {
              counta++;
              countb++;
           }

      }
      if(counta>countb)
         System.out.println("0 "+counta);
      else if(countb>counta)
         System.out.println("1 "+countb);
      else
         System.out.println("2 "+countb);
     }
 }
 catch(Exception e)
 {
  return;
 }
}
public static int c(int g)
{
  int y=g;
  int sum=0;
  while(y!=0)
  {
    int u=y%10;
    sum=sum+u;
    y=y/10;


  }
  return sum;
}
}
