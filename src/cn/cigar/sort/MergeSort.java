package cn.cigar.sort;

/**
 * 归并排序
 * @author asus
 */
public class MergeSort {
    public static void mergeSort(int[] arr) {
        int[] tmp = new int[arr.length];
        mergeSort(arr, 0, arr.length - 1, tmp);
    }


    /**
     * 归并排序
     * @param arr 要排序的数组
     * @param left 左边界索引
     * @param right 有边界索引
     * @param tmp 临时数组
     */
    public static void mergeSort(int[] arr, int left, int right, int[] tmp) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(arr, left, mid, tmp);
            mergeSort(arr, mid +1, right, tmp);

            merge(arr, left, mid, right, tmp);
        }
    }

    /**
     * 合并并排序
     * @param arr 要处理的数组
     * @param left 左边界索引
     * @param mid 中间索引
     * @param right 右边界索引
     * @param tmp 临时数组
     */
    public static void merge(int[] arr, int left, int mid, int right, int[] tmp) {
        int i = left;
        int j = mid + 1;
        int t = 0;

        // 将原数组左右两端合并在临时数组，知道一端数据合并完毕
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                tmp[t++] = arr[i++];
            } else {
                tmp[t++] = arr[j++];
            }
        }

        // 将剩下的元素合并到临时数组
        while (i <= mid) {
            tmp[t++] = arr[i++];
        }
        while (j <= right) {
            tmp[t++] = arr[j++];
        }

        // 将临时数组中的数据复制回原数组
        int arrIndex = left;
        int tmpIndex = 0;
        while (arrIndex <= right) {
            arr[arrIndex++] = tmp[tmpIndex++];
        }

    }
}
