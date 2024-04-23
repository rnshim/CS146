from typing import List
class Water:
    def minCostToSupplyWater(self, n: int, wells: List[int], pipes: List[List[int]]) -> int:
        ps = list(range(n+1))
        def find(x):
            if x != ps[x]:
                ps[x]=find(ps[x])
            return ps[x]
        def union(x,y):
            r1=find(x)
            r2=find(y)
            if r1!=r2:
                ps[r2]=r1
                return True
            return False

        es = []
        for u,v,c in pipes:
            es.append((c,u-1,v-1))
        
        for i,c in enumerate(wells):
            es.append((c,i,n))

        es.sort()
        a=0
        for c,u,v in es:
            if union(u,v):
                a+=c
        return a

water = Water()
print(water.minCostToSupplyWater(2,[1,1],[[1,2,1],[1,2,2]]))