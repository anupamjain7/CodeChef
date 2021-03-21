#include <iostream>
#include<vector>
#define ll long long int
#define endl "\n"
using namespace std;

int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--)
	{
	    int n;
	    cin>>n;
	    vector<pair<int,int>> p1 ,st;
	    for(int i=0;i<n;i++)
	    {
	        int v;
	        cin>>v;
	        p1.push_back({i+1,v});
	    }
	    if(n==2)
	    {
	        cout<<"1\n";
	        continue;
	    }
	    st.push_back(p1[0]);
	    st.push_back(p1[1]);
	    int ans=1;
	    int sz=st.size();
	    for(int i=2;i<n;i++)
	    {
	        while(st.size()>=2)
	        {
	            double s1 = ((double)st[sz-1].second - (double)st[sz-2].second)/((double)st[sz-1].first - (double)st[sz-2].first);
	             double s2 = ((double)p1[i].second - (double)st[sz-1].second)/((double)p1[i].first - (double)st[sz-1].first);
                   if(s1<=s2)
                   {
                       st.pop_back();
                       sz--;
                   }
                   else
                   break;
	        }
	        st.push_back(p1[i]);
	        sz++;
	        ans=max(ans,st[sz-1].first-st[sz-2].first);
	        
	        
	    }
	    
	    
	    cout<<ans<<"\n";
	    
	    
	    
	    
	    
	    
	}
	return 0;
}
