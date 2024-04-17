use floyd warshall 3 for loops:
make |n|x|n| 2d array to store distance from one city to another
fill each cell with max number and fill diagonals with 0
add known distances to the 2d array
use 3 nested loops to find distances for non direct cities and update the cells accordingly
use two nested loops to go through each city and find city with smallest number of cities to travel to within the threshold
return that city