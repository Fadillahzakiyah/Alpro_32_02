package ch03;

import java.util.Scanner;

public class NilaiTinggi2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan nilai x =");
        int x = input.nextInt();
        System.out.println("Masukan nilai y =");
        int y = input.nextInt();

        if(x>y){
            System.out.println("Nilai tertinggi adalah nilai x yaitu "+ x);
        }
        else {
            System.out.println("Nilai tertinggi adalah nilai y yaitu "+ y);
        }
    }
}
