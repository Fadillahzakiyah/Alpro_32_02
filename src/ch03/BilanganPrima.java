package ch03;

import java.util.Scanner;

public class BilanganPrima {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan bilangan =");
        int angka = input.nextInt();

        int mod = 1;
        for(int a = 2; a < angka; a++){
            if(angka%a==0){
                mod = 0;
            }
        }
        if(mod==1){
            System.out.println(angka + " adalah Bilangan Prima");
        }
        else {
            System.out.println(angka + " adalah bukan Bilangan Prima");
        }
    }
}
