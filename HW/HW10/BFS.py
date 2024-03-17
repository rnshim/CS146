from typing import Optional, List

class TreeNode(object):
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

class BFS:
    def levelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
        list = []
        if not root:
            return list
        q = []
        q.append(root)
        while q:
            size = len(q)
            lvl = []
            for _ in range(size):
                node = q.pop(0)
                lvl.append(node.val)
                if node.left:
                    q.append(node.left)
                if node.right:
                    q.append(node.right)
            list.append(lvl)
        return list
bfs=BFS()
tree1 = TreeNode(4)
tree1.left=TreeNode(3)
tree1.left.left=TreeNode(1)
tree1.right=TreeNode(8)
tree1.right.left=TreeNode(5)
tree1.right.right=TreeNode(9)
print(bfs.levelOrder(tree1))
print(bfs.levelOrder(None))