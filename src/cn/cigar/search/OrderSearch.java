package cn.cigar.search;

/**
 * 顺序查找
 */
public class OrderSearch {

    /**
     * 顺序查找
     * @param arr
     */
    public static int orderSearch(int[] arr, int des) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == des) {
                return i;
            }
        }
        return -1;
    }
}
