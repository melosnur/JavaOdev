package IlkHafta;

import java.util.Scanner;

public class RG01_BasamakDegerleriToplami {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int sayi = scan.nextInt();

        int toplam = 0;

        while(sayi !=0) {
            toplam = toplam + sayi%10;
            sayi = sayi/ 10;
        }


        System.out.println(toplam);
        }





}
