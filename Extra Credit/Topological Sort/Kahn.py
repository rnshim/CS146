from collections import deque
def kahn(graph):
    in_deg = {}
    for node in graph:
        in_deg[node] = 0
    for node in graph:
        for neighbor in graph[node]:
            in_deg[neighbor] += 1
    
    queue = deque()
    for node in graph:
        if in_deg[node] == 0:
            queue.append(node)
    result = []

    while queue:
        node = queue.popleft()
        result.append(node)
        for neighbor in graph[node]:
            in_deg[neighbor] -= 1
            if in_deg[neighbor] == 0:
                queue.append(neighbor)

    if len(result) != len(graph):
        return None
    return result

graph = {
    0: [1],
    1: [2,3,4],
    2: [4],
    3: [],
    4: []
}
print(kahn(graph))
