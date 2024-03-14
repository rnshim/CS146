public class ValidBST {
    public boolean isValidBST(TreeNode root) {
        return valid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    public boolean valid(TreeNode node, long left, long right){
        if (node==null)
            return true;
        if (node.val<=left||node.val>=right)
            return false;
        return (valid(node.left,left, node.val)&&valid(node.right,node.val,right));
    }
    public static void main(String[] args){
        ValidBST vbst = new ValidBST();
        TreeNode t1 = new TreeNode(4);
        t1.left=new TreeNode(3);
        t1.left.left=new TreeNode(1);
        t1.right=new TreeNode(8);
        t1.right.left=new TreeNode(5);
        t1.right.right=new TreeNode(9);
        System.out.println(vbst.isValidBST(t1));

        TreeNode tree2 = new TreeNode(1);
        tree2.left = new TreeNode(2);
        tree2.right = new TreeNode(8);
        tree2.right.left = new TreeNode(3);
        tree2.right.right = new TreeNode(4);
        tree2.right.left = new TreeNode(5);
        tree2.right.right = new TreeNode(6);
        System.out.println(vbst.isValidBST(tree2));
    }

}
class TreeNode {

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