package IlkHafta;

import java.util.Scanner;

public class RG06_SesliSessizHarfBulma {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        char harf = scan.next().charAt(0);

        if (harf == 'a' || harf == 'e' || harf == 'i' || harf == 'ı' ||
                harf == 'o' || harf == 'ö' || harf == 'u' || harf == 'ü') {
            System.out.println("Sesli Harf");
        } else if (harf >= 'a' && harf <= 'z') {
            System.out.println("Sessiz Harf");
        } else {
            System.out.println("Geçersiz karakter, lütfen bir harf giriniz.");
        }
    }
        }


