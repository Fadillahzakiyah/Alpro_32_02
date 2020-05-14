package ch05;

public class AlgoritmaKadane {
    public static void main(String[] args) {
        int [] data = {3, 4, 1, -7, 6, -8, 6, -3, 5, 9, -7};
        int nilai = 0;
        int nilaimaksimal = 0;
        int mulai = 0;
        int akhir = 0;

        for(int a = 0; a < data.length; a++){
            nilai = nilai+ data[a];
            if(nilai<0){
                nilai = 0;
                mulai = a + 1;
            }
            else  if(nilai > nilaimaksimal){
                nilaimaksimal = nilai;
                akhir = a;
            }
        }
        for(int a = mulai; a <= akhir; a++)
            System.out.println("Subarray yang berdekatan dengan jumlah terbesar adalah "+ data[a]);
        System.out.println("Jumlah subarray yang berdekatan dengan jumlah terbesar adalah "+ nilaimaksimal);
    }
}
