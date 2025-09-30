package IlkHafta;

import java.util.Scanner;

public class kalppp {

        public static void main(String[] args){
            double x,y;

            for ( y = 1.5; y > -1.5; y -= 0.1) {
                for ( x = -1.5; x < 1.5; x += 0.05) {
                    double a = x*x + y*y - 1;
                    // (x^2 + y^2 - 1)^3 - x^2 * y^3 <= 0 ise nokta kalp içinde
                    if (a*a*a - x*x*y*y*y <= 0) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }


