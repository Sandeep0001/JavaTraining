package datastrutures.binarytree;

public class BTInorder {

    public static TreeNode createBinaryTree() {

        TreeNode rootNode = new TreeNode(40);

        TreeNode node20 = new TreeNode(20);
        TreeNode node10 = new TreeNode(10);
        TreeNode node30 = new TreeNode(30);
        TreeNode node60 = new TreeNode(60);
        TreeNode node50 = new TreeNode(50);
        TreeNode node70 = new TreeNode(70);

        rootNode.left = node20;
        rootNode.right = node60;

        node20.left = node10;
        node20.right = node30;

        node60.left = node50;
        node60.right = node70;

        return rootNode;
    }

    public static void main(String[] args) {

        BTInorder obj = new BTInorder();
        TreeNode rootNode = createBinaryTree();

        obj.inOrderTraversal(rootNode);

    }

    public void inOrderTraversal(TreeNode root) {

        if (root != null) {
            inOrderTraversal(root.left);

            System.out.print(root.data + " "); //10 20 30 40 50 60 70

            inOrderTraversal(root.right);
        }
    }

    //used to create the Tree node
    public static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
        }
    }
}
