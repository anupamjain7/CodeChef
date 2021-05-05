#include <iostream>
using namespace std;

int main() {
	// your code goes here
        long long int t;
        cin>>t;
        while(t--!=0) {

        long long int n;
        cin>>n;
        long long int x;
        cin>>x;
        long long int m;
        cin>>m;

        long long int a[n];
        for(int i=0;i<n;i++)
        {
        cin>>a[i];


        }
        long long int max=a[0];
        for(int i=1;i<n;i++)
        {
          if(max<a[i])
          max=a[i];

        }

         long long int c[max+1]={0};
        for(int i=0;i<n;i++)
        {
          c[a[i]]++;

        }	

        long long int sum=0L;
        for(int i=0;i<=max;i++)
        {
        if(c[i]>1)
        {
          if(c[i]%2==0)
          {
            sum=sum+(c[i]*i);
          }
          else
            sum=sum+(c[i]-1)*i;
        }
        }
        if(((sum+m)>=x))
        cout<<"YES"<<endl;
        else
        cout<<"NO"<<endl;
        }
	return 0;
}
