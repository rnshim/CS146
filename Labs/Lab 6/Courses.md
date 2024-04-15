use two hashmaps one to keep track of each courses' indegree and one to keep track of each courses' neighbors
add courses with indegree of 0 to a queue
pop courses out one by one and add to a result array
for each course popped check its neighbors and decrement their indegrees, if a neighbor's indegree becomes 0, add it to the queue
compare if the length of the result array and the number of courses is equal, return false if it is not