package cn.cigar.queue;


/**
 * @author Cigar
 */
public class ArrayCircleQueue2 {

    /**
     * 表示队列中的元素个数
     */
    int size;

    /**
     * 最大长度
     * 也可省略使用 queue.length
     */
    int maxSize;

    /**
     * 头指针，指向第一个元素
     */
    int rear;

    /**
     * 尾指针，指向最后一个元素后面一位
     */
    int front;

    /**
     * 使用数组模拟的队列
     */
    Object[] queue;

    public ArrayCircleQueue2(int maxSize) {
        this.maxSize = maxSize;
        this.size = 0;
        this.front = 0;
        this.rear = 0;
        this.queue = new Object[maxSize];
    }

    /**
     * rear % maxSize == front 可能为空也可能为满
     * @return 队列是否为满
     */
    public boolean isFull() {
        return this.size == this.maxSize;
    }

    /**
     * rear % maxSize == front 可能为空也可能为满，需要保证size
     * @return 队列是否为空
     */
    public boolean isEmpty() {
        return this.size == 0;
    }

    /**
     * 向队列添加元素
     * @param o 要添加的元素
     * @return 添加成功的元素
     */
    public Object add(Object o) {
        if (isFull()){
            System.out.println("队列已满，无法添加");
            return null;
        }
        queue[this.rear] = o;
        this.rear = (this.rear + 1) % this.maxSize;
        this.size ++;
        return o;
    }

    /**
     * 移除一个元素
     * @return 移除的元素
     */
    public Object remove() {
        if (isEmpty()) {
            System.out.println("队列已空，无法移除");
            return null;
        }
        Object o = queue[this.rear];
        this.rear = (this.rear + 1) % this.maxSize;
        this.size --;
        return o;
    }

    public static void main(String[] args) {
        ArrayCircleQueue2 q = new ArrayCircleQueue2(4);
        System.out.println(q.add(1));
        System.out.println(q.add(2));
        System.out.println(q.add(3));
        System.out.println(q.add(4));
        System.out.println(q.add(5));
        for(int i=0;i<5;i++){
            System.out.println(q.remove());
        }
    }
}
