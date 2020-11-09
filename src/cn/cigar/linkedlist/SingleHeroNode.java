package cn.cigar.linkedlist;

class SingleHeroNode {
    private int order;

    private Object data;

    private SingleHeroNode next;

    public SingleHeroNode(int order, Object data, SingleHeroNode next) {
        this.order = order;
        this.data = data;
        this.next = next;
    }

    public SingleHeroNode() { }

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

    public SingleHeroNode getNext() {
        return next;
    }

    public void setNext(SingleHeroNode next) {
        this.next = next;
    }
}
