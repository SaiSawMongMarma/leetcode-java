//Easy:Height balanced binary tree
//left node/right node<+1
//BFS/DFS traversing iterative/recursive count left & right node
//Time=O(n) Space=O(1(recursive))


public class leetcode_110 {
//    BluePrint
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
//    we input given the root
    public boolean isBalanced(TreeNode root){
        if(root == null){
            return true;
        }

//        calculate the left and right height using helper method
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);

//      last condition
        if(Math.abs(leftHeight - rightHeight) > 1){
            return false;
        }
//       final answer
        return isBalanced(root.left) && isBalanced(root.right);
    }

    private int getHeight(TreeNode node){
        if(node == null){
            return 0;
        }

//        recursively call left and right child
        int leftHeight = getHeight(node.left);
        int rightHeight = getHeight(node.right);

//        calculating left and right adding 1
        return Math.max(leftHeight, rightHeight)+1;
    }
}
