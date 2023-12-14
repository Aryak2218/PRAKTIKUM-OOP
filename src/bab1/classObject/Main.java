/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bab1.classObject;

/**
 *
 * @author aryakk
 */
public class Main {
    public static void main(String[]args) {
// membuat objek
Kendaraan mobil = new Kendaraan();
mobil.nama = "Mobil";
mobil.warna = "Merah";
mobil.merk = "Toyota";
System.out.println("Warna Kendaraan "+ mobil.nama);
System.out.println("Warna Kendaraan "+ mobil.warna);
System.out.println("Merek Kendaraan "+ mobil.merk);
System.out.println("Jumlah Roda"+ mobil.jmlRoda(4) + "\n");
System.out.println("Cara kendaraan bergerak : ");
System.out.println("Saat maju : "); 
mobil.kendaraanMaju();
System.out.println("Saat mundur:"); 
mobil. kendaraanMundur ();
System.out.println("Saat berhenti: "+ mobil.nama);
 mobil.kendaraanBerhenti();
    }
}
