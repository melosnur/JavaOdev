package İkinciHafta;

import java.util.Scanner;

public class RG17_UcSayidanEnKucukEnBuyukBulma {
    public static void main(String[] args) {
        // Uc sayi arasinda en kucuk sayiyi bulmak icin vir JAVA Method yazin

        enKucuk();

    }

    public static void enKucuk(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("1.Sayiyi giriniz");
        int sayi1 = scanner.nextInt();
        System.out.println("2.Sayiyi giriniz");
        int sayi2 = scanner.nextInt();
        System.out.println("3.Sayiyi giriniz");
        int sayi3 = scanner.nextInt();


        System.out.println("En kucuk sayi : ");
        System.out.println(sayi1<sayi2 ? (sayi1<sayi3 ? sayi1:sayi3):(sayi2<sayi3 ? sayi2:sayi3));
    }
}
