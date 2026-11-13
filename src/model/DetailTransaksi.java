package model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "detail_transaksi")
public class DetailTransaksi implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_detail")
    private int idDetail;

    @Column(name = "id_transaksi", insertable = false, updatable = false)
    private int idTransaksi;

    @Column(name = "id_buah", insertable = false, updatable = false)
    private int idBuah;

    @Column(name = "jumlah", nullable = false)
    private int jumlah;

    @Column(name = "harga", nullable = false, precision = 12, scale = 2)
    private BigDecimal harga;

    @Column(name = "subtotal", nullable = false, precision = 12, scale = 2)
    private BigDecimal subtotal;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_transaksi", nullable = false)
    private Transaksi transaksi;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_buah", nullable = false)
    private Buah buah;

    public DetailTransaksi() {
    }

    public DetailTransaksi(int idDetail, int idTransaksi, int idBuah, int jumlah, BigDecimal harga, BigDecimal subtotal) {
        this.idDetail = idDetail;
        this.idTransaksi = idTransaksi;
        this.idBuah = idBuah;
        this.jumlah = jumlah;
        this.harga = harga;
        this.subtotal = subtotal;
    }

    public DetailTransaksi(int idBuah, int jumlah, BigDecimal harga, BigDecimal subtotal) {
        this.idBuah = idBuah;
        this.jumlah = jumlah;
        this.harga = harga;
        this.subtotal = subtotal;
    }

    public DetailTransaksi(int idDetail, int idTransaksi, int idBuah, int jumlah, int harga, int subtotal) {
        this.idDetail = idDetail;
        this.idTransaksi = idTransaksi;
        this.idBuah = idBuah;
        this.jumlah = jumlah;
        this.harga = BigDecimal.valueOf(harga);
        this.subtotal = BigDecimal.valueOf(subtotal);
    }

    public DetailTransaksi(int idBuah, int jumlah, int harga, int subtotal) {
        this.idBuah = idBuah;
        this.jumlah = jumlah;
        this.harga = BigDecimal.valueOf(harga);
        this.subtotal = BigDecimal.valueOf(subtotal);
    }

    public int getIdDetail() {
        return idDetail;
    }

    public void setIdDetail(int idDetail) {
        this.idDetail = idDetail;
    }

    public int getIdTransaksi() {
        return idTransaksi;
    }

    public void setIdTransaksi(int idTransaksi) {
        this.idTransaksi = idTransaksi;
    }

    public int getIdBuah() {
        return idBuah;
    }

    public void setIdBuah(int idBuah) {
        this.idBuah = idBuah;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
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

    public BigDecimal getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
    }

    public void setSubtotal(int subtotal) {
        this.subtotal = BigDecimal.valueOf(subtotal);
    }

    public Transaksi getTransaksi() {
        return transaksi;
    }

    public void setTransaksi(Transaksi transaksi) {
        this.transaksi = transaksi;
        if (transaksi != null) {
            this.idTransaksi = transaksi.getIdTransaksi();
        }
    }

    public Buah getBuah() {
        return buah;
    }

    public void setBuah(Buah buah) {
        this.buah = buah;
        if (buah != null) {
            this.idBuah = buah.getIdBuah();
        }
    }
}
