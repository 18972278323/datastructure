package cn.cigar.linkedlist;

/**
 * 单链表面试题
 */
public class InterviewSingleLinkedList {


    /**
     * 单链表
     */
    public static int getLength(SingleLinkedList linkedList) {
        int count = 0;
        HeroNode tmp = linkedList.getHead();
        while (tmp.getNext() != null) {
            tmp = tmp.getNext();
            count ++;
        }
        return count;
    }


    /**
     * 获取指定链表倒数第index个元素
     * @param linkedList 要查询的链表
     * @param index 倒数第index个元素
     * @return 倒数第index个元素
     */
    public static HeroNode getLastIndexNode(SingleLinkedList linkedList, int index) {
        int length = InterviewSingleLinkedList.getLength(linkedList);

        if (index <= 0 || length < index){
            return null;
        }

        HeroNode tmp = linkedList.getHead().getNext();
        for (int i = 0; i < length - index; i++) {
            tmp = tmp.getNext();
        }
        return tmp;
    }


    /**
     * 链表反转
     * @param linkedList 要反转的链表
     * @return 反转后的链表
     */
    public static SingleLinkedList reverse(SingleLinkedList linkedList) {
        if (linkedList.isEmpty()) {
            return linkedList;
        }
        HeroNode newHead = new HeroNode();

        HeroNode head = linkedList.getHead();
        HeroNode curNode = head.getNext();
        while (curNode != null) {
            // 先做记录，避免后续被更改
            HeroNode nextNode = curNode.getNext();

            // 在新链表前面插入该节点
            curNode.setNext(newHead.getNext());
            newHead.setNext(curNode);

            curNode = nextNode;
        }

        return new SingleLinkedList(newHead);
    }
}
