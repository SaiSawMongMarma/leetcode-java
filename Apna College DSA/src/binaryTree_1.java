//Root-Branch-Leaf
//Root Node
//Branches-Leaf Node
//Binary tree Parent Node has only two branch Left & Right child Node / Siblings (two Node)
//Ancestors is Nodes Parent to Parent.
//Level-3 Depth-3 means level 3 has 3 Nodes
//Left Subtree & Right Subtree

//Build Tree Preorder
//1, 2, 4 , -1, -1, 5, -1, -1, 3, -1, 6, -1, -1
//Null Node = -1
//Tree Root = 1
//
//Build a Tree from its Preorder traversal

import java.util.*;
public class binaryTree_1 {

//    Tree single Node
    static class Node {
        int data;
        Node left;
        Node right;


        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

//
    static class BinaryTree {
//        for Travel by increment
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;
            if(nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }

//    Pre Order left to Right count
//    Root Comes First then Left Node
    public static void preorder(Node root) {
        if(root == null) {
            System.out.print("");
//            System.out.print(-1+" ");
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

//Inorder because Root comes in Between
    public static void inorder(Node root) {
        if(root == null) {
//            System.out.print("");
//          System.out.print(-1+" ");
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
//Post Order using Recursion
//    Left Subtree then Right Subtree then root
    public static void postorder(Node root) {
        if(root == null) {
//            System.out.print(-1+" ");
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }

//Level Order
//    BFS = Breath First Search (Level Order Traversal)
//    DFS = Depth First Search

    public static void levelOrder(Node root) {
        if(root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
//        until it is Empty
        while(!q.isEmpty()) {
            Node curr = q.remove();
            if(curr == null) {
                System.out.println();
                //queue empty
                if(q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(curr.data+" ");
                if(curr.left != null) {
                    q.add(curr.left);
                }
                if(curr.right != null) {
                    q.add(curr.right);
                }
            }
        }
    }

//Height of Tree
    public static int height(Node root) {
        if (root == null) {
            return 0;
        }


        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }
//Count of Nodes of Tree
//    Using Recursion (x+y+1)+(x'+y'+1)+1
    public static int countOfNodes(Node root) {
        if(root == null) {
            return 0;
        }


        int leftNodes = countOfNodes(root.left);
        int rightNodes = countOfNodes(root.right);
        return leftNodes + rightNodes + 1;
    }

//Sum of Nodes of Tree
    public static int sumOfNodes(Node root) {
        if(root == null) {
            return 0;
        }


        int leftSum = sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.right);
        return leftSum + rightSum + root.data;
    }

//Diameter of Tree Approach-1 O(n^2)
//    Number of Nodes in the Longest path between any 2 Nodes
    public static int diameter(Node root) {
        if(root == null) {
            return 0;
        }


        int diam1 = height(root.left) + height(root.right) + 1;
        int diam2 = diameter(root.left);
        int diam3 = diameter(root.right);


        return Math.max(diam1, Math.max(diam2, diam3));
    }


    //Diameter of Tree Approach-1 O(n^2)
    static class TreeInfo{
        int height;
        int diam;

        TreeInfo(int ht, int diam){
            this.height = height;
            this.diam = diam;
        }
    }
    public static TreeInfo diameter2(Node root) {
        if(root == null) {
            return new TreeInfo(0, 0);
        }


        TreeInfo leftTI = diameter2(root.left);
        TreeInfo rightTI = diameter2(root.right);


        int myHeight = Math.max(leftTI.height, rightTI.height) + 1;


        int diam1 = leftTI.height + rightTI.height + 1;
        int diam2 = leftTI.diam;
        int diam3 = rightTI.diam;


        int myDiam = Math.max(diam1, Math.max(diam2, diam3));

        return new TreeInfo(myHeight, myDiam);
    }


    public static void main(String args[]) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();

        Node root = tree.buildTree(nodes);
        System.out.println(root.data);

        preorder(root);
        System.out.println();
        inorder(root);
        System.out.println();
        postorder(root);
        System.out.println();
        levelOrder(root);
        System.out.println();
        height(root);
        System.out.println(countOfNodes(root));
        System.out.println(sumOfNodes(root));
        System.out.println(height(root));
        System.out.println(diameter(root));
        System.out.println();
    }

}
