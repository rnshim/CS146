class ValidBST:
    def isValidBST(self, root):
        return self.valid(root, float("-inf"), float("inf"))
    
    def valid(self, node, left, right):
        if node is None:
            return True
        if node.val <= left or node.val >= right:
            return False
        return (self.valid(node.left, left, node.val) and 
                self.valid(node.right, node.val, right))
    
class TreeNode(object):
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

vbst = ValidBST()
tree1 = TreeNode(4)
tree1.left=TreeNode(3)
tree1.left.left=TreeNode(1)
tree1.right=TreeNode(8)
tree1.right.left=TreeNode(5)
tree1.right.right=TreeNode(9)
tree2 = TreeNode(1)
tree2.left = TreeNode(2)
tree2.right = TreeNode(8)
tree2.right.left = TreeNode(3)
tree2.right.right = TreeNode(4)
tree2.right.left = TreeNode(5)
tree2.right.right = TreeNode(6)
print(vbst.isValidBST(tree1))
print(vbst.isValidBST(tree2))