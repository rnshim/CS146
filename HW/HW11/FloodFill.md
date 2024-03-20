declare a variable to hold the initial color of the starting pixel
declare a set to keep track of visited pixels
use a helper method that checks if the pixel is in the grid and equal to the starting pixel's color and not visited already
add the starting pixel to an empty queue
change the starting pixel's color to the new color
while the queue is not empty, pop the first element, check if each pixel on the four sides of that pixel is valid and if so change the color, add it to the queue and visited set