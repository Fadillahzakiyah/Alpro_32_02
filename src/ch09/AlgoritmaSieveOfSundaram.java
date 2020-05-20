package ch09;

import java.util.Arrays;

public class AlgoritmaSieveOfSundaram {
    public static int sos(int lim){
        int limBaru = (lim-2)/2;
        boolean jelas[] = new boolean[limBaru+1];
        Arrays.fill(jelas,false);
        for(int a =1; a <= limBaru; a++)
            for(int b = a; (a+b+2*a*b) <= limBaru; b++)
                jelas[a+b+2*a*b] = true;
        if(lim > 2)
            System.out.print(2+" ");
        for(int a = 1; a <= limBaru; a++)
            if(jelas[a]==false)
                System.out.print(2*a+1+" ");
        return-1;
    }
    public static void main(String[] args) {
        int lim = 1000;
        sos(lim);
    }
}
