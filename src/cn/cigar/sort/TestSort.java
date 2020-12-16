package cn.cigar.sort;

import java.util.Arrays;

/**
 * 测试数组的排序
 * @author Cigar
 */
public class TestSort {
    public static void main(String[] args) throws InterruptedException {
        // 测试10个元素排序并查看打印效果
//        int[] array10 = {-6, 4, 0, 34, 107, -4, 40, 2, -8, 10};
        int[] array10 = {-6, 4, 0, 34};
        System.out.println("排序前:");
        System.out.println(Arrays.toString(array10));
        MergeSort.mergeSort(array10);
        System.out.println("排序后:");
        System.out.println(Arrays.toString(array10));


        // 测试8W元素排序时间
        int arrayLength = 80000000;
        int[] array8w = new int[arrayLength];
        for (int i = 0; i < array8w.length; i++) {
            array8w[i] = (int)(Math.random() * 1000000);
        }

        long start = System.currentTimeMillis();
        MergeSort.mergeSort(array8w);
        long end = System.currentTimeMillis();
//        System.out.println(Arrays.toString(array8w));
        System.out.printf("排序[%s]个元素用时间[%s]毫秒，合计[%s]秒\n",  arrayLength, end - start, (end - start)/1000);
    }
}
