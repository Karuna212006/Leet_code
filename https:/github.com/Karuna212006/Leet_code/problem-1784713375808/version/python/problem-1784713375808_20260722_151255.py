# Last updated: 7/22/2026, 3:12:55 PM
1class Solution(object):
2    def reorganizeString(self, s):
3        count=Counter(s)
4        Max_list=[]
5        for char,cnt in count.items():
6            Max_list.append([-cnt,char])
7        heapq.heapify(Max_list)
8        res=""
9        temp=None
10        while Max_list or temp:
11            if temp and not Max_list:
12                return ""
13            cnt,char=heapq.heappop(Max_list)
14            res+=char
15            cnt+=1
16            if temp:
17                heapq.heappush(Max_list,temp)
18                temp=None
19            if cnt!=0:
20                temp=[cnt,char]
21
22        return res