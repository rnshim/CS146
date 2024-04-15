def top_dfs(graph):
    visited = set()
    stack = []
    result = []

    def dfs(node):
        visited.add(node)
        for neighbor in graph[node]:
            if neighbor not in visited:
                dfs(neighbor)
        stack.append(node)

    for node in graph:
        if node not in visited:
            dfs(node)

    while stack:
        result.append(stack.pop())

    return result

graph = {
    0: [1],
    1: [2,3,4],
    2: [4],
    3: [],
    4: []
}

print(top_dfs(graph))
