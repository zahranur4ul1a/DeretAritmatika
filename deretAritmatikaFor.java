package perulangan;

import java.util.Scanner;

public class deretAritmatikaFor {
    public static void main(String[] args) {
        int n, a, b, hasil;
        Scanner s = new Scanner(System.in);
        System.out.println("Masukkan suku pertama: ");
        a = s.nextInt();
        System.out.println("Masukkan jumlah suku: ");
        n = s.nextInt();
        System.out.println("Masukkan beda: ");
        b = s.nextInt();
        
        for (int i = 1; i <=n ; i++) {
            hasil = a+(i-1)*b;
            System.out.println("suku ke- "+i+"bernilai: " +hasil);


            
        }
    }
    
}
