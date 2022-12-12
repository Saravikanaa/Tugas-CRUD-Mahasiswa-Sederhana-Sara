/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeesm6;

/**
 *
 * @author SARA VIKANA BANGUN
 */
public class CommisionEmployee extends Employee {
    private double gajiPokok, komisi, totalPenjualan;
    public CommisionEmployee(double gajiPokok, double komisi, double 
    totalPenjualan, String nama, String nip, int gaji) {
 super(nama, nip, gaji);
 this.gajiPokok = gajiPokok;
 this.komisi = komisi;
 this.totalPenjualan = totalPenjualan;
 }

 public double hitungGaji(){
 gaji = gajiPokok + (komisi * totalPenjualan);
 return gaji;
 }

 public void cetakCommission(){
 super.cetakEmployee();
 System.out.println("Gaji Pokok : " + gajiPokok);
 System.out.println("Komisi : " + komisi);
 System.out.println("Total Penjualan : " + totalPenjualan);
 System.out.println("Total Gaji : " + gaji);
}
}
