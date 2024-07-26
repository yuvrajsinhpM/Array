import java.util.Scanner;

public class Array5 {
    public static void main(String[] args) {
        var A = new Scanner(System.in);
        System.out.println("Enter How much size Of Array You Want:");
        int ArSize = A.nextInt();
        int arrayval[][] = new int[ArSize][ArSize];
        int sum = 0;
        for (int i = 0; i < ArSize; i++) {
            for (int j = 0; j < ArSize; j++) {
                System.out.print("Enter The Value of A[" + i + "][" + j + "]");
                arrayval[i][j] = new Scanner(System.in).nextInt();
                if (i == j) {
                    sum += arrayval[i][j];
                }
            }
            System.out.println();
        }
System.out.println("Sum Of Daigonal Is " + sum);
    }
}
