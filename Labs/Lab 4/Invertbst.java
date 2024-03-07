public class Invertbst{
    public TreeNode invertTree(TreeNode root) {
        // check to see if node is null, return if so
        if (root == null) {
            return null;
        }
        // assign treenode vars to recursive calls to each side
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        // swap sides
        root.left = right;
        root.right = left;
        return root;
    }
    public class TreeNode {

        int val;
   
        TreeNode left;
   
        TreeNode right;
   
        TreeNode() {}
   
        TreeNode(int val) { this.val = val; }
   
        TreeNode(int val, TreeNode left, TreeNode right) {
   
            this.val = val;
   
            this.left = left;
   
            this.right = right;
   
        }
    }
    public static void main(String[] args) {
        Invertbst invertbst = new Invertbst();
        // 1, 2, 8, 3, 4, 5, 6
        TreeNode root1 = invertbst.new TreeNode(1);
        root1.left = invertbst.new TreeNode(2);
        root1.right = invertbst.new TreeNode(8);
        root1.left.left = invertbst.new TreeNode(3);
        root1.left.right = invertbst.new TreeNode(4);
        root1.right.left = invertbst.new TreeNode(5);
        root1.right.right = invertbst.new TreeNode(6);
    
        TreeNode invertedRoot1 = invertbst.invertTree(root1);
        System.out.println(invertedRoot1.val);
        System.out.println(invertedRoot1.left.val+" "+invertedRoot1.right.val);
        System.out.println(invertedRoot1.left.left.val+" "+invertedRoot1.left.right.val+" "+invertedRoot1.right.left.val+" "+invertedRoot1.right.right.val);
    }
}