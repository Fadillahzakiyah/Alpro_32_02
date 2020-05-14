package ch04;

public class Array5 {
    public static void main(String[] args) {
        int[] nilai = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        System.out.println("Menampilkan angka yang memiliki angka 2");
        for(int a = 0; a < 13; a++)
            if(String.valueOf(nilai[a]).contains("2"))
                System.out.print(nilai[a]+ " ");
    }
}
