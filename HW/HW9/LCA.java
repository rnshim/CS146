package HW9;

public class LCA {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        while (root!=null){   // while node exists
            if (root.val>p.val&&root.val>q.val)    //if root is greater than both p and q, set root to its left child
                root = root.left;
            else if (root.val<p.val&&root.val<q.val) //if root is less than both p and q, set root to its right child
                root = root.right;
            else
                return root;   //otherwise return the root since it is equal to at least one of p or q or in between the two
        }
        return null;

    }

    public static class TreeNode {

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
    public static void main(String[] args){
        LCA.TreeNode root = new LCA.TreeNode(4);
        root.left = new LCA.TreeNode(3);
        root.right = new LCA.TreeNode(8);
        root.left.left = new LCA.TreeNode(1);
        root.right.left = new LCA.TreeNode(5);
        root.right.right = new LCA.TreeNode(9);

        LCA lca = new LCA();
        LCA.TreeNode result = lca.lowestCommonAncestor(root, new LCA.TreeNode(3), new LCA.TreeNode(1));
        System.out.println(result.val); // Output:3

        result = lca.lowestCommonAncestor(root, new LCA.TreeNode(1), new LCA.TreeNode(5));
        System.out.println(result.val); // Output:4
    }
}
