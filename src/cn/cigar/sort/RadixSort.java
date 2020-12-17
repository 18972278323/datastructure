package cn.cigar.sort;

/**
 * 基数排序
 * @author asus
 */
public class RadixSort {

    /**
     * 计数排序
     * @param arr
     */
    public static void radixSort(int[] arr) {

        // 根据最大值的位数判断外层循环几次
        int maxValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        int maxLength = String.valueOf(maxValue).length();

        int[][] buckets = new int[10][arr.length];
        int[] bucketsCount = new int[10];

        for (int i = 0, n = 1; i < maxLength; i++, n *= 10) {
            // 每一位数进行一轮处理
            for (int j = 0; j < arr.length; j++) {
                // 将该数值放入指定的桶
                int bucketIndex = arr[j] / n % 10;
                buckets[bucketIndex][bucketsCount[bucketIndex]++] = arr[j];
            }

            // 一轮放完之后，数据取出放回原数组
            int index = 0;
            for (int x = 0; x < 10; x++) {
                for (int y = 0; y < bucketsCount[x]; y++) {
                    arr[index++] = buckets[x][y];
                }
                // 放完后将计数清零
                bucketsCount[x] = 0;
            }
        }

    }

}
