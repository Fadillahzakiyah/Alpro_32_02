package ch04;

public class Array8 {
    public static void main(String[] args) {
        int[] nilai = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        System.out.println("Menghitung jumlah angka");
        int hasil = 0;
        for(int a = 0; a < 13; a++)
            hasil = hasil + nilai[a];
        System.out.println("Totalnya adalah "+ hasil);
    }
}
