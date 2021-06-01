#include <bits/stdc++.h>
#include <algorithm>
using namespace std;
int prefix[10000000 + 1];
void ans()
{
    bool pr[10000000 + 1];
    memset(pr, true, sizeof(pr));
 
    for (int p = 2; p * p <= 10000000; p++) {
 
        if (pr[p] == true) {
 
            for (int i = p * 2; i <= 10000000; i += p)
                pr[i] = false;
        }
    }
 
    prefix[0] = prefix[1] = 0;
    for (int p = 2; p <= 10000000; p++) {
        prefix[p] = prefix[p - 1];
        if (pr[p])
            prefix[p]++;
    }
}
 int qans(int L, int R)
{
    return prefix[R] - prefix[L];
}
int main() {
  ios::sync_with_stdio(false);
  cin.tie(0);
  int t;
  cin >> t;
  ans();
  while (t--) {
      int n;
      cin>>n;
      if(n==2)
      cout<<"1\n";
      else if(n==3||n==4)
      cout<<"2\n";
      else{
          int l = n / 2;
          int ans2 = qans(l,n);
          cout<<ans2+1<<"\n";
      }
      
  }
  return 0;
}
