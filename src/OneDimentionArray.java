import java.util.Scanner;

/**
 * Created by Elí.Arizpe on 10/03/2020
 * clasa que lee N valores que se le diga y luego se llena con valores el array, para luego pintarlos en orden
 * Ejemplo de Input: 5(array de 5 espacios) 10 20 30 40 50 output: 10 20 30 40 50
 */

public class OneDimentionArray {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i]=scan.nextInt();
        }
        scan.close();

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
