#include <iostream>
using namespace std;

int main() {
	// your code goes here
    int t;
    cin>>t;
    while(t--!=0)
    {
        int a;
        cin>>a;
        int b;
        cin>>b;
        int c;
        cin>>c;
        int d;
        cin>>d;
        int k;
        cin>>k;
        int sum=abs(a-c)+abs(b-d);
        if(sum==k)
        cout<<"YES";
        else if(sum>k)
        cout<<"NO";
        else if((k-sum)%2==0 && k>sum)
        cout<<"YES";
        else
        cout<<"NO";
        cout<<"\n";
    }
	return 0;
}
