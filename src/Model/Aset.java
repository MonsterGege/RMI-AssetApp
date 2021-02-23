/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Date;

/**
 *
 * @author Eberhend
 */
public class Aset {
    String kode;
    String nama;
    String kategori;
    Date tanggal_terima;
    String bataspemakaian;
    String masapemakaian;
    int nilaiaset;
    int penyusutan;

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public Date getTanggal_terima() {
        return tanggal_terima;
    }

    public void setTanggal_terima(Date tanggal_terima) {
        this.tanggal_terima = tanggal_terima;
    }

    public String getBataspemakaian() {
        return bataspemakaian;
    }

    public void setBataspemakaian(String bataspemakaian) {
        this.bataspemakaian = bataspemakaian;
    }

    public String getMasapemakaian() {
        return masapemakaian;
    }

    public void setMasapemakaian(String masapemakaian) {
        this.masapemakaian = masapemakaian;
    }

    public int getNilaiaset() {
        return nilaiaset;
    }

    public void setNilaiaset(int nilaiaset) {
        this.nilaiaset = nilaiaset;
    }

    public int getPenyusutan() {
        return penyusutan;
    }

    public void setPenyusutan(int penyusutan) {
        this.penyusutan = penyusutan;
    }
}
