import java.util.*;

/**
 * Created by Elí.Arizpe on 09/03/2020
 * Se leen N scanners y se imprimen con un numero
 */

public class EndOfFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        while (scanner.hasNext()) {
            String text = scanner.nextLine();
            System.out.println(i+" "+text);
            i++;
        }
    }
}
