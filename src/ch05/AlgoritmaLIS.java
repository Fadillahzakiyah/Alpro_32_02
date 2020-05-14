package ch05;

public class AlgoritmaLIS {
    public static int maksimal(int a[], int akhir, int[] LIS ){
        for (int b = 0; b < akhir; b++) {
            if (a[b] < a[akhir] && LIS[b] > LIS[akhir])
                LIS[akhir] = LIS[b];
        }
        return LIS[akhir];
    }
    private static int lis(int [] Nilai){
        int[] LIS = new int[Nilai.length];
        LIS[0] = 1;

        for(int a = 1; a < Nilai.length; a++){
            LIS[a] = 1+maksimal(Nilai, a, LIS);
        }
        return LIS[Nilai.length-1];
    }

    public static void main(String[] args) {
        int [] Nilai = {3, 4, 1, -7, 6, -8, 6, -3, 5, 9, -7};
        System.out.println("Longest inreasing sybsequence : "+lis(Nilai));
    }
}
