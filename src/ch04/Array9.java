package ch04;

public class Array9 {
    public static void main(String[] args) {
        int[] nilai = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        System.out.println("Selisih angka-angka dengan angka sebelumnya");
        int selisih;
        for (int a = 0; a < nilai.length-1; a++){
            selisih=nilai[a]-nilai[a+1];
            System.out.println("Selisih dari nilai "+nilai[a]+"-"+nilai[a+1]+" = "+ selisih);
        }
    }
}
