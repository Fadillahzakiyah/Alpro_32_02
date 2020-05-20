package ch09;

import java.util.Scanner;

public class AlgoritmaAKSPrimalityTest {
    public static long k[] = new long[1000];
    public static void koefesien(int lim){
        k[0] = 1;
        for(int a = 0; a < lim; k[0] = -k[0], a++){
            k[1+a] = 1;
            for(int b = a; b > 0; b--)
                k[b] = k[b-1]-k[b];
        }
    }
    public static boolean prima(int lim){
        koefesien(lim);
        k[0]++;
        k[lim]--;
        int a = lim;
        while((a--)>0&&k[a]%lim==0);
        return a < 0;
    }
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan bilangan");
        int lim = input.nextInt();
        if(prima(lim))
            System.out.println("Prima");
        else
            System.out.println("Bukan Prima");
    }
}
