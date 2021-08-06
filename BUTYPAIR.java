#include <iostream>
#include<bits/stdc++.h>
using namespace std;
int main()
{
    long long int t;
    cin>>t;
    while(t--)
    {
        long long int n;
        cin>>n;
        long long int a[n];
        for (long long int i=0;i<n;i++)
        {
            cin>>a[i];
        }
        map<long long int,long long int> m;
        for(long long int x:a)
        {
            m[x]++;
        }
        long long int ans = n*(n-1);
        for (auto z:m)
        {
            if (z.second > 1)
            {
                ans-=(z.second*(z.second-1));
            }
        }
        cout<<ans<<"\n";
    }
    return 0;
}
