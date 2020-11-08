package cn.cigar.linkedlist;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class DoubleLinkedListTest {

    public static void main(String[] args) {
        testDoubleLinkedList();
    }

    private static void testDoubleLinkedList() {
        DoubleLinkedList linkedList = new DoubleLinkedList();

        DoubleHeroNode node1 = new DoubleHeroNode(1, "涂俊");
        DoubleHeroNode node2 = new DoubleHeroNode(2, "李安然");
        DoubleHeroNode node3 = new DoubleHeroNode(3, "马田");
        DoubleHeroNode node4 = new DoubleHeroNode(4, "朱维娇");

        linkedList.add(node1);
        linkedList.add(node2);
        linkedList.add(node3);
        linkedList.add(node4);
        linkedList.list();


        System.out.println("删除节点3");
        linkedList.delete(3);
        linkedList.list();

        System.out.println("更新节点4");
        DoubleHeroNode node = new DoubleHeroNode(4, "大力骄");
        linkedList.update(node);
        linkedList.list();
    }
}
