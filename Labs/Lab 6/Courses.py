from collections import deque

def canFinish(numCourses, prerequisites):
        in_deg = {}
        neighbors = {}
        for i in range(numCourses):
            in_deg[i] = 0
            neighbors[i] = []
        for pair in prerequisites:
            in_deg[pair[0]]+=1
            neighbors[pair[1]].append(pair[0])
        q = deque()
        for i in range(numCourses):
            if in_deg[i]==0:
                q.append(i)
        result = []
        while q:
            course = q.popleft()
            result.append(course)
            for neighbor in neighbors[course]:
                in_deg[neighbor]-=1
                if in_deg[neighbor]==0:
                    q.append(neighbor)
        if len(result)!=numCourses:
            return False
        return True

print(canFinish(2, [[1,0]]))
print(canFinish(2, [[1,0],[0,1]]))