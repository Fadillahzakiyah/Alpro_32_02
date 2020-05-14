package ch02;

import java.util.Date;

public class ObjectProduk {
    public static void main(String[] args) {
        Produk x1 = new Produk();
        x1.bercode ="423332223";
        x1.nama = "Pepsident";
        x1.tanggalKedaluarsa = new Date(2021,07,2);
        x1.harga = 8900;

        Produk x2 = new Produk();
        x2.bercode ="5122211121";
        x2.nama = "KatKit";
        x2.tanggalKedaluarsa = new Date (2021,01,1);
        x2.harga = 14500;

        System.out.println(x1.nama+ "("+ x1.bercode+")");
        System.out.println("Harga: Rp"+x1.harga);
        System.out.println("Exp: "+x1.tanggalKedaluarsa.toString());
        System.out.println("=========================================");
        System.out.println(x2.nama+ "("+ x2.bercode+")");
        System.out.println("Harga: Rp"+x2.harga);
        System.out.println("Exp: "+x2.tanggalKedaluarsa.toString());
    }
}
