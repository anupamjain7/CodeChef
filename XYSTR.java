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
  int t=sc.nextInt(),count=0,c=0;
    while(t--!=0)
    {     
          count=0;
          if(c==0)
          sc.nextLine();
    String s=sc.nextLine();
    for(int i=0;i<s.length()-1;)
    {
      if(s.charAt(i)=='x')
      {     
         if(s.charAt(i+1)=='y')
          {
             count++;
             i+=2;
          }
         else
             i+=1;   
      }
      else if(s.charAt(i)=='y')
      {     
          if(s.charAt(i+1)=='x')
        {
           count++;
           i+=2;
        }
         else
            i+=1;   
      }
       else
        i+=1;
    }
    System.out.println(count);
    count=0;
    c=1;
    }
    }
  catch(Exception e)
  {
    return;
  } 
}
}
