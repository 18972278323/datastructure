package cn.cigar.linkedlist;

import com.sun.istack.internal.Nullable;

public class DoubleHeroNode {

    private DoubleHeroNode pre;

    private int order;

    private Object data;

    private DoubleHeroNode next;

    @Override
    public String toString() {
        return "DoubleHeroNode{" +
                "order=" + order +
                ", data=" + data +
                '}';
    }

    public DoubleHeroNode getPre() {
        return pre;
    }

    public void setPre(DoubleHeroNode pre) {
        this.pre = pre;
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

    public DoubleHeroNode getNext() {
        return next;
    }

    public void setNext(DoubleHeroNode next) {
        this.next = next;
    }

    public DoubleHeroNode(DoubleHeroNode pre, int order, Object data, DoubleHeroNode next) {
        this.pre = pre;
        this.order = order;
        this.data = data;
        this.next = next;
    }

    public DoubleHeroNode(int order, Object data) {
        this.order = order;
        this.data = data;
    }

    public DoubleHeroNode() {
    }
}
