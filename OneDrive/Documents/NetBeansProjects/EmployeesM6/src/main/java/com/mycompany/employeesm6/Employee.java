/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeesm6;

/**
 *
 * @author SARA VIKANA BANGUN
 */
public class Employee {
    protected String nama, nip;
 protected double gaji;

 public Employee(){

 }
 public Employee(String nama, String nip, int gaji) {
 this.nama = nama;
 this.nip = nip;
 this.gaji = gaji;
 }

 public void cetakEmployee(){
 System.out.println("");
 System.out.println("Nama Karyawan : "+ nama);
 System.out.println("NIP : "+ nip);
}
}
