package İkinciHafta;

import java.util.Scanner;

public class RG18_SesliHarfSayanCode {
    public static void main(String[] args) {
        // Girilen stringdeki tum sesli harfleri saymak icin bir java methodu yaziniz

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int sesli = 0;

        for (int i=0; i<str.length(); i++){
            char harf = str.toLowerCase().charAt(i);
            if (harf == 'a' || harf =='e' || harf == 'i' || harf == 'o' || harf == 'u'){
                sesli ++;
            }
        }
        System.out.println("Girilen cumle veya kelimedeki sesli harf sayisi : " + sesli);
    }
}
