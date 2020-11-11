package cn.cigar.linkedlist;

/**
 * @author Cigar
 */
public class SingleLinkedListTest {

    public static void main(String[] args) {
        testSingleLinkedList();
    }


    /**
     * 测试单链表操作
     */
    private static void testSingleLinkedList() {
        SingleLinkedList linkedList = new SingleLinkedList();

        SingleHeroNode node1 = new SingleHeroNode(1, "加雪松", null);
        SingleHeroNode node2 = new SingleHeroNode(2, "林南松", null);
        SingleHeroNode node3 = new SingleHeroNode(3, "郑紫琴", null);
        SingleHeroNode node4 = new SingleHeroNode(4, "傅贝贝", null);

        linkedList.add(node1);
        linkedList.add(node2);
        linkedList.add(node3);
        linkedList.add(node4);

        linkedList.list();

        System.out.println("删除order为4的节点");
        linkedList.delete(4);
        linkedList.list();

        System.out.println("更新order为3的节点");
        SingleHeroNode node = new SingleHeroNode(3, "李安然", null);
        linkedList.update(node);
        linkedList.list();

        System.out.println("计算链表的长度");
        int length = SingleLinkedListInterview.getLength(linkedList);
        System.out.println("length = " + length);

        System.out.println("查询链表倒数第1个元素");
        SingleHeroNode indexNode = SingleLinkedListInterview.getLastIndexNode(linkedList, 1);
        System.out.println("delete = " + indexNode);
        linkedList.list();

        System.out.println("单链表反转1");
        SingleLinkedListInterview.reverse(linkedList);
        linkedList.list();

        System.out.println("单链表反转2");
        SingleLinkedListInterview.reverse2(linkedList);
        linkedList.list();

        System.out.println("逆序打印");
        SingleLinkedListInterview.reversePrint(linkedList);
    }

}
