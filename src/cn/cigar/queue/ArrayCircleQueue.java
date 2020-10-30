package cn.cigar.queue;

/**
 * 数组模拟循环队列
 *
 * @author Cigar
 * 为了能够区分出队列空或慢，约定预留一个单元的空间
 */
public class ArrayCircleQueue {

    /**
     * 队头指针
     */
    int front;

    /**
     * 队尾指针
     */
    int rear;

    /**
     * 当前队列元素数量
     */
    int maxSize;

    /**
     * 队列
     */
    int[] queue;

    public ArrayCircleQueue(int maxSize) {
        front = 0;
        rear = 0;
        this.maxSize = maxSize;
        queue = new int[maxSize];
    }

    public ArrayCircleQueue() {
        this(5);
    }

    /**
     * 添加元素
     * 从队尾添加，添加前先判断队列是否满队列
     * @param i 要添加的元素
     */
    public Integer add(int i) {
        if (isFull()){
            System.out.println("队列已满，无法添加数据");
            return null;
        }
        queue[rear] =  i;
        rear = (rear +1) % maxSize;

        return i;
    }

    /**
     * 删除元素
     * @return 移除的元素
     */
    public Integer remove() {
        if (isEmpty()){
            System.out.println("队列为空，无法移除数据");
            return null;
        }
        Integer res = queue[front];
        front = (front + 1) % maxSize;
        return res;
    }

    /**
     * 判断队列是否满
     * @return boolean
     */
    public boolean isFull() {
        return (rear + 1) % maxSize == front;
    }


    /**
     * 判断队列是否空
     * @return boolean
     */
    public boolean isEmpty() {
        return rear == front;
    }

    public static void main(String[] args) {
        ArrayCircleQueue q = new ArrayCircleQueue(4);
        System.out.println(q.add(1));
        System.out.println(q.add(2));
        System.out.println(q.add(3));
        System.out.println(q.add(4));
        for(int i=0;i<4;i++){
            System.out.println(q.remove());
        }
    }

}
