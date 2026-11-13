package model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "buah")
public class Buah implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_buah")
    private int idBuah;

    @Column(name = "nama_buah", nullable = false, length = 100)
    private String nama;

    @Column(name = "harga", nullable = false, precision = 12, scale = 2)
    private BigDecimal harga;

    @Column(name = "stok", nullable = false)
    private int stok;

    public Buah() {
    }

    public Buah(String nama, int harga, int stok) {
        this.nama = nama;
        this.harga = BigDecimal.valueOf(harga);
        this.stok = stok;
    }

    public Buah(String nama, BigDecimal harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public Buah(int idBuah, String nama, int harga, int stok) {
        this.idBuah = idBuah;
        this.nama = nama;
        this.harga = BigDecimal.valueOf(harga);
        this.stok = stok;
    }

    public Buah(int idBuah, String nama, BigDecimal harga, int stok) {
        this.idBuah = idBuah;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public int getIdBuah() {
        return idBuah;
    }

    public void setIdBuah(int idBuah) {
        this.idBuah = idBuah;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public BigDecimal getHarga() {
        return harga;
    }

    public void setHarga(BigDecimal harga) {
        this.harga = harga;
    }

    public void setHarga(int harga) {
        this.harga = BigDecimal.valueOf(harga);
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    @Override
    public String toString() {
        return nama;
    }
}
