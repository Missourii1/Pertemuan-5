package model;

import java.io.Serializable;

public class StrukItem implements Serializable {
    private String namaBuah;
    private String harga;
    private int jumlah;
    private String subtotal;

    public StrukItem() {
    }

    public StrukItem(String namaBuah, String harga, int jumlah, String subtotal) {
        this.namaBuah = namaBuah;
        this.harga = harga;
        this.jumlah = jumlah;
        this.subtotal = subtotal;
    }

    public String getNamaBuah() {
        return namaBuah;
    }

    public void setNamaBuah(String namaBuah) {
        this.namaBuah = namaBuah;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public String getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(String subtotal) {
        this.subtotal = subtotal;
    }
}
