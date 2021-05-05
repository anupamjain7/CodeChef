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
		Scanner scan = new Scanner(System.in);
		int t=scan.nextInt();
		while(t--!=0)
		{
			int count0=0;
			int count1=0;
			int n=scan.nextInt();
			scan.nextLine();
			String str=scan.nextLine();
			int p=0;
			for(int i=0;i<str.length();i++)
			{
				if(str.charAt(i)=='0')
					count0++;
				else if(str.charAt(i)=='1')
					count1++;
				if(count0<=count1)
				{
					p=1;
					System.out.println("YES");
					break;
				}
			}
			if(p==0)
				System.out.println("NO");
		}
		}
		catch(Exception e)
		{
			return;
		}
		}

	}

