find indegree
put all vertices with indegree of 0 into a queue
pop vertices out of queue one by one. add popped vertice to result list and decrement the in degree of its neighbors. If a neighboring vertex's in degree becomes 0, add enqueue it
if vertices in result list are not equal to in input graph then there is a cycle