package cn.cigar.search;

import cn.cigar.sort.QuickSort;

import java.util.Arrays;

public class TestSearch {

    public static void main(String[] args) {
        int des = 2;
//        int[] array = {-6, 4, 0, 34, 107, -4, 40, 2, -8, 10};
        int[] array = {1, 2, 3, 4, 5, 6, 7};

        QuickSort.quickSort(array);

//        int index = OrderSearch.orderSearch(array, des);
        int index = InsertValueSearch.insertValueSearch1(array, des);
        if (index != -1) {
            System.out.printf("在[%s]找到[%d]的位置是[%d]\n", Arrays.toString(array), des, index);
        } else {
            System.out.printf("在[%s]没找到[%d]\n", Arrays.toString(array), des);
        }
    }

}
