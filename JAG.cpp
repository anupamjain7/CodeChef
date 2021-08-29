#include <iostream>
#include<bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
   long long int t;cin>>t;
    while(t--){
        long long int n;
        cin>>n;
        long long int arr[n];
        long long int ans=0;
        map<int,int> v;
        for(int i=0;i<n;i++){
            cin>>arr[i];
            v[arr[i]-i-1]++;
            if(v[arr[i]-i-1]==1){
                ans++;
            }
        }
        if(v[arr[0]-1]==n){
            cout<<n<<"\n";
        }
        else{
            cout<<1<<"\n";
        }
    }
    return 0;
}
