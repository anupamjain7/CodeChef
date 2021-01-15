import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- !=0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int h[] = new int[n];
            LinkedHashSet<Integer> hset = new LinkedHashSet<Integer>();
            
            int sum = 0;
            for(int i = 0; i < n; i++){
                h[i] = sc.nextInt();
            }
            Arrays.sort(h);
            hset.add(h[n - 1]);
            sum=h[n - 1];
            int z = -1;
            for(int i = n - 2; i >= 0; i--){
                LinkedHashSet<Integer> hset2 = new LinkedHashSet<Integer>();
                sum = sum + h[i];
                Iterator i1 = hset.iterator();
                while(i1.hasNext()){
                    int p=(int)(i1.next());
                    hset2.add(p);
                    hset2.add(h[i]);
                    hset2.add(p + h[i]);
                    if(((p + h[i]) >= k) && ((sum - p - h[i]) >= k)){
                        z = n - i;
                        break;
                    }
                    if(((h[i]) >= k) && ((sum - h[i]) >= k)){
                        z = n - i;
                        break;
                    }
                }
                if(z != -1){
                    break;
                }
                hset = hset2;
            }
            System.out.println(z);
        }
    }
}
