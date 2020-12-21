package cn.cigar.search;

public class BinarySearch {

    public static int binarySearch1(int[] array, int des) {
        return binarySearch1(array, des, 0, array.length - 1);
    }

    /**
     * 通过递归实现折半查找，适用于有序数组
     * @param array
     * @param des
     * @return
     */
    public static int binarySearch1(int[] array, int des, int start, int end) {
        if (start > end) {
            return -1;
        }
        // 0 1 2
        int mid = (start + end) / 2;
        if (array[mid] > des) {
            return binarySearch1(array, des, start, mid - 1);
        } else if (array[mid] < des) {
            return binarySearch1(array, des, mid + 1, end);
        } else {
            return mid;
        }
    }


    /**
     * 非递归实现折半查找
     * @param array
     * @param des
     * @return
     */
    public static int binarySearch2(int[] array, int des) {
        int start = 0;
        int end = array.length - 1;
        int mid;

        while (start <= end) {
            mid = (start + end) / 2;

            if (array[mid] < des) {
                start = mid + 1;
            } else if (array[mid] > des) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
