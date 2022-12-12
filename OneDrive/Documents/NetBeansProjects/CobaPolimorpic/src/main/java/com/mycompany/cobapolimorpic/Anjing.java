/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cobapolimorpic;

/**
 *
 * @author SARA VIKANA BANGUN
 */
public class Anjing extends Binatang {
    Anjing(String nama)
{
super("Anjing");
this.nama=nama;
}
public void suara()
{
System.out.println("menggonggong");
}
public String toString()
{
return super.toString()+" "+nama;
}
private String nama;
}
