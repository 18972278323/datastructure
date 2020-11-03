package cn.cigar.queue;

/**
 * 单向队列
 */
public class ArraySingleQueue {

    /**
     * 头指针
     */
    int front;

    /**
     * 尾指针
     */
    int rear;

    /**
     * 最大长度
     */
    int maxSize;

    /**
     * 队列
     */
    Object[] queue;

    public ArraySingleQueue(int maxSize){
        this.front = 0;
        this.rear = 0;
        this.maxSize = maxSize;
        queue = new Object[maxSize];
    }

    public boolean isFull() {
        return this.rear >= this.maxSize;
    }

    public boolean isEmpty() {
        return this.front == this.rear;
    }

    public Object add(Object o) {
        if (isFull()){
            System.out.println("队列已满，无法添加数据");
            return null;
        }
        queue[this.rear] = o;
        this.rear ++;
        return o;
    }

    public Object pop() {
        if (isEmpty()) {
            System.out.println("队列已空，无法移除数据");
            return null;
        }
        Object o = this.queue[this.front];
        this.front++;
        return o;
    }
}
