class FloodFill:
    def floodFill(self, image, sr, sc, color):
        initialcolor = image[sr][sc]
        visited = set()
        def valid(x,y):
            if 0<=x<len(image) and 0<=y<len(image[0]) and image[x][y]==initialcolor and (x,y) not in visited:
                return True
        q = []
        q.append((sr,sc))
        image[sr][sc]=color
        while q:
            a,b = q.pop(0)
            if valid(a,b+1):
                image[a][b+1]=color
                q.append((a,b+1))
                visited.add((a,b+1))
            if valid(a,b-1):
                image[a][b-1]=color
                q.append((a,b-1))
                visited.add((a,b-1))
            if valid(a+1,b):
                image[a+1][b]=color
                q.append((a+1,b))
                visited.add((a+1,b))
            if valid(a-1,b):
                image[a-1][b]=color
                q.append((a-1,b))
                visited.add((a-1,b))
        return image
ff = FloodFill()
# image = [[1,1,1],[1,1,0],[1,0,1]], sr = 1, sc = 1, color = 2
print(ff.floodFill([[1,1,1],[1,1,0],[1,0,1]],1,1,2))
# image= [[0,0,0],[0,0,0]], sr = 0, sc = 0, color = 0
print(ff.floodFill([[0,0,0],[0,0,0]],0,0,0))