class Invertbst:
    def invertTree(self, root):
        if root is None:
            return None
        left = self.invertTree(root.left)
        right = self.invertTree(root.right)
        root.left = right
        root.right = left
        return root
    class TreeNode(object):
        def __init__(self, val=0, left=None, right=None):
            self.val = val
            self.left = left
            self.right = right

# 1,2 8,3 4 5 6
invertbst = Invertbst()
root = invertbst.TreeNode(1)
root.left = invertbst.TreeNode(2)
root.right = invertbst.TreeNode(8)
root.left.left = invertbst.TreeNode(3)
root.left.right = invertbst.TreeNode(4)
root.right.left = invertbst.TreeNode(5)
root.right.right = invertbst.TreeNode(6)
invertedRoot = invertbst.invertTree(root)
print(invertedRoot.val)
print(invertedRoot.left.val, invertedRoot.right.val)
print(invertedRoot.left.left.val, invertedRoot.left.right.val, invertedRoot.right.left.val, invertedRoot.right.right.val)
