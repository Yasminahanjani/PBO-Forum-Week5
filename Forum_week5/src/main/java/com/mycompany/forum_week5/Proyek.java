/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.forum_week5;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author yasmi
 */
public class Proyek {
    private String idProyek;
    private String namaProyek;
    private LocalDateTime deadline;
    private ArrayList<Karyawan> daftarKaryawan;

    public Proyek(String idProyek, String namaProyek, LocalDateTime deadline) {
        this.idProyek = idProyek;
        this.namaProyek = namaProyek;
        this.deadline = deadline;
        this.daftarKaryawan = new ArrayList<>();
    }

    public void tambahKaryawan(Karyawan karyawan) {
        daftarKaryawan.add(karyawan);
    }

    public String getIdProyek() {
        return idProyek;
    }

    public String getNamaProyek() {
        return namaProyek;
    }

    public LocalDateTime getDeadline() {
        return deadline;
    }

    public ArrayList<Karyawan> getDaftarKaryawan() {
        return daftarKaryawan;
    }
}
