package cn.cigar.recursion;

public class RecursionTest {

    public static void main(String[] args) {
        print(5);
    }


    private static void print(int n) {
        if (n > 2) {
            print(n - 1);
        }
        System.out.println("n = " + n);
    }
}
