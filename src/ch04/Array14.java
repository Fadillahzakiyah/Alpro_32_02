package ch04;

public class Array14 {
    public static void main(String[] args) {
        int[] nilai = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        int hasil = 0;
        System.out.println("Menampilkan jumlah angka-angka array dengan angka-angka sebelumnya");
        for(int a = 0; a < 13; a++)
            hasil = hasil+nilai[a];
        System.out.println("Total angka seluruhnya yaitu "+hasil+ " Dari angka-angka sebelumnya yaitu ");
        for(int a = 0; a < 13; a++){
            System.out.print(nilai[a]+ " ");
        }
    }
}
