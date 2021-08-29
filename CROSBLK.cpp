#include <iostream>
#include<bits/stdc++.h>
using namespace std;
void func()
{
    long long int  n;
    cin>>n;
    vector<long long int>arr(n);
    for(long long int  i=0;i<n;i++){
        cin>>arr[i];
    }
    long long int p=arr[0];
    for(long long int  i=1;i<n;i++){
        if(arr[i]>p){
            cout<<-1<<endl;
            return;
        }
    }
    stack<long long int> st;
    for(long long int  i=1;i<n;i++){
        while(st.size() and st.top()<=arr[i]){
            st.pop();
        }
        st.push(arr[i]);
    }
    long long int ans=0;
    while(!st.empty()){
        ans++;
        st.pop();
    }
    cout<<ans<<endl;
}
signed main()
{
  long long int t;
  cin>>t;
  while(t--!=0){
  func();
  }
  return 0;
}
