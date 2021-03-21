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

  while(t--!=0)
  {
    int count=0;
    int n=sc.nextInt();
    int w[]=new int[n];
    int b[]=new int[n];
    int l[]=new int[n];
    int pos[]=new int[n];
    for(int i=0;i<n;i++)
      w[i]=sc.nextInt();
    for(int i=0;i<n;i++)
    pos[i]=i;
    for(int i=0;i<n;i++)
      l[i]=sc.nextInt();
    for(int i=0;i<n;i++)
      b[i]=w[i];
    Arrays.sort(b);
    int index1=-1;
    int index2=-1;
    int p=-1;
    for(int j=1;j<n;j++)
    {
      for(int k=0;k<n;k++)
      {
        if(b[j]==w[k])
          index1=k;
      }

      for(int k=0;k<n;k++)
      {
        if(b[j-1]==w[k])
          index2=k;
      }
      p=pos[index2];
      int c=index1;

      while(c<=p)
      {
        c=c+l[index1];
        pos[index1]=c;
        count++;
      }
    }
    System.out.println(count);	
  }
      }catch(Exception e)
      {
        return;
      }








    }

  }
