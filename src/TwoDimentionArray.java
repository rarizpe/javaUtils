import java.util.*;

/**
 * Created by Elí.Arizpe on 10/03/2020
 * Programa que llena un Array de 6*6 que lee valores en forma de reloj: para luego hacer una suma de ese reloj y saber cual de todos los relojes es la mayor suma
 * 1 1 1 0 0
 * 0 1 0 0 0
 * 1 1 1 0 0
 * 2 2 2 0 0
 * 0 5 0 0 0
 * 2 2 2 0 0
 * ejemplo de input: 1 1 1 0 0 0 0 1 0 0 1 1 1 0 0 2 2 2 0 0 0 5 0 0 0 2 2 2 0 0 0 0 0 0 0 output: 13
 */

public class TwoDimentionArray {
    public static void main(String[] args) {
        int a[][] = new int[6][6];
        int maxSum = Integer.MIN_VALUE;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                a[i][j] = scanner.nextInt();
                if (i > 1 && j > 1) {
                    int sum = a[i][j]
                                    + a[i][j - 1]
                                    + a[i][j - 2]
                                    + a[i - 1][j - 1]
                                    + a[i - 2][j]
                                    + a[i - 2][j - 1]
                                    + a[i - 2][j - 2];
                    if (sum > maxSum) {
                        maxSum = sum;
                        System.out.println(maxSum);
                    }
                }
            }
        }
        System.out.println(maxSum);
    }
}