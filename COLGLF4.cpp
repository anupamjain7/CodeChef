#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main() {
	// your code goes here
        long long int t;
        cin>>t;
        while(t--)
        {

        long long int n;
        long long int e;
        long long int c;
        long long int a;
        long long int b;
        long long int d;
        cin>>n>>e>>c>>a>>b>>d;
        vector <long long int> s1;
        vector <long long int> s2;
        for(int i=0;i<=n+1;i++)
        {
            s2.push_back(i);
        }
        for(long long int m=0;m<=n;m++)
        {
            long long int i1=lower_bound(s2.begin(),s2.end(),(2*n-e-2*m)) - s2.begin();
            long long int i2=upper_bound(s2.begin(),s2.end(),(c-3*m)) - s2.begin()-1;
            if(i2<i1 || i1==n+1)
            continue;
            if(i2==n+1 && i2+3*m>c)
            continue;
            long long int k;
            if(d>a)
            k=(i1<(n-m)?i1:(n-m));
            else
            k=(i2<(n-m)?i2:(n-m));

            long long int o=n-k-m;
            if(k+2*m>=2*n-e && k+3*m<=c)
            {
                s1.push_back(a*o+b*m+d*k);
            }
            }
            if(s1.size()==0)
            cout<<"-1"<<"\n";
            else
            {
                long long int min=s1[0];
                for(long long int i=0;i<s1.size();i++)
                if(s1[i]<min)
                min=s1[i];
                cout<<min<<"\n";
            }

        }
      return 0;
      }
