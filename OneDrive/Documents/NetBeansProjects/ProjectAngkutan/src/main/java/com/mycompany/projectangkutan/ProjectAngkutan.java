/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.projectangkutan;

/**
 *
 * @author SARA VIKANA BANGUN
 */
public class ProjectAngkutan {

    public static void main(String[] args) {
       System.out.println("sedan");

        Sedan h = new Sedan();
        h.tampilkan();

        System.out.println("\nminiBus");

        MiniBus t = new MiniBus();
        t.tampilkan();

        System.out.println("\nBus");
        
        Bus z = new Bus();
        z.tampilkan();
 }
}