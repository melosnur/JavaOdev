package İkinciHafta;

import java.util.Scanner;

public class RG19_ArtikYil {
    public static void main(String[] args) {
        // Kullanici tarafindan girilen bir yilin
        // artik yil olup olmadigini kontrol etmek icin bir JAVA kod yaziniz.

        Scanner scanner =new Scanner(System.in);
        System.out.println("Lutfen ogrenmek istediginiz yili girin...");
        int yil = scanner.nextInt();

        if (yil %4==0){
            if (yil %100==0 && yil%400 !=0){
                System.out.println("Girdiginiz yil artik yil degildir");
            } else System.out.println("Girdiginiz yil artik yildir");
            } else System.out.println("Girdiginiz yil artik yil degildir");
        }
    }

