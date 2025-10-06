package İkinciHafta;

import java.util.Scanner;

public class RG16_StrBuyukHarfeCevirme {
    public static void main(String[] args) {
        // Girilen stringdeki tum karakterleri buyuk harfe donusturmek icin bir java programi yazin
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen cumle yada kelime giriniz.");
        String str = scanner.nextLine();
        System.out.println(str.toUpperCase());

    }
}
