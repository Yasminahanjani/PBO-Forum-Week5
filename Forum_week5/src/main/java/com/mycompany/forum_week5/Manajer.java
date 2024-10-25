/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.forum_week5;

/**
 *
 * @author yasmi
 */
public class Manajer extends Karyawan{
    private String idManajer;
    private Proyek[] arrayList;
    private double bonus;

    public Manajer(String id_karyawan, String nama_karyawan, double gaji, boolean status_karyawan, String idManajer, double bonus) {
        super(id_karyawan, nama_karyawan, gaji, status_karyawan);
        this.idManajer = idManajer;
        this.arrayList = new Proyek[5];
        this.bonus = bonus;
    }
    
    public void tambahProyek(Proyek proyek){
        for (int i = 0; i < arrayList.length; i++) {
            if (arrayList[i] == null) {
                arrayList[i] = proyek;
                return;
            }
        }
        System.out.println("Kapasitas proyek penuh.");
    }

    public Proyek[] getArrayList() {
        return arrayList;
    }

    public double getBonus() {
        return bonus;
    }
    
}
    
    
    
    