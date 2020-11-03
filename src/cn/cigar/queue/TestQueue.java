package cn.cigar.queue;

public class TestQueue {
    public static void main(String[] args) {
//        testArrayCircleQueue1();

        testArraySingleQueue();
    }

    public static void testArrayCircleQueue1() {
        ArrayCircleQueue1 q = new ArrayCircleQueue1(4);
        System.out.println(q.add(1));
        System.out.println(q.add(2));
        System.out.println(q.add(3));
        System.out.println(q.add(4));
        for(int i=0;i<4;i++){
            System.out.println(q.remove());
        }
    }


    private static void testArraySingleQueue() {
        ArraySingleQueue queue = new ArraySingleQueue(4);

        System.out.println(queue.add(1));
        System.out.println(queue.add(2));
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.add(3));
        System.out.println(queue.add(4));
        System.out.println(queue.add(5));

    }
}
