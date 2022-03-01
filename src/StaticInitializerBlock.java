import java.util.*;
/**
 * Created by Elí.Arizpe on 10/03/2020
 * Paralelograma con Amplitud y Altura usando solo funciones statics inicializar variables estaticas y un constructor estatico para imprimir area
 */

public class StaticInitializerBlock {

    static boolean flag = true;
    static int B,H;

    static{
        Scanner sc = new Scanner(System.in);
        B = sc.nextInt(); H = sc.nextInt(); boolean flag = true;
        if(B<=0 || H<=0){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            flag = false;
            System.exit(0);
        }
    }

    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.println(area);
        }
    }
}
