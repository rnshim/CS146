from typing import List
class City:
    def findTheCity(self, n: int, edges: List[List[int]], distanceThreshold: int) -> int:
        INF = float('inf')
        dist = [[INF] * n for _ in range(n)]
        for a, b, weight in edges:
            dist[a][b] = weight
            dist[b][a] = weight
            
        for i in range(n):
            dist[i][i] = 0
        
        for k in range(n):
            for i in range(n):
                for j in range(n):
                    dist[i][j] = min(dist[i][j], dist[i][k] + dist[k][j])

    # Now dist[i][j] contains the shortest distance between city i and city j

    # Initialize an array to store the number of reachable cities within distanceThreshold from each city
        reachable_cities = [0] * n

    # Count the number of reachable cities for each city
        for i in range(n):
            for j in range(n):
                if i != j and dist[i][j] <= distanceThreshold:
                    reachable_cities[i] += 1

    # Find the city with the smallest number of reachable cities within the distance threshold
        min_reachable = min(reachable_cities)
        min_city = -1  # Initialize the variable to store the index of the city with the minimum number of reachable cities

        for i, val in enumerate(reachable_cities):
            if val == min_reachable:  # Check if the value is equal to the minimum number of reachable cities
                if min_city == -1 or i > min_city:  # Check if the current index is greater than the previous minimum index
                    min_city = i  # If yes, update the index of the city with the minimum number of reachable cities

        return min_city

city = City()
print(city.findTheCity(4,[[0,1,3],[1,2,1],[1,3,4],[2,3,1]],4))
print(city.findTheCity(5,[[0,1,2],[0,4,8],[1,2,3],[1,4,2],[2,3,1],[3,4,1]],2))