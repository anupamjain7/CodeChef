#include <iostream>
using namespace std;

int main() {
	// your code goes here
  int t;
  cin>>t;
  while(t--!=0)
  {
    int n,k,a=0;
    cin>>n>>k;
    int ans[n+1];
    for(int i=1;i<=n;i++)
    {
      if(n%2==0 && i%2==0)
      ans[i]=i;
      else if(n%2==0 && i%2!=0)
      {
      ans[i]=-i;
      }
      else if(n%2!=0 && i%2!=0)
      {
      ans[i]=i;
      }
      else if(n%2!=0 && i%2==0)
      {
      ans[i]=-i;
      }
    }
    int count=0;
    for(int i=1;i<=n;i++)
    {
    if(ans[i]>0)
      count++;
    }
	
    int sum=0;
    for(int i=1;i<=n;i++)
    {
      if(sum>0)
        break;
      sum=sum+ans[i];
      if(sum>0)
      {
      if(count<k)
      {
        int diff=k-count;
        for(int j=n;j>0;j--)
        {
          if(ans[j]<0)
          {
          ans[j]=-ans[j];
          count++;
          }
          if(count==k)
            break;
        }
      }
      else if(count>k)
      {
        int diff=k-count;
        for(int j=n;j>0;j--)
        {
          if(ans[j]>0)
          {
          ans[j]=-ans[j];
          count--;
          }
          if(count==k)
            break;
          }
        }
      }
    }

  for(int i=1;i<=n;i++)
  cout<<ans[i]<<" ";
  cout<<"\n";
  }
  return 0;
}
