package ch02;

import java.util.Date;

public class Obat {
    String bercode;
    String nama;
    Date TanggalKedaluarsa;
    double harga;

    public String getBercode() {
        return bercode;
    }

    public String getNama() {
        return nama;
    }

    public Date getTanggalKedaluarsa() {
        return TanggalKedaluarsa;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
}
