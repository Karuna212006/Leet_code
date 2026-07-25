# Last updated: 7/25/2026, 2:19:03 PM
class Solution(object):
    def reorganizeString(self, s):
        count=Counter(s)
        Max_list=[]
        for char,cnt in count.items():
            Max_list.append([-cnt,char])
        heapq.heapify(Max_list)
        res=""
        temp=None
        while Max_list or temp:
            if temp and not Max_list:
                return ""
            cnt,char=heapq.heappop(Max_list)
            res+=char
            cnt+=1
            if temp:
                heapq.heappush(Max_list,temp)
                temp=None
            if cnt!=0:
                temp=[cnt,char]

        return res