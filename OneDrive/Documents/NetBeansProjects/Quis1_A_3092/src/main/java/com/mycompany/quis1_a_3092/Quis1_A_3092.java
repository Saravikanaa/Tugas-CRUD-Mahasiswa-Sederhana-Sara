/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.quis1_a_3092;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SARA VIKANA BANGUN
 */
public class Quis1_A_3092 {

    public static void main(String[] args) {
        Nelayan_3092 N = new Nelayan_3092();
        Nelayan_3092 NN = new Nelayan_3092();
        Dokter_3092 D = new Dokter_3092();
        Dokter_3092 DD = new Dokter_3092();
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.print("NIK          : ");
            N.NIK_3092 = br.readLine();
            System.out.print("Nama         : ");
            N.nama_3092 = br.readLine();
            System.out.print("Umur         : ");
            N.umur_3092 = Integer.parseInt(br.readLine());
            System.out.print("Alamat       : ");
            N.alamat_3092 = br.readLine();
            System.out.print("Berat Ikan   : ");
            N.jmlhBeratIkan_3092 = Integer.parseInt(br.readLine());
            System.out.print("Jumlah Solar : ");
            N.jmlhSolar_3092 = Integer.parseInt(br.readLine());
            System.out.println("");
            System.out.print("NIK          : ");
            NN.NIK_3092 = br.readLine();
            System.out.print("Nama         : ");
            NN.nama_3092 = br.readLine();
            System.out.print("Umur         : ");
            NN.umur_3092 = Integer.parseInt(br.readLine());
            System.out.print("Alamat       : ");
            NN.alamat_3092 = br.readLine();
            System.out.print("Berat Ikan   : ");
            NN.jmlhBeratIkan_3092 = Integer.parseInt(br.readLine());
            System.out.print("Jumlah Solar : ");
            NN.jmlhSolar_3092 = Integer.parseInt(br.readLine());
            System.out.println("");
    
            System.out.println("NIK          : ");
            D.NIK_3092 = br.readLine();
            System.out.println("Nama         : ");
            D.nama_3092 = br.readLine();
            System.out.println("Umur         : ");
            D.umur_3092 = Integer.parseInt(br.readLine());
            System.out.println("Alamat       : ");
            D.alamat_3092 = br.readLine();
            System.out.println("Jumlah Pasien: ");
            D.jmlhPasien_3092 = Integer.parseInt(br.readLine());
            System.out.println("Jumlah Obat  : ");
            D.jmlhObat_3092= Integer.parseInt(br.readLine());
            System.out.println("");
            System.out.println("NIK          : ");
            DD.NIK_3092 = br.readLine();
            System.out.println("Nama         : ");
            DD.nama_3092 = br.readLine();
            System.out.println("Umur         : ");
            DD.umur_3092 = Integer.parseInt(br.readLine());
            System.out.println("Alamat       : ");
            DD.alamat_3092 = br.readLine();
            System.out.println("Jumlah Pasien: ");
            DD.jmlhPasien_3092 = Integer.parseInt(br.readLine());
            System.out.println("Jumlah Obat  : ");
            DD.jmlhObat_3092= Integer.parseInt(br.readLine());
            System.out.println("");
            
            
            System.out.println("\t== DATA NELAYAN ==");
            N.tampilDataNelayan();
            System.out.println("Pendapatan   : "+N.totalPendapatanNelayan());
            NN.tampilDataNelayan();
            System.out.println("Pendapatan   : "+NN.totalPendapatanNelayan());
            System.out.println("\t== DATA DOKTER ==");
            D.tampilDataDokter();
            System.out.println("Pendapatan   : "+D.totalPendapatanDokter());
            DD.tampilDataDokter();
            System.out.println("Pendapatan   : "+DD.totalPendapatanDokter());
        }
        catch(Exception ex){
            System.out.println(ex);
        }
    }
}


    