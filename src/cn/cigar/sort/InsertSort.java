package cn.cigar.sort;

/**
 * 插入排序
 * @author Cigar
 */
public class InsertSort {

    /**
     * 插入排序
     * @param array 要排序的数组
     */
    public static void insertSort(int[] array) {
        int tmp = 0;
        // 视第一个元素为有序
        for (int i = 1; i < array.length; i++) {
            // 该值会被覆盖，所以临时保存
            tmp = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > tmp){
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = tmp;
        }
    }

    /**
     * 插入排序优化
     * 优化思路：退出内层循环后，内层指针如果是否起始位置说明有序，无需赋值
     * @param array
     */
    public static void insertSortOptimize(int[] array) {
        int tmp = 0;
        for (int i = 1; i < array.length; i++) {
            tmp = array[i];
            int j = i - 1;
            // 寻找需要插入的位置记录
            while (j >= 0 && array[j] > tmp){
                array[j + 1] = array[j];
                j--;
            }

            // 如果退出循环后j指针发生变化，再赋值
            if (j + 1 != i) {
                array[j + 1] = tmp;
            }
        }
    }

}
