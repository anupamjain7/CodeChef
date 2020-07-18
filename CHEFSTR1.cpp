#include <iostream>
using namespace std;
int main()
{

  long long int t;
  long long int i;
  cin>>t;
  while(t--)
   {
     long long int sub=0,sum=0;
     long long int n,p,c;
     cin>>n>>p;

     for(i=1;i<n;i++)
     {
      cin>>c;
      sub=abs(p-c);
      p=c;
      if(sub>1)
        {
          sub-=1;
          sum+=sub;
        }

    }
    cout<<sum<<"\n";
   }
return 0;
}
