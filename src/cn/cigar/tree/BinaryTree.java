package cn.cigar.tree;

public class BinaryTree {

    private HeroNode root;

    /**
     * 前序遍历
     */
    public void preOrderList() {
        if (this.root != null) {
            this.root.preOrder();
        }
    }

    /**
     * 中序遍历
     */
    public void midOrderList() {
        if (this.root != null) {
            this.root.midOrder();
        }
    }

    /**
     * 后序遍历
     */
    public void postOrderList() {
        if (this.root != null) {
            this.root.postOrder();
        }
    }

    public BinaryTree(HeroNode root) {
        this.root = root;
    }

    public BinaryTree() {}

    public HeroNode getRoot() {
        return root;
    }

    public void setRoot(HeroNode root) {
        this.root = root;
    }
}
