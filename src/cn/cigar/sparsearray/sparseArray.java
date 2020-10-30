package cn.cigar.sparsearray;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Cigar
 */
public class sparseArray {

    public static void main(String[] args) throws IOException {

        // 1. 创建一个二维数组,用于表示棋盘的布局
        int [][] array1 = new int[11][11];
        array1[1][2] = 1;
        array1[2][4] = 2;
        array1[5][6] = 2;

        // 预览二维数组
        System.out.println("原始二维数组:");
        printArray(array1);

        String array1File = "D:\\SoftWare\\JavaDevelop\\WorkSpace\\datastructure\\src\\array1.data";
        writeToFile(array1, array1File);
        long length = new File(array1File).length();
        System.out.printf("[%s]的数据写入文件，其大小为[%s]b", "array1", length);

        int sum = 0;
        for (int[] line : array1) {
            for (int item : line) {
                if (item > 0 ){
                    sum++;
                }
            }
        }
        System.out.println();
        System.out.println("特殊值的总数：" + sum);

        // 2.将二维数组转换为松散数组
        int[][] sparseArray = new int[sum + 1][3];

        sparseArray[0][0] = array1.length;
        sparseArray[0][1] = array1[0].length;
        sparseArray[0][2] = sum;

        int count = 1;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                if (array1[i][j] > 0) {
                    sparseArray[count][0] = i;
                    sparseArray[count][1] = j;
                    sparseArray[count][2] = array1[i][j];
                    count++;
                }
            }
        }

        System.out.println("松散数组转换结果:");
        printArray(sparseArray);

        String sparseArrayPath = "D:\\SoftWare\\JavaDevelop\\WorkSpace\\datastructure\\src\\sparseArray.data";
        writeToFile(sparseArray, sparseArrayPath);
        length = new File(sparseArrayPath).length();
        System.out.printf("[%s]的数据写入文件，其大小为[%s]b", "sparseArray", length);


        // 3. 将稀疏数组转换为普通二维数组
        int[][] array2 = new int[sparseArray[0][0]][sparseArray[0][1]];

        for (int i = 1; i < sparseArray.length; i++) {
            int[] line = sparseArray[i];
            array2[line[0]][line[1]] = line[2];
        }

        System.out.println();
        System.out.println("逆转换后的二维数组：");
        printArray(array2);
    }

    /**
     * 将二维数组写入文件
     * @param array 普通二维数组
     */
    public static void writeToFile(int[][] array, String filePath) throws IOException {
        File descFile = new File(filePath);

        if (!descFile.exists()) {
            boolean newFile = descFile.createNewFile();
        }

        FileWriter writer = new FileWriter(filePath);

        StringBuilder lineStr = new StringBuilder();
        for (int[] line : array) {
            for (int item : line) {
                lineStr.append(item).append(" ");
            }
            lineStr.append("\n");
        }
        writer.write(lineStr.toString());
        writer.close();

    }

    /**
     * 打印二维数组
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
