/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan6;

/**
 *
 * @author aryakk
 */
public abstract class Kendaraan {
    protected String merk;
    protected String warna;

    public Kendaraan(String merk, String warna) {
        this.merk = merk;
        this.warna = warna;
    }
    public abstract void kendaraanInfo();
    public abstract void startEngine();
    public abstract void stopEngine();
}

