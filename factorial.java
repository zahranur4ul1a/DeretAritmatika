package perulangan;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        int angka, temp=1;
        Scanner s = new Scanner(System.in);
        System.out.println("Masukkan angka: ");
        angka = s.nextInt();
        for (int i = angka; i>=1; i--) {
            System.out.print(i+" x ");
            temp *=i;

        }
        System.out.println();
        System.out.println("Total factorial: "+temp);
    }
}
