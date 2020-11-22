package cn.cigar.sort;

/**
 * 希尔排序
 * @author Cigar
 */
public class ShellSort {

    /**
     * 希尔排序
     * @param array 要排序的数组
     */
    public static void shellSort(int[] array) {
        int tmp = 0;
        // 决定每次步进值，为1时表示排序结束
        for (int step = array.length / 2; step > 0; step /= 2) {
            // 决定分的组数
            for (int i = step; i < array.length; i++) {
                // 处理每个组内部的排序
                for (int j = i - step; j >= 0; j -= step) {
                    if (array[j] > array[j + step]){
                        tmp = array[j];
                        array[j] = array[j + step];
                        array[j + step] = tmp;
                    }
                }
            }
        }
    }
}
