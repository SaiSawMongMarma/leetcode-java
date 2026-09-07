//Diameter of Binary tree
//Time=O(n)
public class leetcode_543 {
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
//    keep track of maximum diameter
    int maxDiameter = 0;

    public int diameterOfBinaryTree(TreeNode root){
        getHeight(root);
        return maxDiameter;
    }

//    by using recursion
    private int getHeight(TreeNode node){
//        Base Case
        if(node == null) return 0;

//        height of left subtree
        int leftHeight = getHeight(node.left);
        int rightHeight = getHeight(node.right);

//        update the maximum diameter
        maxDiameter = Math.max(maxDiameter, leftHeight+rightHeight);

//        return the height of the current node
//        1 is considering root
        return 1 + Math.max(leftHeight, rightHeight);
    }

}
