/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.utsno3_21103092;

/**
 *
 * @author SARA VIKANA BANGUN
 */
public class StudentStaff implements IPendapatan {
   private int unitKerja;
    private int jamKerja;

    public int getUnitKerja() {
        return unitKerja;
    }

    public void setUnitKerja(int unitKerja) {
        this.unitKerja = unitKerja;
    }

    public int getJamKerja() {
        return jamKerja;
    }

    public void setJamKerja(int jamKerja) {
        this.jamKerja = jamKerja;
    }

    public void tampilDataMhs() {
        String nim = null;
        System.out.println("NIM                     : " + nim);
        String nama = null;
        System.out.println("Nama                    : " + nama);
        String jurusan = null;
        System.out.println("Jurusan                 : " + jurusan);
        String ipk = null;
        System.out.println("IPK                     : " + ipk);
        System.out.println("Unit Kerja              : " + unitKerja);
        System.out.println("Jam Kerja               : " + jamKerja);
        System.out.println("-----------------------------------------");
    }

    public double totalPendapatan() {
        double totalPendapatan;

        return totalPendapatan = jamKerja * 30000;

    }
}
