package cn.cigar.sort;

/**
 * 快速排序
 * @author asus
 */
public class QuickSort {

    public static void quickSort(int[] arr) {
        QuickSort.quickSort(arr, 0, arr.length-1);
    }

    /**
     * 快速排序
     * @param arr
     * @param left
     * @param right
     */
    public static void quickSort(int[] arr, int left, int right) {
        int l = left;
        int r = right;
        int tmp;
        int pivot = arr[(left + right)/2];

        while (l < r) {
            // 分别找到大于等于基准值 和 小于等于基准值，进行互换
            while (arr[l] < pivot) {
                l++;
            }
            while (arr[r] > pivot) {
                r--;
            }

            if (l == r) {
                break;
            }

            tmp = arr[l];
            arr[l] = arr[r];
            arr[r] = tmp;

            // 避免当值与基准值相同时出现死循环
            if (arr[l] == pivot) {
                r--;
            }
            if (arr[r] == pivot) {
                l++;
            }
        }

        // 从中电分别向左、向右递归
        if (left < l) {
            quickSort(arr, left, l - 1);
        }
        if (r < right) {
            quickSort(arr, r + 1, right);
        }
    }
}
