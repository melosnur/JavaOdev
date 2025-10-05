package IlkHafta;

import java.util.Scanner;

public class RG15_StrIstenilenKarakteriYazdirma {
    public static void main(String[] args) {
        // Girilen String deger icinde istenen siradaki karakteri bulan java kodu yaziniz

        Scanner scanner = new Scanner(System.in);
        System.out.println("Girmek istediginiz cumle veya kelimeyi giriniz.");
        String str = scanner.nextLine();
        System.out.println("Girdiginiz kelimenin veya cumleninme istediginiz siradaki karakter sirasini girin");
        int sira = scanner.nextInt();

        System.out.println(sira + ". siradaki karakter : " +  str.substring(sira-1,sira));
    }
}
