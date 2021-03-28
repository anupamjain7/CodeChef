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
		try{
                Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		while(T--!=0){
		    int n;
		    n=sc.nextInt();
		    int a[]=new int[n];
		    for(int i=0;i<n;i++){
		        a[i]=sc.nextInt();
		    }
		    int[] r=new int[n];
		    int c=0;
			for(int i=0;i<n;i++) {
				c=0;
				for(int j=i;j>=0;j--) {
					if(i==j) {
						continue;
					}
					if(a[i]<a[j]) {
						break;
					}
					if(a[i]==a[j]) {
						c++;
					}
					
				}
				for(int j=i;j<n;j++) {
					if(i==j) {
						continue;
					}
					if(a[i]<a[j]) {
						break;
					}
					if(a[i]==a[j]) {
						c++;
					}
					
				}
				r[i]=c;
			}
			for(int i=0;i<n;i++){
			    System.out.println(r[i]);
			}
		}
		}
		catch(Exception e)
		{
		    return;
		}
	}
}
