package cn.cigar.search;

public class TestSearch {

    public static void main(String[] args) {
        int des = 4;
        int[] array = {-6, 4, 0, 34, 107, -4, 40, 2, -8, 10};

        int index = OrderSearch.orderSearch(array, des);
        if (index != -1) {
            System.out.printf("找到[%d]的位置是[%d]\n", des, index);
        } else {
            System.out.printf("没找到[%d]\n", des);
        }
    }

}
