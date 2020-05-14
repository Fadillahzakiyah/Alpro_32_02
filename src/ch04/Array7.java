package ch04;

public class Array7 {
    public static void main(String[] args) {
        int[] nilai = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        System.out.println("Menampilkan angka kelipatan 5 yang sebelumnya juga kelipatan 5");
        for(int a = 0; a<13; a++){
            if(nilai[a]%5==0){
                if (nilai[a-1]%5==0){
                    System.out.print(nilai[a]+ " ");
                }
            }
        }
    }
}
