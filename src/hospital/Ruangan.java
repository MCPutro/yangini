/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import java.util.ArrayList;

/**
 *
 * @author Konjem_Family
 */

public class Ruangan {
    private ArrayList<PasienInap> daftarPasien = new ArrayList<>();
    private String kelas;
    private int nomorKamar;
    private int floor;

    public Ruangan(String kelas, int nomorKamar, int floor) {
        this.kelas = kelas;
        this.nomorKamar = nomorKamar;
        this.floor = floor;
    }
    
    public void tambahPasienInap(Pasien p, Dokter d){
        PasienInap pi = new PasienInap(p, d);
        this.daftarPasien.add(pi);
    }
    
    public Pasien getPasien(int i){
        return this.daftarPasien.get(i).getPasien();
    }
    public PasienInap getPasienInap(int i){
        return this.daftarPasien.get(i);
    }
    public void removePasienInap(int i){
        this.daftarPasien.remove(i);
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public int getNomorKamar() {
        return nomorKamar;
    }

    public void setNomorKamar(int nomorKamar) {
        this.nomorKamar = nomorKamar;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor; 
    }
    
    
}
