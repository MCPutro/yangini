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
public class PasienInap {
    private Pasien pasien;
    private Dokter dokter;
    private ArrayList<String> diagnosa= new ArrayList<>();
    
    public PasienInap(Pasien pasien, Dokter dokter) {
        this.pasien = pasien;
        this.dokter = dokter;
    }
    
    public void setDokter (Dokter d){
        this.dokter = d;
    }
    
    public void addDiagnosa (String d){
        this.diagnosa.add(d);
    }
    
    public String getDiagnosa(int x){
        return this.diagnosa.get(x);
    }
    
    public void deleteDiagnosa(int x){
        this.diagnosa.remove(x);
    }

    public Pasien getPasien() {
        return pasien;
    }

    public Dokter getDokter() {
        return dokter;
    }
      
}
