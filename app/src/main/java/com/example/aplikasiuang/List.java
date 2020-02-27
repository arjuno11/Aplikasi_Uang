package com.example.aplikasiuang;

public class List {

    private String tanggal;
    private String pemasukan;
    private String pengeluaran;
    private String hasil;

    public List(String tanggal,String pemasukan, String pengeluaran, String hasil) {
        this.tanggal = tanggal;
        this.pemasukan = pemasukan;
        this.pengeluaran = pengeluaran;
        this.hasil = hasil;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getPemasukan() {
        return pemasukan;
    }

    public void setPemasukan(String pemasukan) {
        this.pemasukan = pemasukan;
    }

    public String getPengeluaran() {
        return pengeluaran;
    }

    public void setPengeluaran(String pengeluaran) {
        this.pengeluaran = pengeluaran;
    }

    public String getHasil() {
        return hasil;
    }

    public void setHasil(String hasil) {
        this.hasil = hasil;
    }
}
