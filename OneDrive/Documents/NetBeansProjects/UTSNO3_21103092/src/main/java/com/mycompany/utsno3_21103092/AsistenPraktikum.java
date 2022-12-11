/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.utsno3_21103092;

/**
 *
 * @author SARA VIKANA BANGUN
 */
public class AsistenPraktikum extends Mahasiswa {
   implements IPendapatan static {
    private String mkAsistensi;
    private int jmlPertemuan;

    public String getMkAsistensi() {
        return mkAsistensi;
    }

    public void setMkAsistensi(String mkAsistensi) {
        this.mkAsistensi = mkAsistensi;
    }

    public int getJmlPertemuan() {
        return jmlPertemuan;
    }

    public void setJmlPertemuan(int jmlPertemuan) {
        this.jmlPertemuan = jmlPertemuan;
    }

    @Override
    public void tampilDataMhs() {
        System.out.println("NIM                     : " + nim);
        System.out.println("Nama                    : " + nama);
        System.out.println("Jurusan                 : " + jurusan);
        System.out.println("IPK                     : " + ipk);
        System.out.println("MK Asistentsi           : " + mkAsistensi);
        System.out.println("Jumlah Pertemuan        : " + jmlPertemuan);
        System.out.println("-----------------------------------------");
    }

    public double totalPendapatan() {
        double totalPendapatan;

        return totalPendapatan = jmlPertemuan * 50000;

    }
}
