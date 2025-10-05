package İkinciHafta;

import java.util.Scanner;

public class RG12_StrBuyukHarfeCevirme {
    public static void main(String[] args) {
        //Kullanicinin girdigi string degerleri buyuk harfe cevirme

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle = scanner.nextLine();
        System.out.println(cumle.toUpperCase());

    }
}
