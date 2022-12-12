/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeesm6;

/**
 *
 * @author SARA VIKANA BANGUN
 */
public class ProjectPlanner extends Employee{
     private double gajiPokok, komisi, totalHasilProyek, pajak;
 public ProjectPlanner(double gajiPokok, double komisi, double totalHasilProyek,
String nama, String nip, int gaji) {
 super(nama, nip, gaji);
 this.gajiPokok = gajiPokok;
 this.komisi = komisi;
 this.totalHasilProyek = totalHasilProyek;
 }

 public double hitungGajiPP(){
 pajak = gajiPokok * 0.05;
 gaji = gajiPokok+ (komisi * totalHasilProyek) - pajak;
 return gaji;
 }

 public void cetakProjectPlanner(){
 super.cetakEmployee();
 System.out.println("Gaji Pokok : " + gajiPokok);
 System.out.println("Komisi : " + komisi);
 System.out.println("Total Hasil Proyek : " + totalHasilProyek);
 System.out.println("Total Gaji Project Planner : " + gaji);
 }  
}
