#include <bits/stdc++.h>
using namespace std;

const int MAX = 1000000;
int ans[MAX + 1];


void sieve()
{
bool prime[MAX + 1];

memset(prime, true, sizeof(prime));
for(int i = 2; i * i <= MAX; i++)
{
    if(prime[i] == true)
    {
        for(int j = i * 2; j<= MAX; j+= i)
        {
            prime[j] = false;
        }
    }
} 

ans[0] = ans[1] = 0;
for(int i = 2; i<= MAX; i++)
{
    ans[i] = ans[i-1];
    if(prime[i]) ans[i]++;
}
}

int func2(int x)
{
return ans[x];
}

int main() {
ios_base::sync_with_stdio(false);
cin.tie(NULL);
cout.tie(NULL);

sieve();
long long int t;
cin>>t;
while(t--)
{
  long long int x, y;
  cin>>x>>y;
    if(func2(x) > y) 
    cout<<"Divyam"<<"\n";
    else cout<<"Chef"<<"\n";    
}
return 0;
}
