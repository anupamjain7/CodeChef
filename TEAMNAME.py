# cook your dish here
try:
    def func1(x,y):
        s=len(set(x+y))
        return s
    for t in range(int(input())):
        n=int(input())
        l=input().split()
        ans={}
        for i in l:
            p=i[1:]
            if p in ans:
                ans[p].append(i[0])
            else:
                ans[p]=[i[0]]
        body1=list(ans.keys())
        s=0
        for i in range (len(ans)):
            for j in range(i+1,len(ans)):
                temp=func1(ans[body1[i]],ans[body1[j]])
                s+=(temp-len(ans[body1[i]]))*(temp-len(ans[body1[j]]))
        print(2*s)
except:
    pass
