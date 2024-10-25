/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.forum_week5;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author yasmi
 */
public class Main {
    public static void main(String[] args) {
        Proyek proyek1 = new Proyek("P001", "Proyek A", LocalDateTime.of(2024, 12, 31, 23, 59));
        Proyek proyek2 = new Proyek("P002", "Proyek B", LocalDateTime.of(2024, 11, 30, 17, 0));
        Proyek proyek3 = new Proyek("P003", "Proyek C", LocalDateTime.of(2024, 10, 31, 21, 0));
        Proyek proyek4 = new Proyek("P004", "Proyek D", LocalDateTime.of(2024, 9, 30, 20, 59));
        Proyek proyek5 = new Proyek("P005", "Proyek E", LocalDateTime.of(2024, 8, 31, 10, 30));

        Manajer mj1 = new Manajer("K001", "Anila Dwi", 15000000, true, "M001", 1000000);
        Manajer mj2 = new Manajer("K002", "Yasmina Arethaya", 14000000, true, "M002", 750000);

        mj1.tambahProyek(proyek1);
        mj1.tambahProyek(proyek2);
        mj1.tambahProyek(proyek3);

        mj2.tambahProyek(proyek4);
        mj2.tambahProyek(proyek5);

        Staff s1 = new Staff("K003", "Thaya Hanjani", 7000000, true, "S001", "Software Engineer", 500000);
        Staff s2= new Staff("K004", "Rizky Maulana", 8000000, true, "S002", "DevOps Engineer", 120000);
        Staff s3 = new Staff("K005", "Fitri Handayani", 6500000, true, "S003", "Data Scientist", 4);
        Staff s4 = new Staff("K006", "Nurul Aini", 9000000, true, "S004", "UI/UX Designer", 6);

        TimProyek timAlpha = new TimProyek("T001", "Tim Alpha");
        TimProyek timBeta = new TimProyek("T002", "Tim Beta");

        timAlpha.tambahAnggota(mj1);
        timAlpha.tambahAnggota(s1);
        timAlpha.tambahAnggota(s2);

        timBeta.tambahAnggota(mj2);
        timBeta.tambahAnggota(s3);
        timBeta.tambahAnggota(s4);

        timAlpha.setProyek(proyek1);  // Tim Alpha mengerjakan Proyek A
        timAlpha.setProyek(proyek2);  // Tim Alpha mengerjakan Proyek B
        timBeta.setProyek(proyek4);   // Tim Beta mengerjakan Proyek D

        Pelatihan pelatihanML = new Pelatihan("PL001", "Pelatihan Machine Learning");
        Pelatihan pelatihanCloud = new Pelatihan("PL002", "Pelatihan Cloud Computing");
        
        pelatihanML.tambahKaryawan(s1);
        pelatihanML.tambahKaryawan(s3);

        pelatihanCloud.tambahKaryawan(s2);
        pelatihanCloud.tambahKaryawan(s4);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");

        System.out.println("Proyek: ");
        System.out.println("Proyek yang di-manage oleh " + mj1.getNamaKaryawan() + ":");
        for (int i = 0;i<mj1.getArrayList().length;i++) {
            if (mj1.getArrayList()[i] != null) {
                System.out.println((i+1) + ". "+ mj1.getArrayList()[i].getNamaProyek() + ", Deadline: " + mj1.getArrayList()[i].getDeadline().format(formatter));
            }
        }
        
        System.out.println("\nProyek yang di-manage oleh " + mj2.getNamaKaryawan() + ":");
        for (int i = 0;i<mj2.getArrayList().length;i++) {
            if (mj2.getArrayList()[i] != null) {
                System.out.println( (i+1) + ". "+ mj2.getArrayList()[i].getNamaProyek() + ", Deadline: " + mj2.getArrayList()[i].getDeadline().format(formatter));
            }
        }
        System.out.println(" ");
        System.out.println("=========================================================");
        // Menampilkan anggota TimProyek Alpha beserta proyeknya
        System.out.println("Tim Projek:");
        System.out.println("\n" + timAlpha.getNamaTim());
        System.out.println("Proyek yang dikerjakan: " + timAlpha.getProyek().getNamaProyek());
        for (Karyawan anggota : timAlpha.getDaftarAnggota()) {
            System.out.print("Anggota: " + anggota.getNamaKaryawan());
            System.out.printf(", Gaji: %.00f \n", anggota.getGaji());
        }

        System.out.println("\n" + timBeta.getNamaTim());
        System.out.println("Proyek yang dikerjakan: " + timBeta.getProyek().getNamaProyek());
        for (Karyawan anggota : timBeta.getDaftarAnggota()) {
            System.out.print("Anggota: " + anggota.getNamaKaryawan());
            System.out.printf(", Gaji: %.000f \n", anggota.getGaji());
        }

        System.out.println("\n=========================================================");
        
        System.out.println("Pelatihan : ");
        System.out.println("\n" + pelatihanML.getTopikPelatihan());
        System.out.println("Peserta: ");
        for (Karyawan peserta : pelatihanML.getDaftarKaryawan()) {
            System.out.print("Nama: " + peserta.getNamaKaryawan());
            System.out.println(", Spesialisasi: " + ((Staff) peserta).getSpesialisasi());
        }
     
        System.out.println("\n" + pelatihanCloud.getTopikPelatihan());
        System.out.println("Peserta: ");
        for (Karyawan peserta : pelatihanCloud.getDaftarKaryawan()) {
            System.out.print("Nama: " + peserta.getNamaKaryawan());
            System.out.println(", Spesialisasi: " + ((Staff) peserta).getSpesialisasi());
        }
    } 
}
