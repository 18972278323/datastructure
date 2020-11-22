package cn.cigar.sort;

/**
 * 选择排序
 * @author Cigar
 */
public class SelectSort {

    /**
     * 选择排序
     * @param array 要排序的数组
     */
    public static void selectSort(int[] array) {
        int tmp = 0;
        int minIndex = 0;

        for (int i = 0; i < array.length - 1; i++) {
            minIndex = i;
            // 记录本轮最小值索引
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]){
                    minIndex = j;
                }
            }

            // 交换第i为何minIndex为元素
            tmp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = tmp;
        }
    }


    /**
     * 选择排序优化
     * 优化思路：如果内存遍历结束后，最小值的索引未发生改表，则不执行本次值交换
     * @param array 要排序的数组
     */
    public static void selectSortOptimize(int[] array) {
        int tmp = 0;
        int minIndex = 0;

        for (int i = 0; i < array.length - 1; i++) {
            minIndex = i;
            // 记录本轮最小值索引
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            // 如果最小值索引不是i 再执行本轮交换操作
            if (minIndex != i) {
                tmp = array[minIndex];
                array[minIndex] = array[i];
                array[i] = tmp;
            }
        }
    }
}
