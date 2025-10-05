package İkinciHafta;

import java.util.Scanner;

public class RG13_StrPalindrome {
    public static void main(String[] args) {
        //Bir palindrome, madam,ada,ece gibi
        // ileriye dogru geriye dogru okuyan bir kelime,sayi,kelime obegi veya diger karakter dizisidir.
        // Girilen kodun polindrome olup olmadigini dogrulayack bir java kod yazin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Polindrome kontrolu icin bir kelime veya cumle giriniz : ");
        String str = scanner.nextLine();

        String tersten = "";
        String arr[] = str.split("");
        for (int i = str.length()-1; i>0; i--){
             tersten +=  arr[i];
        }
        if (tersten.equalsIgnoreCase(str)){
            System.out.println("Girilen kelime veya cumle polindrome'dur");
        } else System.out.println("Girilen kelime veyaz cumle polindrome degil");
    }
}
