package s;

import com.sun.source.tree.SynchronizedTree;

import java.util.Scanner;

public class feladat14 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Kérem:" );
        String szoveg =sc.nextLine();
        String menuPont="";
        while (menuPont.equals(("f"))){
            System.out.println("Adja meg mit akar csinálni a szöveggel: ");
            System.out.println("\ta Nagybetű-");
            System.out.println("\tb - Kisbetű");
            System.out.println("\tc - Lekérdezni a hosszát");
            System.out.println("\td - Összehasonlítani egy másik szöveggel");
            System.out.println("\te - A szöveg egy részét kiirni");
            System.out.println("\tf - Kilépni");

        }
    }
}
