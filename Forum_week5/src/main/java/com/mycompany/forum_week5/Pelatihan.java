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
public class Pelatihan {
    private String id_pelatihan;
    private String topik_pelatihan;
    private ArrayList<Karyawan> daftarKaryawan;

    public Pelatihan(String id_pelatihan, String topik_pelatihan) {
        this.id_pelatihan = id_pelatihan;
        this.topik_pelatihan = topik_pelatihan;
        this.daftarKaryawan = new ArrayList<>();
    }

    public void tambahKaryawan(Karyawan karyawan) {
        daftarKaryawan.add(karyawan);
    }

    public String getIdPelatihan() {
        return id_pelatihan;
    }

    public String getTopikPelatihan() {
        return topik_pelatihan;
    }

    public ArrayList<Karyawan> getDaftarKaryawan() {
        return daftarKaryawan;
    }
}
