package leetcode.minimumAbsoluteDiffBST_530;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}

public class MinimumDifferenceInOrderTraversal {
    Integer prev = null;
    int minDiff = Integer.MAX_VALUE;

    public int getMinimumDifference(TreeNode root) {
        inorder(root);
        return minDiff;
    }

    private void inorder(TreeNode node) {
        if (node == null) return;

        inorder(node.left);

        if (prev != null) {
            minDiff = Math.min(minDiff, node.val - prev);
        }
        prev = node.val;

        inorder(node.right);
    }
    public static void main(String[] args) {
        /*
              4
             / \
            2   6
           / \
          1   3
        */

        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        MinimumDifferenceInOrderTraversal mindiff = new MinimumDifferenceInOrderTraversal();
        int result = mindiff.getMinimumDifference(root);

        System.out.println("Minimum Absolute Difference: " + result);
    }
}
