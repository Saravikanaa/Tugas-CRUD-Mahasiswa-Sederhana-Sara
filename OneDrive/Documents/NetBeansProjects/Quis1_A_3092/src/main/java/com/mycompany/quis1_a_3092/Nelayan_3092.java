/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quis1_a_3092;

/**
 *
 * @author SARA VIKANA BANGUN
 */
public class Nelayan_3092 extends Penduduk_3092{
    int jmlhBeratIkan_3092, jmlhSolar_3092;
    double pendapatanNelayan_3092;
    String NIK_3092;
    
    public double totalPendapatanNelayan(){
        return pendapatanNelayan_3092 = (jmlhBeratIkan_3092*8000) - (jmlhSolar_3092*10000);
    }
    public void tampilDataNelayan(){
        tampilDataPenduduk();
        System.out.println("Berat Ikan   : "+jmlhBeratIkan_3092);
        System.out.println("Jumlah Solar : "+jmlhSolar_3092);
        System.out.println("");
    }

    public void tampilDataPenduduk() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
