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
    int t=sc.nextInt();
    char b[]= {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p'};
    while(t--!=0)
       {
    	   int n=sc.nextInt();
    	   sc.nextLine();
    	   String s=sc.nextLine();
    	   char a[]=s.toCharArray();
    	   int u;
    	   int sum=0;
    	   int count=3;
    	   for(int i=0;i<a.length;i++)
    	   {
           u=Character.getNumericValue(a[i]);
           sum=sum+u*(int)Math.pow(2,count);
           count--;
           if((i+1)%4==0)
           {
             count=3;
             System.out.print(b[sum]);
             sum=0; 
           }
    	   }
    	   System.out.println();
       }
      }
      catch(Exception e)
      {
        return;
      }
  }
}
