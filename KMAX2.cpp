#include <iostream>
#include<bits/stdc++.h> 
using namespace std;

int main() {
	// your code goes here
    long long t,n,p,i; 
    cin>>t; 
    while(t--){ 
        cin>>n;
        cin>>p;
        
        vector<long long>a(n); 
        long long maxvalue=INT_MIN; 
        map<long,long>mp; 
        for(i=0; i<n; i++){ 
            cin>>a[i]; 
            maxvalue = max(maxvalue, a[i]); 
        } 
        long long k=p-1; 
        long long c=0; 
        for(i=0; i<n; i++){ 
            long long res = i+k; 
            if(res<n && a[res]==maxvalue){ 
                c+=(n-res); 
            } 
        } 
        cout<<c<<"\n"; 
    }
	return 0;
}
