/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quis1_a_3092;

/**
 *
 * @author SARA VIKANA BANGUN
 */
public class Dokter_3092 extends Penduduk_3092 {
    int jmlhPasien_3092, jmlhObat_3092;
    double pendapatanDokter_3092;
    String NIK_3092;
    
    public double totalPendapatanDokter(){
        return (jmlhPasien_3092*50000)+(jmlhObat_3092*10000);
    }
    public void tampilDataDokter(){
        tampilDataPenduduk();
        System.out.println("Jumlah Pasien: "+jmlhPasien_3092);
        System.out.println("Jumlah Obat  : "+jmlhObat_3092);
        System.out.println("");
    }
}
