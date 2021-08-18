#include <iostream>
#include <bits/stdc++.h>
using namespace std;
int main() {
       int t;
       cin>>t;
       while(t--!=0)
       {
           long long int a,b;
           cin>>a>>b;
           vector<pair<int,int>> vec;
           for(int i=0;i<b;i++)
           {
             long long int x,y;
             cin>>x;
             cin>>y;
             vec.push_back({x,y});
           }
           sort(vec.begin(),vec.end(),greater<pair<int,int>>());
           long long int o=1;
           long long int abc=a;
           long long int ans=0;
           for(int i=0;i<b & o>0; i++)
           {
               long long int p=vec[i].first;
               long long int q=vec[i].second;
               o=o*q/__gcd(o,q);
               ans=ans+(abc-(a/o))*p;
               abc=a/o;
           }
           cout<<ans<<"\n";
       }

	return 0;
}
