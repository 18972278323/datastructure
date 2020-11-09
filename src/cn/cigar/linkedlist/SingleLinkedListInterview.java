package cn.cigar.linkedlist;

import java.util.Stack;

/**
 * 单链表面试题
 */
public class SingleLinkedListInterview {


    /**
     * 单链表
     */
    public static int getLength(SingleLinkedList linkedList) {
        int count = 0;
        SingleHeroNode tmp = linkedList.getHead();
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
    public static SingleHeroNode getLastIndexNode(SingleLinkedList linkedList, int index) {
        int length = SingleLinkedListInterview.getLength(linkedList);

        if (index <= 0 || length < index){
            return null;
        }

        SingleHeroNode tmp = linkedList.getHead().getNext();
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
    public static void reverse(SingleLinkedList linkedList) {
        if (linkedList.isEmpty()) {
            return ;
        }
        SingleHeroNode newHead = new SingleHeroNode();

        SingleHeroNode head = linkedList.getHead();
        SingleHeroNode curNode = head.getNext();
        while (curNode != null) {
            // 先做记录，避免后续被更改
            SingleHeroNode nextNode = curNode.getNext();

            // 在新链表前面插入该节点
            curNode.setNext(newHead.getNext());
            newHead.setNext(curNode);

            curNode = nextNode;
        }
        linkedList.getHead().setNext(newHead.getNext());
//        return new SingleLinkedList(newHead);
    }


    /**
     * 使用栈完成链表的反转
     * @param linkedList 要反转的链表
     */
    public static void reverse2(SingleLinkedList linkedList) {
        if (linkedList.isEmpty()) {
            return;
        }

        Stack<SingleHeroNode> singleHeroNodes = new Stack<>();

        SingleHeroNode tmp = linkedList.getHead();
        while (tmp.getNext() != null) {
            tmp = tmp.getNext();
            singleHeroNodes.push(tmp);
        }

        // 清空原链表
        SingleHeroNode head = linkedList.getHead();
        head.setNext(null);

        // 将新栈中的接点追加在链表最后
        while (singleHeroNodes.size() > 0){
            SingleHeroNode cur = head;
            SingleHeroNode node = singleHeroNodes.pop();
            while (cur.getNext() != null) {
                cur = cur.getNext();
            }
            node.setNext(null);
            cur.setNext(node);
        }

    }
}
