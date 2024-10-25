/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.forum_week5;

/**
 *
 * @author yasmi
 */
public class Staff extends Karyawan{
    private String idStaff;
    private String spesialisasi;
    private int masa_kerja;
    
    public Staff(String id_karyawan, String nama_karyawan, double gaji, boolean status_karyawan, String idStaff, String spesialisasi, int masa_kerja) {
        super(id_karyawan, nama_karyawan, gaji, status_karyawan);
        this.idStaff = idStaff;
        this.spesialisasi = spesialisasi;
        this.masa_kerja = masa_kerja;
    }

    public String getSpesialisasi() {
        return spesialisasi;
    }

    public int getMasa_kerja() {
        return masa_kerja;
    }    
}
