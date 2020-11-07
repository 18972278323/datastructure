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

        System.out.println("删除order为4的节点");
        linkedList.delete(4);
        linkedList.list();

        System.out.println("更新order为3的节点");
        HeroNode node = new HeroNode(3, "李安然", null);
        linkedList.update(node);
        linkedList.list();

        System.out.println("计算链表的长度");
        int length = InterviewSingleLinkedList.getLength(linkedList);
        System.out.println("length = " + length);

        System.out.println("查询链表倒数第1个元素");
        HeroNode indexNode = InterviewSingleLinkedList.getLastIndexNode(linkedList, 1);
        System.out.println("delete = " + indexNode);
        linkedList.list();

        System.out.println("单链表反转");
        SingleLinkedList reverse = InterviewSingleLinkedList.reverse(linkedList);
        reverse.list();

    }

}
