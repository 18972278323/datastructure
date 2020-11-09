package cn.cigar.linkedlist;

/**
 * 单链表
 *
 * @author asus
 */
public class SingleLinkedList {

    private SingleHeroNode head;

    public SingleHeroNode getHead() {
        return head;
    }

    public void setHead(SingleHeroNode head) {
        this.head = head;
    }

    public SingleLinkedList() {
        this.head = new SingleHeroNode(0, null, null);
    }

    public SingleLinkedList(SingleHeroNode head) {
        this.head = head;
    }

    /**
     * 添加节点
     * @param node
     */
    public void add(SingleHeroNode node) {
        SingleHeroNode tmp = this.head;
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
        SingleHeroNode tmp = this.head;
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

    /**
     * 更新指定顺序的节点数据
     * @param node
     * @return
     */
    public boolean update(SingleHeroNode node) {
        if (isEmpty()) {
            System.out.println("链表为空");
            return false;
        }

        boolean updateFlag = false;
        SingleHeroNode tmp = head;
        while (tmp.getNext() != null) {
            tmp = tmp.getNext();
            if (tmp.getOrder() == node.getOrder()) {
                tmp.setData(node.getData());
                updateFlag = true;
            }
        }

        return updateFlag;
    }


    /**
     * 打印当前链表
     */
    public void list() {
        if (isEmpty()) {
            System.out.println("当前链表为空");
        } else {
            SingleHeroNode tmp = this.head;

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


