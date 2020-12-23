package cn.cigar.search;

public class FibonacciSearch {


    /**
     * 生成指定长度的斐波那契数列
     * @param length 长度
     * @return
     */
    public static int[] fibonacciArray(int length) {
        int[] array = new int[length];
        array[0] = 1;
        array[1] = 1;

        for (int i = 2; i < length; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }

        return array;
    }


    /**
     * 进行斐波那契查找
     * @param array
     * @param des
     * @return
     */
    public static int fibonacciSearch1(int[] array, int des) {
        int low = 0;
        int high = array.length - 1;
        int mid;
        int[] F = fibonacciArray(array.length);

        // 找到斐波那契数组中，大于等于查找数组长度的最小值的索引
        int k = 0;
        while (F[k] < array.length) {
            k++;
        }

        // 将数组的长度填充为F[k]长度，不够的补充最后一位
        int[] fillArray = new int[F[k]];
        System.arraycopy(array, 0, fillArray, 0, array.length);
        for (int i = array.length; i < F[k]; i++) {
            fillArray[i] = array[array.length - 1];
        }

        // 在填充后的数组中，依据黄金分割查找
        while (low <= high) {
            mid = low + F[k - 1] - 1;

            // 通过low,high控制区间，通过k控制个数
            if (fillArray[mid] > des) {
                high = mid - 1;
                k--;
            } else if (fillArray[mid] < des) {
                low = mid + 1;
                k-=2;
            } else {
                return Math.min(mid, high);
            }
        }

        return -1;
    }

}
