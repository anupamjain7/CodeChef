#include<iostream>
#include <bits/stdc++.h>
using namespace std;


int o(long long int ar[], long long int n) 
{ 
    int r = 0;  
    for (int i = 0; i < n; i++)      
        r = r ^ ar[i]; 
   return r; 
} 

int main()
{
    long long int *x,*y;
    long long int t,n,len,a,b;
    cin>>t;
    while(t--)
        {
        cin>>n;
        len=n*4-1;
        x= new long long int[len];
        y= new long long int[len];
        for(int i=0;i<len;i++)
        {
            cin>>x[i]>>y[i];
        }

        
		    a=o(x,len);
        
		    b=o(y,len);

        cout<<a<<" "<<b<<"\n";
       }
   return 0;
 }
