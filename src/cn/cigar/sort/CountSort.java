package cn.cigar.sort;

import java.util.Arrays;

/**
 * 计数排序
 * @author asus
 */
public class CountSort {

    public static int[] countSort(int[] arr) {

        // 求出最大值
        int maxValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }

        // 开始计数
        int[] countArray = new int[maxValue + 1];
        for (int i = 0; i < arr.length; i++) {
            countArray[arr[i]]++;
        }

        // 还原数组
        int index = 0;
        int[] tmp = new int[arr.length];
        for (int i = 0; i < countArray.length; i++) {
            for (int j = 0; j < countArray[i]; j++) {
                tmp[index++] = i;
            }
        }

        return tmp;
    }
}
