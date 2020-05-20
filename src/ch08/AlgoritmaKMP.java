package ch08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AlgoritmaKMP {
    private int[]gagal;
    public AlgoritmaKMP(String txt, String pat){
        gagal = new int[pat.length()];
        fail(pat);
        int skip = SkipPerbandingan(txt, pat);
        if (skip == -1)
            System.out.println("Tidak ada perbandingan");
        else
            System.out.println("Perbandingan terletak pada indeks-"+skip);
    }
    private void fail(String pat){
        int pertama = pat.length();
        gagal[0] = -1;
        for(int b = 1; b < pertama; b++){
            int a = gagal[b-1];
            while((pat.charAt(b)!= pat.charAt(a+1))&&a>=0)
                a = gagal[a];
            if(pat.charAt(b) == pat.charAt(a+1))
                gagal[b]= a+1;
            else
                gagal[b] = -1;
        }
    }
    private int SkipPerbandingan(String txt, String pat){
        int a = 0;
        int b = 0;
        int lens = txt.length();
        int lenp = pat.length();
        while(a < lens && b < lenp){
            if(txt.charAt(a)==pat.charAt(b)){
                a++;
                b++;
            }
            else if(b == 0)
                a++;
            else
                b = gagal[b-1]+1;
        }
        return((b==lenp)?(a-lenp):-1);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Knouth Mooris Pratt");
        System.out.println("Masukan teks");
        String txt = input.readLine();
        System.out.println("Masukan pat");
        String pat = input.readLine();
        AlgoritmaKMP kmp = new AlgoritmaKMP(txt, pat);
    }

}
