/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeesm6;

/**
 *
 * @author SARA VIKANA BANGUN
 */
public class SalariedEmployee extends Employee {
    private double upahMingguan;
 public SalariedEmployee(String nama, String nip, int gaji) {
 super(nama, nip, gaji);
 this.upahMingguan = gaji;
 }

 public void cetakSalaried(){
 super.cetakEmployee();
 System.out.println("Total Gaji : " + upahMingguan);
}
}
