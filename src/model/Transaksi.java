package model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "transaksi")
public class Transaksi implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_transaksi")
    protected int idTransaksi;

    @Column(name = "id_user", nullable = false)
    protected int idUser;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "tanggal", nullable = false)
    protected Date tanggal;

    @Column(name = "total", nullable = false, precision = 12, scale = 2)
    protected BigDecimal total;

    // Relasi OneToMany ke DetailTransaksi
    @OneToMany(mappedBy = "transaksi", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    protected List<DetailTransaksi> listDetail = new ArrayList<>();

    // Kompatibilitas dengan kode lama
    @Transient
    protected Buah buah;

    @Transient
    protected int jumlah;

    public Transaksi(Buah buah, int jumlah) {
        this.buah = buah;
        this.jumlah = jumlah;
    }

    public Transaksi(int idTransaksi, int idUser, Date tanggal, BigDecimal total) {
        this.idTransaksi = idTransaksi;
        this.idUser = idUser;
        this.tanggal = tanggal;
        this.total = total;
    }

    public Transaksi(int idTransaksi, int idUser, Date tanggal, int total) {
        this.idTransaksi = idTransaksi;
        this.idUser = idUser;
        this.tanggal = tanggal;
        this.total = BigDecimal.valueOf(total);
    }

    public Transaksi() {
    }

    public BigDecimal hitungTotalDecimal() {
        if (buah != null && buah.getHarga() != null) {
            return buah.getHarga().multiply(BigDecimal.valueOf(jumlah));
        }
        return total != null ? total : BigDecimal.ZERO;
    }

    public int hitungTotal() {
        return hitungTotalDecimal().intValue();
    }

    public int getIdTransaksi() {
        return idTransaksi;
    }

    public void setIdTransaksi(int idTransaksi) {
        this.idTransaksi = idTransaksi;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public void setTotal(int total) {
        this.total = BigDecimal.valueOf(total);
    }

    public Buah getBuah() {
        return buah;
    }

    public void setBuah(Buah buah) {
        this.buah = buah;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public List<DetailTransaksi> getListDetail() {
        return listDetail;
    }

    public void setListDetail(List<DetailTransaksi> listDetail) {
        this.listDetail = listDetail;
    }

    public void addDetail(DetailTransaksi detail) {
        listDetail.add(detail);
        detail.setTransaksi(this);
    }
}
