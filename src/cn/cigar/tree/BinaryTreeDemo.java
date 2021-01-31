package cn.cigar.tree;

public class BinaryTreeDemo {

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();

        HeroNode root = new HeroNode(1, "李安然");
        HeroNode node1 = new HeroNode(2, "涂俊");
        HeroNode node2 = new HeroNode(3, "马田");
        HeroNode node3 = new HeroNode(4, "朱维娇");

        root.setLeft(node1);
        root.setRight(node2);
        node2.setRight(node3);
        binaryTree.setRoot(root);

        // 前序遍历
//        binaryTree.preOrderList();
//        binaryTree.midOrderList();
        binaryTree.postOrderList();
    }

}
