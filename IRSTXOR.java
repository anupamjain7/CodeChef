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
    try {
    int t=sc.nextInt();
    while(t--!=0) {
    int c=sc.nextInt();
    int flag=0;
    int i,j;
    String m="";
    String e="";

    String a=Integer.toBinaryString(c);


    for(j=0;j<a.length();j++)
    {
    if(a.charAt(j)=='1' && flag==0)
    {
      flag=1;
      m=m+"1";
      e=e+"0";
    }
    else if(a.charAt(j)=='1' && flag==1)
    {

      m=m+"0";
      e=e+"1";
    }
    else if(a.charAt(j)=='0')
    {
      m=m+"1";
      e=e+"1";
    }
    }

    long  x=Integer.parseInt(m,2);
    long y=Integer.parseInt(e,2);
    System.out.println(x*y);


    }
    }
    catch(Exception e)
    {
    return;
    }
    }

    }
