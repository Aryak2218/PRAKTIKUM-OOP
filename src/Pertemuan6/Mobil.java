/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan6;

/**
 *
 * @author aryakk
 */
public class Mobil extends Kendaraan{
    private String model;
    private boolean engineStarted;

    public Mobil(String merk, String warna, String model) {
        super(merk, warna);
        this.model = model;
        this.engineStarted = false;
    }
    @Override
    public void kendaraanInfo() {
        System.out.println(warna + " " + merk + " " + model);
    }
    @Override
    public void startEngine() {
        if (!engineStarted) {
            System.out.println("Mobil dihidupkan.");
            engineStarted = true;
        } else {
            System.out.println("Mobil Berjalan.");
        }
    }
    @Override
    public void stopEngine() {
        if (engineStarted) {
            System.out.println("Mobil dimatikan.");
            engineStarted = false;
        } else {
            System.out.println("Mobil Berhenti.");
        }
    }
}
