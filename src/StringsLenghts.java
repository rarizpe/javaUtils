import java.util.Scanner;
/**
 * Created by Elí.Arizpe on 13/03/2020
 * Clase que te dice si un numero es primo o no
 * InputEjemplo: 6457356846784679578983545624635875780675673456784758096564524567845786909787
 */
public class StringsLenghts {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);) {
            System.out.println(scanner.nextBigInteger().isProbablePrime(100) ? "prime" : "not prime");
        }
    }
}