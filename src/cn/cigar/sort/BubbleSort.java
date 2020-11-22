package cn.cigar.sort;

/**
 * 实现数组的冒泡排序
 * @author Cigar
 */
public class BubbleSort {

    /**
     * 冒泡排序
     * @param array 要排序的数组
     */

    public static void bubbleSort(int[] array) {
        int tmp = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]){
                    tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
    }


    /**
     * 冒泡排序优化
     * 优化思路：如果一趟外层循环完毕没有发生元素交换，说明元素已经有序，退出即可
     * @param array 要排序的数组
     */
    public static void bubbleSortOptimize(int[] array) {
        int tmp = 0;
        boolean orderFlag = false;
        for (int i = 0; i < array.length - 1; i++) {
            // 假设本次循环数组已经有序
            orderFlag = true;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]){
                    tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;

                    // 发生元素交换则标记为无序
                    orderFlag = false;
                }
            }

            // 如果本轮未发生元素交换，说明已经有序，退出即可
            if (orderFlag){
                break;
            }
        }
    }
}
