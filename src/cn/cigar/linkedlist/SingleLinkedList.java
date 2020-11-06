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

    /**
     * 删除节点
     * @param order
     */
    public boolean delete(int order) {
        if (this.isEmpty()){
            return false;
        }
        boolean findFlag = false;
        HeroNode tmp = this.head;
        while (tmp.getNext() != null) {
            // 当前指针的下一个元素即为要删除的
            if (tmp.getNext().getOrder() == order) {
                findFlag = true;
                break;
            }
            tmp = tmp.getNext();
        }

        // 找到了要删除的元素
        if (findFlag){
            // 判断要删除的元素是否最后一个
            if (tmp.getNext() == null){
                tmp.setNext(null);
            }else {
                tmp.setNext(tmp.getNext().getNext());
            }
            return true;
        }
        return false;
    }


    public void list() {
        if (isEmpty()) {
            System.out.println("当前链表为空");
        } else {
            HeroNode tmp = this.head;

            while (tmp.getNext() != null) {
                tmp = tmp.getNext();
                System.out.println(tmp);
            }
        }
    }


    /**
     * 判断当前链表是否有有效元素
     * @return
     */
    public boolean isEmpty() {
        return this.head.getNext() == null;
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