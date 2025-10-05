package İkinciHafta;

import java.util.Scanner;

public class RG11_StrSonKarakterSilme {
    public static void main(String[] args) {
        // Kullanicidan alinan Stringin son karakterini silip ekrana Java kodunu yaziniz

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        String kelime = scanner.next();

        System.out.println(kelime.substring(0,kelime.length()-1));

    }
}
