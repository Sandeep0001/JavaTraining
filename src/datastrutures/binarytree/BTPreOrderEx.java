package datastrutures.binarytree;

public class BTPreOrderEx {


    //used to create the Tree node
    public static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data){
            this.data = data;
        }

    }


    public static TreeNode createBinaryTree(){

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

    //pre order - recursive  solution
    public void preorderTraverse(TreeNode root){

        if(root != null){
            System.out.print(root.data + " "); //40 20 10 30 60 50 70

            preorderTraverse(root.left);
            preorderTraverse(root.right);
        }

    }

    public static void main(String[] args) {

        BTPreOrderEx bt = new BTPreOrderEx();

        TreeNode rootNode = createBinaryTree();

        bt.preorderTraverse(rootNode);

    }

}
