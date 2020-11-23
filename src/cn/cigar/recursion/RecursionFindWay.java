package cn.cigar.recursion;

import java.util.Arrays;

public class RecursionFindWay {

    public static void main(String[] args) {

        int[][] array = init();

        // 起点为 (1,1)
        isPass(array, 1, 1);

        print(array);

    }

    /**
     * 探索路径是否可行
     * @param array 棋盘
     * @param x 横向索引
     * @param y 纵向索引
     * @return 棋盘
     */
    private static boolean isPass(int[][] array, int x, int y) {
        // 1：墙  2：可通行 3：不可通行
        if (array[8][8] == 2) {
            // 终点为 (8,8)
            return true;
        }

        // 当前节点没走过，
        if (array[x][y] == 0){
            // 假设当前节点可用，继续往下走
            array[x][y] = 2;

            // 按照此顺序【下、右、上、左】走
            if (isPass(array, x+1, y)) {
                return true;
            } else if (isPass(array, x, y+1)) {
                return true;
            } else if (isPass(array, x, y - 1)) {
                return true;
            } else if (isPass(array, x - 1, y)) {
                return true;
            } else {
                array[x][y] = 3;
                return false;
            }
        } else {
            return false;
        }
    }


    /**
     * 初始化一个二维数组，为1的部分表示该地点为墙不可通行
     * @return
     */
    private static int[][] init() {
        int[][] array = new int[10][10];

        // 设置边框为1，表示无法通行
        for (int i = 0; i < array.length; i++) {
            array[i][0] = 1;
            array[i][9] = 1;
        }
        for (int i = 0; i < array.length; i++) {
            array[0][i] = 1;
            array[9][i] = 1;
        }

        array[3][1] = 1;
        array[3][2] = 1;
        return array;
    }

    /**
     * 打印二维数组
     * @param array
     */
    private static void print(int[][] array) {
        for (int[] ints : array) {
            System.out.println(Arrays.toString(ints));
        }
    }

}
