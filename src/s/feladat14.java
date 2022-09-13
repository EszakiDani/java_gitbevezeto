package s;

import com.sun.source.tree.SynchronizedTree;

import java.sql.SQLOutput;
import java.util.Locale;
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
            System.out.println("Adja meg a menüpontot: ");
            menuPont = sc.nextLine().toLowerCase();
            switch (menuPont){
                case "a":
                    System.out.println(szoveg.toUpperCase());
                    break;
                case "b":
                    System.out.println(szoveg.toLowerCase());
                    break;
                case "c":
                    System.out.printf("A szöveg hossza %d karakter\n",szoveg.length());
                    break;
                case "d":
                    System.out.print ("Kérem adja meg a másik szöveg");
                    String szoveg2 = sc.nextLine();
                    int osszehasonlitas= szoveg.compareTo(szoveg2);
                    if (osszehasonlitas<0){
                        System.out.println("Az első szöveg van előrébb az ABC-ben");
                    }else if (osszehasonlitas> 0){
                        System.out.println("A második szöveg van előrébb az ABC-ben");
                    }else{
                        System.out.println("A két szöveg megegyezik");
                    }
                    break;
                case "e":
                    break;
                case "f":
                    System.out.println("Viszlát!");
                    break;
                default:
                    System.out.println("Rossz lehetőséget adott meg, kérem a menüpont közül válasszon!");
                    break;

            }

        }
    }
}
