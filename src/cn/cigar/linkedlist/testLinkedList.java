package cn.cigar.linkedlist;

/**
 * @author Cigar
 */
public class testLinkedList {

    public static void main(String[] args) {
        testSingleLinkedList();
    }


    /**
     * 测试单链表操作
     */
    private static void testSingleLinkedList() {
        SingleLinkedList linkedList = new SingleLinkedList();

        HeroNode node1 = new HeroNode(1, "加雪松", null);
        HeroNode node2 = new HeroNode(2, "林南松", null);
        HeroNode node3 = new HeroNode(3, "郑紫琴", null);
        HeroNode node4 = new HeroNode(4, "傅贝贝", null);

        linkedList.add(node1);
        linkedList.add(node2);
        linkedList.add(node3);
        linkedList.add(node4);

        linkedList.list();
    }

}
