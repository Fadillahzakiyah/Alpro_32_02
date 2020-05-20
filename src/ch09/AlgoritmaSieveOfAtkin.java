package ch09;

public class AlgoritmaSieveOfAtkin {
    public static int soa (int lim){
        if(lim>2)
            System.out.print(2+" ");
        else if(lim>3)
            System.out.println(3+" ");
        boolean sieve[] = new boolean[lim];
        for(int a = 0; a < lim; a++)
            sieve[a]= false;
        for(int b = 1; b < lim; b++){
            for(int c = 1; c*c<lim; c++){
                int d = (4*b*b)+(c*c);
                if(d <= lim && (d%12==1||d%12==5))
                    sieve[d] ^= true;
            }
        }
        for(int e = 5; e*e<lim; e++){
            if(sieve[e]){
                for(int a = e*e; a < lim; a += e*e)
                    sieve[e]=false;
            }
        }
        for (int prima = 5; prima < lim; prima++)
            if(sieve[prima])
                System.out.print(prima+" ");
        return 0;
    }
    public static void main(String[] args) {
        int lim = 1000;
        soa(lim);
    }
}
