package perulangan;

import java.util.Scanner;

public class deretAritmatikaWhile {
    public static void main(String[] args) {
        int n, a, b, hasil, i = 1;
        Scanner s = new Scanner(System.in);
        System.out.println("Masukkan suku pertama: ");
        a = s.nextInt();
        System.out.println("Masukkan suku jumlah suku");
        n = s.nextInt();
        System.out.println("Masukkan beda: ");
        b = s.nextInt();

        while (i<=n) {
            hasil = a+(i-1)*b;
            System.out.println("suku ke- "+i+"bernilai: " +hasil);
            i++;
        }
    }
}
