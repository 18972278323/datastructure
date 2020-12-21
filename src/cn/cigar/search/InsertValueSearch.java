package cn.cigar.search;

public class InsertValueSearch {

    public static int insertValueSearch1(int[] arr, int des) {
        return insertValueSearch1(arr, des, 0, arr.length - 1);
    }

    /**
     * 插值法查找，递归方式
     * @param arr
     * @param des
     * @param low
     * @param high
     * @return
     */
    public static int insertValueSearch1(int[] arr, int des, int low, int high) {

        // 避免越界
        if (low > high || des < arr[0] || des > arr[arr.length - 1]) {
            return -1;
        }

        // 额外判断相等情况，避免计算插值时出错
        if (low == high) {
            if (arr[low] == des) {
                return low;
            }
            return -1;
        }

        int mid = low + (high - low) / (arr[high] - arr[low]) * (des - arr[low]);
        if (arr[mid] > des) {
            return insertValueSearch1(arr, des, low, mid - 1);
        } else if (arr[mid] < des) {
            return insertValueSearch1(arr, des, mid + 1, high);
        } else {
            return mid;
        }
    }


    /**
     * 插值查找，非递归方式
     * @param arr
     * @param des
     * @return
     */
    public static int insertValueSearch2(int[] arr, int des) {
        int low = 0;
        int high = arr.length - 1;
        int mid;

        while (low <= high && des <= arr[arr.length - 1] && des >= arr[0]) {
            // 指针相等时单独判断，避免计算插值报错
            if (low == high) {
                if (arr[low] == des) {
                    return low;
                }
                return -1;
            }

            mid = low + (high - low) / (arr[high] - arr[low]) * (des - arr[low]);
            if (arr[mid] > des) {
                high = mid - 1;
            } else if (arr[mid] < des){
                low = mid + 1;
            } else {
                return mid;
            }

        }
        return -1;
    }
}
