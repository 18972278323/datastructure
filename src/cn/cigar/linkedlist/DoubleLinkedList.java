package cn.cigar.linkedlist;

public class DoubleLinkedList {

    private DoubleHeroNode head;


    public DoubleLinkedList(DoubleHeroNode head) {
        this.head = head;
    }

    public DoubleHeroNode getHead() {
        return head;
    }

    public void setHead(DoubleHeroNode head) {
        this.head = head;
    }

    public DoubleLinkedList() {
        this.head = new DoubleHeroNode();
    }

    /**
     * 添加节点
     * @param node 要添加的节点
     */
    public void add(DoubleHeroNode node) {
        DoubleHeroNode tmp = this.head;

        while (tmp.getNext() != null) {
            tmp = tmp.getNext();
        }

        node.setPre(tmp);
        tmp.setNext(node);
    }

    /**
     * 打印链表
     */
    public void list() {
        if (this.isEmpty()) {
            System.out.println("链表为空");
            return;
        }

        DoubleHeroNode tmp = this.head;
        while (tmp.getNext() != null) {
            tmp = tmp.getNext();
            System.out.println(tmp);
        }
    }

    /**
     * 删除制定order的节点
     * @param order 要删除的顺序值
     * @return 删除的节点
     */
    public DoubleHeroNode delete(int order) {
        if (isEmpty()) {
            System.out.println("该链表为空");
            return null;
        }

        // 查找要删除的节点
        boolean findFlag = false;
        DoubleHeroNode tmp = this.head;
        while (tmp.getNext() != null) {
            tmp = tmp.getNext();
            if (tmp.getOrder() == order) {
                findFlag = true;
                break;
            }
            tmp = tmp.getNext();
        }

        // 删除当前节点
        if (findFlag) {
            if (tmp.getNext() != null) {
                tmp.getNext().setPre(tmp.getPre());
            }
            tmp.getPre().setNext(tmp.getNext());
            return tmp;
        }

        return null;

    }

    /**
     * 更新节点
     * @param node
     */
    public boolean update(DoubleHeroNode node) {
        if (isEmpty()) {
            System.out.println("该链表为空");
            return false;
        }

        // 查找要更新的节点
        DoubleHeroNode tmp = head;
        boolean findFlag = false;

        while (tmp.getNext() != null) {
            tmp = tmp.getNext();
            if (tmp.getOrder() == node.getOrder()) {
                findFlag = true;
                break;
            }
        }

        if (findFlag) {
            tmp.setData(node.getData());
            return true;
        }

        return false;
    }

    /**
     * 该链表是否为空
     * @return 该链表是否为空
     */
    public boolean isEmpty() {
        return this.head.getNext() == null;
    }
}
