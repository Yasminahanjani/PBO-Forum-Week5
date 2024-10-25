/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.forum_week5;
import java.util.ArrayList;

/**
 *
 * @author yasmi
 */
public class TimProyek {
    private String idTim;
    private String namaTim;
    private Proyek proyek;
    private ArrayList<Karyawan> daftarAnggota;

    public TimProyek(String idTim, String namaTim) {
        this.idTim = idTim;
        this.namaTim = namaTim;
        this.daftarAnggota = new ArrayList<>();
    }

    public void tambahAnggota(Karyawan karyawan) {
        daftarAnggota.add(karyawan);
    }

    public Proyek getProyek() {
        return proyek;
    }

    public void setProyek(Proyek proyek) {
        this.proyek = proyek;
    }

    public String getIdTim() {
        return idTim;
    }

    public String getNamaTim() {
        return namaTim;
    }

    public ArrayList<Karyawan> getDaftarAnggota() {
        return daftarAnggota;
    }
}
