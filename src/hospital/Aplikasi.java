/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import Database.db;
import java.util.ArrayList;

/**
 *
 * @author Konjem_Family
 */
public class Aplikasi {
    private ArrayList<Dokter> daftarDokter = new ArrayList<>();
    private ArrayList<Pasien> daftarPasien = new ArrayList<>();
    private ArrayList<Ruangan> daftarRuangan = new ArrayList<>();
    private db DB;
        
    public Aplikasi(){
        DB = new db();
//        DB.setConnection();
    }

    public ArrayList<Dokter> getDaftarDokter() {
        return daftarDokter;
    }

    public ArrayList<Pasien> getDaftarPasien() {
        return daftarPasien;
    }

    public ArrayList<Ruangan> getDaftarRuangan() {
        return daftarRuangan;
    }
    
    
    
    public void addDokter(String id, String title, String name, int age, String gender, String speciality, int salary){
        if (getDokter(id) != null) {
            throw new IllegalArgumentException("ID Telah Terpakai!");
        }
        Dokter d = new Dokter(id, title, name, age, gender, speciality, salary);
        daftarDokter.add(d);
//        DB.saveDokter(d);
    }
    
    public Dokter getDokter(String id) {
        for (Dokter d : daftarDokter) {
            if (d.getId().equals(id)) {
                return d;
            }
        }
        return null;
    }
    
    public void showDataDokter(){
        for (Dokter dokter:daftarDokter){
            System.out.println("Nama Dokter : " + dokter.getGender() + dokter.getName());
        }
    }
    
    public void deleteDataDokter(int i){
        daftarDokter.remove(i);
    }
    
    public void addPasien(String id, String title, String name, int age, String gender, String disease, String bloodType){
        if (getPasien(id) != null) {
            throw new IllegalArgumentException("ID Telah Terpakai!");
        }
        Pasien p = new Pasien(id, title, name, age, gender, disease, bloodType);
        daftarPasien.add(p);
//        DB.savePasien(p);
    }
    
    public Pasien getPasien(String id) {
        for (Pasien p : daftarPasien) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }
    
    public void showDataPasien(){
        for (Pasien pasien:daftarPasien){
            System.out.println(pasien.getGender() + " Nama Pasien : " + pasien.getName() + ", Umur : " + pasien.getAge() + ", Penyakit" + pasien.getDisease());
        }
    }
    
    public void deleteDataPasien(int i){
        daftarPasien.remove(i);
    }
    
    public void addRuangan(String kelas, int nomorKamar, int floor ){
        Ruangan r = new Ruangan(kelas, nomorKamar, floor);
        this.daftarRuangan.add(r);
    }
    
    public void showDataRuangan(){
        for (Ruangan ruangan: daftarRuangan){
            System.out.println("Kelas : "+ ruangan.getClass() + ", Lantai : " + ruangan.getFloor() + ", Nomor : " + ruangan.getNomorKamar());
        }
    }
    
    public void deleteDataRuangan(int i){
        daftarRuangan.remove(i);
    }
    
    //add pasien inap
    public void PasienInap(int idxruangan,int idxdok,int idxpsn){
        this.daftarRuangan.get(idxruangan).tambahPasienInap(daftarPasien.get(idxpsn), daftarDokter.get(idxdok));
        
    }
    //update dokter di pasien inap
    public void ngesetDokter(int idxdktr1, int idxruangan, int idxpsn1){
        Dokter d= this.daftarDokter.get(idxdktr1);
        this.daftarRuangan.get(idxruangan).getPasienInap(idxpsn1).setDokter(d);
    }
    
}