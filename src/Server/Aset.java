/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import java.io.Serializable;
import java.sql.Date;

/**
 *
 * @author Eberhend
 */
public class Aset implements Serializable {
    private String kode_aset;
    private String nama_aset;
    private String kategori_aset;
    private Date tanggal_terima;
    private String bataspemakaian;
    private String masapemakaian;
    private int nilaiaset;
    private int penyusutan;

    public String getKode_aset() {
        return kode_aset;
    }

    public void setKode_aset(String kode_aset) {
        this.kode_aset = kode_aset;
    }

    public String getNama_aset() {
        return nama_aset;
    }

    public void setNama_aset(String nama_aset) {
        this.nama_aset = nama_aset;
    }

    public String getKategori_aset() {
        return kategori_aset;
    }

    public void setKategori_aset(String kategori_aset) {
        this.kategori_aset = kategori_aset;
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
