package cn.cigar.sparsearray;

/**
 * @author Cigar
 */
public class sparseArray {

    public static void main(String[] args){
        // 1. 创建一个二维数组,用于表示棋盘的布局
        int[][] array = new int[11][11];
        array[1][2] = 1;
        array[2][4] = 2;
        array[5][6] = 2;

        // 预览二维数组
        System.out.println("原始二维数组:");
        printArray(array);

        // 2.将二维数组转换为松散数组
        System.out.println("松散数组转换结果:");
        int[][] sparseArray = toSparseArray(array);
        printArray(sparseArray);

        // 3. 将稀疏数组转换为普通二维数组
        System.out.println("逆转换后的二维数组:");
        int[][] convertArray = sparseArrayToArray(sparseArray);
        printArray(convertArray);
    }

    /**
     * 稀疏数组转换为普通数组
     * @param sparseArray 稀疏数组
     * @return
     */
    public static int[][] sparseArrayToArray(int[][] sparseArray) {
        int[][] array = new int[sparseArray[0][0]][sparseArray[0][1]];

        for (int i = 1; i < sparseArray.length; i++) {
            int[] line = sparseArray[i];
            array[line[0]][line[1]] = line[2];
        }

        return array;
    }

    /**
     * 将普通二维数组转化为稀疏数组
     * @param array
     * @return
     */
    public static int[][] toSparseArray(int[][] array) {
        // 计算特殊的个数
        int sum = 0;
        for (int[] line : array) {
            for (int item : line) {
                if (item > 0) {
                    sum++;
                }
            }
        }

        // 构造第一行
        int[][] sparseArray = new int[sum + 1][3];
        sparseArray[0][0] = array.length;
        sparseArray[0][1] = array[0].length;
        sparseArray[0][2] = sum;

        // 构造特殊值的行
        int count = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > 0) {
                    sparseArray[count][0] = i;
                    sparseArray[count][1] = j;
                    sparseArray[count][2] = array[i][j];
                    count++;
                }
            }
        }

        return sparseArray;
    }

    /**
     * 打印二维数组
     *
     * @param array 打印数组
     */
    public static void printArray(int[][] array) {
        for (int[] line : array) {
            for (int item : line) {
                System.out.printf("%d\t", item);
            }
            System.out.println();
        }
    }
}
