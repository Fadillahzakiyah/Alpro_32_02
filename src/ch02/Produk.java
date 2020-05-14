package ch02;

import java.util.Date;

public class Produk {
    String bercode;
    String nama;
    Date tanggalKedaluarsa;
    double harga;

    public String getBercode() {
        return bercode;
    }

    public String getNama() {
        return nama;
    }

    public Date getTanggalKedaluarsa() {
        return tanggalKedaluarsa;
    }

    public double getHarga() {
        return harga;
    }
}
