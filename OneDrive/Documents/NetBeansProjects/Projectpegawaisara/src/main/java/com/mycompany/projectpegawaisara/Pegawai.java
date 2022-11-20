/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectpegawaisara;

/**
 *
 * @author SARA VIKANA BANGUN
 */
public class Pegawai {
    
    private int GajiPokok;
    private String divisi;
    private int tahunkerja, tahunnow = 2022;
    private int GajiAkhir;
    String NIP;
    String nama;
    int tahunMasuk;
    String alamat;
    
    public Pegawai(){
    }
    public void setManajer(String nama, String NIP, String alamat, int tahunMasuk, int GajiPokok, String divisi ){
        this.NIP = NIP;
        this.nama = nama;
        this.tahunMasuk = tahunMasuk;
        this.alamat = alamat;
        this.GajiPokok = GajiPokok;
        this.divisi = divisi;
    }
    public void HitungGajiAkhir(){
        tahunkerja = tahunnow - tahunMasuk;
        if(tahunkerja == 3){
            GajiAkhir = (int) (GajiPokok + (GajiPokok*0.05));
        }else if(tahunkerja > 5){
            GajiAkhir = (int) (GajiPokok + (0.1* GajiPokok));
        }else{
            GajiAkhir = GajiPokok;
        }
        System.out.println("GAJI TOTAL  : "+GajiAkhir);
    }
    public void cetakManajer(){
        System.out.println("\nData Manajer");
        System.out.println("NAMA        : "+nama);
        System.out.println("NIP         : "+NIP);
        System.out.println("ALAMAT      : "+alamat);
        System.out.println("TAHUN MASUK : "+tahunMasuk);
        System.out.println("GAJI POKOK  : "+GajiPokok);
        System.out.println("DIVISI      : "+divisi);
        HitungGajiAkhir();
        System.out.println("");
    }


}
