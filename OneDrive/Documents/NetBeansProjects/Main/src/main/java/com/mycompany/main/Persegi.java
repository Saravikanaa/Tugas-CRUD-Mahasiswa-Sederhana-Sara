/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author SARA VIKANA BANGUN
 */
public class Persegi {
    private double sisiPSG;
    private Titik titik;
    private Titik titik2;

    /**
     * Sisi Persegi = Jarak 2 titik
     */
    public Persegi(double x1, double y1, double x2, double y2) {
        this.titik = new Titik(x1, y1);
        this.titik2 = new Titik(x2, y2);
        this.sisiPSG = titik.hitungJarak(titik2);
    }

    /**
     * Rumus: s * s
     */
    public double hitungLuas() {
        return sisiPSG * sisiPSG;
    }

    /**
     * Menampilkan point 2 titik sebagai kelas induk dan
     * menampilkan sisi persegi serta luas persegi
     */
    public void tampil() {
        System.out.println("== DATA Segitiga ==");
        System.out.println("Point \t\t\t\t: ");
        titik.tampil();
        titik2.tampil();
        System.out.println("Sisi Persegi \t\t: " + sisiPSG);
        System.out.println("Luas Persegi \t\t: " + hitungLuas());
        System.out.println();
    }
}


