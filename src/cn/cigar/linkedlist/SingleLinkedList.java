package cn.cigar.linkedlist;

/**
 * 单链表
 *
 * @author asus
 */
public class SingleLinkedList {

    private HeroNode head;

    public SingleLinkedList() {
        this.head = new HeroNode(0, null, null);
    }

    /**
     * 添加节点
     * @param node
     */
    public void add(HeroNode node) {
        HeroNode tmp = this.head;
        while (tmp.getNext() != null){
            tmp = tmp.getNext();
        }

        tmp.setNext(node);
    }

    public void delete(int no) {
        HeroNode tmp = this.head;
        while (tmp.getNext() != null) {
            // 当前指针的下一个元素即为要删除的
            if (tmp.getNext().getOrder() == no) {
                break;
            }
            tmp = tmp.getNext();
        }

        // 判断要删除的元素是否最后一个
        if (tmp.getNext() != null){
            tmp.setNext(tmp.getNext().getNext());

        }
    }
}


class HeroNode {
    private int order;

    private Object data;

    private HeroNode next;

    public HeroNode(int order, Object data, HeroNode next) {
        this.order = order;
        this.data = data;
        this.next = next;
    }

    public HeroNode() { }

    @Override
    public String toString() {
        return "HeroNode{" +
                "order=" + order +
                ", data=" + data +
                '}';
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public HeroNode getNext() {
        return next;
    }

    public void setNext(HeroNode next) {
        this.next = next;
    }
}