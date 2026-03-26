package leetcode.minimumAbsoluteDiffBST_530;

import java.util.ArrayList;
import java.util.List;

public class MinimumDifferenceInOrderArray {
    public int getMinimumDifference(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inorder(root, list);

        int minDiff = Integer.MAX_VALUE;

        for (int i = 1; i < list.size(); i++) {
            minDiff = Math.min(minDiff, list.get(i) - list.get(i - 1));
        }

        return minDiff;
    }

    private void inorder(TreeNode node, List<Integer> list) {
        if (node == null) return;

        inorder(node.left, list);
        list.add(node.val);
        inorder(node.right, list);
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
