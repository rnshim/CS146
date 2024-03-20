def canFinish(numCourses, prerequisites):
    l = set()
    for i in range(len(prerequisites)):
        a, b = prerequisites[i]
        l.add((a,b))
        if (b,a) in l:
            return False
    return True
