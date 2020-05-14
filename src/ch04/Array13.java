package ch04;

public class Array13 {
    public static void main(String[] args) {
        int[] nilai = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        int selisih;
        int jumlah = 0;
        System.out.println("Menampilkan jumlah angka-angka selisih yang ditampilkan pada Class Array9");
        for(int a = 0; a < nilai.length-1; a++){
            selisih = nilai[a]-nilai[a+1];
            selisih = Math.decrementExact(selisih);
            System.out.print(selisih + " ");
            jumlah = jumlah + selisih;
        }
        System.out.println("Totalnya adalah "+ jumlah);
    }
}
