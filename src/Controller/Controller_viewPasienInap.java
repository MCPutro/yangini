/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.ViewPasienInap;
import hospital.Aplikasi;
import hospital.Dokter;
import hospital.Pasien;
import hospital.Ruangan;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author Muh Ikhdar Isnan
 */
public class Controller_viewPasienInap extends MouseAdapter implements ActionListener {
    private ArrayList<Dokter> daftarDokter = new ArrayList<>();
    private ArrayList<Pasien> daftarPasien = new ArrayList<>();
    private ArrayList<Ruangan> daftarRuangan = new ArrayList<>();
    private ViewPasienInap view;
    private Aplikasi app;

    public Controller_viewPasienInap(Aplikasi app) {
        this.app = app;
        view = new ViewPasienInap();
        view.setVisible(true);
        view.addActionListener(this);
        view.addMouseAdapter(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        nah ini saya bingung bang, soalnya bakal ngeluarin data2 yg beda dari 3 kelas
    }
    public void mousePressed(MouseEvent me){
        Object source = me.getSource();
        if (source.equals(view.getListPInap())){
            int i = view.getSelectedPInap();
            view.setTextPInap(toString());
        }
    }
    
}
