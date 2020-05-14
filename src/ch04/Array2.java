package ch04;

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        int[] nilai = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        System.out.println("Mencari sebuah angka");
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan angka yang anda cari");
        int cari = input.nextInt();
        int posisi = 0;
        for (int a = nilai.length-1; a >= 0; a--){
            if(nilai[a]==cari){
                posisi = a;
            }
            if(true){
                System.out.println("Angka ditemukan pada posisi ke-"+ posisi);
                break;
            }
            else {
                System.out.println("Maaf, angka yang anda cari tidak ditemukan");
                break;
            }
        }
    }
}
