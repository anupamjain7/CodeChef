#include <iostream>
using namespace std;
void solve()
{
    long long n,m,k;
    cin>>n>>m>>k;
    double crr[n+1][m+1];
    for(long long i=0;i<=n;i++)
    {
        for(long long j=0;j<=m;j++)
    {
      if(i==0||j==0)
      crr[i][j]=0;
      else
      cin>>crr[i][j];
    }
    
    }
    for(long long i=0;i<=n;i++)
    {
        double prev=0;
        for(long long j=0;j<=m;j++)
        {
            crr[i][j]+=prev;
            prev=crr[i][j];
        }
    }
    for(long long i=0;i<=m;i++)
    {
        double prev=0;
        for(long long j=0;j<=n;j++)
        {
            crr[j][i]+=prev;
            prev=crr[j][i];
        }
    }
    long long m_min=min(m,n);
    long long ans=0;
    for(long long u=1;u<=m_min;u++)
    {
        for(long long i=u;i<=n;i++)
        {
            for(long long j=u;j<=m;j++)
            {
                if((crr[i][j]+crr[i-u][j-u]-crr[i][j-u]-crr[i-u][j])/(u*u)>=k)
                ans++;
            }
        }
    }
    cout<<ans<<"\n";
}
int main() {
	// your code goes here
	long long t;
	cin>>t;
	while(t--)
	{
	    solve();
	}
	return 0;
}
