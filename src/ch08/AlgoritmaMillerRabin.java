package ch08;

public class AlgoritmaMillerRabin {
    public static int mulai(int a, int b, int c){
        int hasil = 1;
        a = a%c;
        while(b > 0){
            if((b&1)==1)
                hasil =(hasil*a)%c;
            b = b >> 1;
            a = (a*a)%c;
        }
        return hasil;
    }
    public static boolean test(int d, int e){
        int pertama = 1+ (int)(Math.random()%(e-4));
        int a = mulai(pertama, d, e);
        if(a == 1 || a == e-1)
            return true;

        while(d != e - 1){
            a = (a*a)%e;
            d *= 2;
            if(a==1)
                return false;
            if (a==e-1)
                return true;
        }
        return false;
    }
    public static boolean prima(int e, int f){
        if(e <= 1 || e == 4)
            return false;
        if(e <= 3)
            return true;
        int d = e-1;
        while(d%2==0)
            d/=2;
        for(int a = 0; a < f; a++)
            if(!test(d, e))
                return false;
        return true;
    }
    public static void main(String[] args) {
        int f = 4;
        System.out.println("Angka-angka prima dari 1000");
        for(int e = 1; e < 1000; e++)
            if(prima(e, f))
                System.out.print(e+" ");
    }
}
