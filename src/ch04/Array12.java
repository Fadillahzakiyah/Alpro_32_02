package ch04;

public class Array12 {
    public static void main(String[] args) {
        int[] nilai = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        int hasil;
        System.out.println("Menampilkan jumlah angka dengan angka setelahnya yang hasilnya bernilai genap");
        for (int a = 0; a < 13; a++){
            if(a < nilai.length-1){
                if(nilai[a]%2==0&&nilai[a+1]%2==0){
                    hasil = nilai[a] +nilai[a+1];
                    System.out.println(nilai[a]+"+"+nilai[a+1]+" = "+hasil);
                }
            }
        }
    }
}
