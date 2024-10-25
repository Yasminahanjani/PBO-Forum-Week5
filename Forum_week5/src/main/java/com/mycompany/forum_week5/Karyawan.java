/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.forum_week5;

/**
 *
 * @author yasmi
 */
public class Karyawan {
    protected String id_karyawan;
    protected String nama_karyawan;
    protected double gaji;
    protected boolean status_karyawan;

    public Karyawan(String id_karyawan, String nama_karyawan, double gaji, boolean status_karyawan) {
        this.id_karyawan = id_karyawan;
        this.nama_karyawan = nama_karyawan;
        this.gaji = gaji;
        this.status_karyawan = status_karyawan;
    }

    public String getIdKaryawan() {
        return id_karyawan;
    }

    public String getNamaKaryawan() {
        return nama_karyawan;
    }

    public double getGaji() {
        return gaji;
    }

    public boolean isStatus_karyawan() {
        return status_karyawan;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }
    
    public void showKaryawan(){
        System.out.println("ID              : " + this.id_karyawan);
        System.out.println("Nama Karyawan   : " + this.nama_karyawan);
        System.out.printf("Gaji            : %.00f", this.gaji);
        System.out.println(" ");
        System.out.println("Status Karyawan : " + this.status_karyawan);
    }
}
